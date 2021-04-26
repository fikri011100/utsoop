package com.bmcc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        String Username, usernameInput, passwordInput;
        String Password;
        ArrayList<Tilanglist> Tilanglist = new ArrayList<>();
        Scanner optionObj = new Scanner(System.in);

        Password = "123";
        Username = "123";

        do {
            System.out.println("*****LOGIN******");
            Scanner input1 = new Scanner(System.in);
            System.out.println("Masukkan Username : ");
            usernameInput = input1.nextLine();

            System.out.println("Masukkan Password : ");
            passwordInput = input1.nextLine();
        } while (!usernameInput.equals(Username) && !passwordInput.equals(Password));

        do {
            System.out.println("===============================");
            System.out.println("E-TILANG : KOTA WARNA WARNI     ");
            System.out.println("===============================");
            System.out.println("1. Input Data Pelanggar");
            System.out.println("2. Tampilkan Data Pelanggar");
            System.out.println("3. Cetak Surat Tilang ");
            System.out.println("4. Logout");
            System.out.println("===============================");
            System.out.println("Pilihan : ");
            choice = optionObj.nextInt();
            switch (choice) {
                case 1:
                    addpelanggaran(Tilanglist);
                    break;
                case 2:
                    showData(Tilanglist);
                    break;
                case 3 :
                    suratTilang(Tilanglist);
            }
        } while (choice != 4);
    }

    private static void suratTilang(ArrayList<Tilanglist> tilanglist) {
        int tilang;
        Scanner surat = new Scanner(System.in);
        String[] jenispel = {
                "Menggunakan Gawai / Handphone saat berkendara",
                "Tidak memakai helm",
                "Tidak memakai sabuk pengaman",
                "Melanggar rambu lalu lintas dan marka jalan",
                "Memakai plat nomor palsu",
        };
        int[] hargapel = {
                750000,
                250000,
                250000,
                500000,
                500000,
        };

        showData(tilanglist);
        System.out.println("Pilih ID Tilang : ");
        tilang = surat.nextInt() - 1;
        Tilanglist t = tilanglist.get(tilang);
        System.out.println("Nama : " + t.getNama());
        System.out.println("Alamat : " + t.getAlamat());
        System.out.println("NIK : " + t.getNik());
        System.out.println("email : " + t.getEmail());
        System.out.println("notelp : " + t.getNomortelpon());
        System.out.println("jenis kendaraan : " + t.getJeniskendaraan());
        System.out.println("tipe kendaraan : " + t.getTipekendaraan());
        System.out.println("tipe pelanggaran : ");
        for (int a = 0; a < t.getJp().size(); a++) {
            System.out.println("pelanggaran ke " + (a + 1) + " = " + jenispel[a]);
            System.out.println("biaya denda " + (a + 1) + " = " + hargapel[a]);
            System.out.println("=============================================");
        }
    }

    private static void showData(ArrayList<Tilanglist> tilanglist) {
        if (tilanglist != null) {
            for (int i = 0; i < tilanglist.size(); i++) {
                System.out.println("Nama : " + tilanglist.get(i).getNama());
                System.out.println("Alamat : " + tilanglist.get(i).getAlamat());
                System.out.println("NIK : " + tilanglist.get(i).getNik());
                System.out.println("email : " + tilanglist.get(i).getEmail());
                System.out.println("notelp : " + tilanglist.get(i).getNomortelpon());
                System.out.println("jenis kendaraan : " + tilanglist.get(i).getJeniskendaraan());
                System.out.println("tipe kendaraan : " + tilanglist.get(i).getTipekendaraan());
                System.out.println("tipe pelanggaran : ");
                for (int a = 0; a < tilanglist.get(i).getJp().size(); a++) {
                    System.out.println((a + 1) + " = " + tilanglist.get(i).getJp().get(a).noJenis);
                }
            }
        } else {
            System.out.println("There is no cake that has been made yet!");
        }
    }


    private static void addpelanggaran(ArrayList<Tilanglist> tilanglist) {
        String nama, alamat, jeniskendaraan, tipekendaraan, email, choice, nomortelpon, nik;
        int jenispelanggaran ;
        List<JenisPelanggaran> jp = new ArrayList<>();
        Scanner add = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        nama = add.nextLine();
        System.out.print("Masukan Alamat : ");
        alamat = add.nextLine();
        System.out.print("Masukan NIK : ");
        nik = add.nextLine();
        System.out.print("Masukan E-mail : ");
        email = add.nextLine();
        System.out.print("Masukan No.Telpon : ");
        nomortelpon = add.nextLine();

//ketika masukin jenis kendaraan nanti harga pelanggaran bakalan sesuai
        System.out.println("Jenis Kendaraan ");
        System.out.println("1. Roda Dua");
        System.out.println("2. Roda Empat/Lebih");
        jeniskendaraan = add.nextLine();

        System.out.println("Tipe Kendaraan ");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bis");
        System.out.println("4. Truk/Tronton");
        System.out.println("Masukkan  Tipe Kendaraan :");
        tipekendaraan = add.nextLine();

        do {
            System.out.println("Jenis Pelanggaran ");
            System.out.println("1. Menggunakan Gawai / Handphone saat berkendara");
            System.out.println("2. Tidak memakai helm");
            System.out.println("3. Tidak memakai sabuk pengaman");
            System.out.println("4. Melanggar rambu lalu lintas dan marka jalan");
            System.out.println("5. Memakai plat nomor palsu");
            System.out.println("Masukkan  Jenis Pelanggaran :");
            jenispelanggaran = add.nextInt();
            add.nextLine();
            if (jenispelanggaran > 5) {
                choice = "no";
            } else {
                jp.add(new JenisPelanggaran(jenispelanggaran));
                System.out.println("Apakah ada pelanggaran Lain? (yes/no)");
                choice = add.nextLine();
            }
        } while (choice.equals("yes"));

        tilanglist.add(new Tilanglist(nama, alamat, jeniskendaraan, tipekendaraan, email, nik, nomortelpon, jp ));
    }
}
