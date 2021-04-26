package com.bmcc;

import java.util.List;

public class Tilanglist {
    String nama, alamat, jeniskendaraan, tipekendaraan, email, nik, nomortelpon;
    List<JenisPelanggaran> jp;

    public Tilanglist(String nama, String alamat, String jeniskendaraan, String tipekendaraan, String email, String nik, String nomortelpon, List<JenisPelanggaran> jp) {
        this.nama = nama;
        this.alamat = alamat;
        this.tipekendaraan = tipekendaraan;
        this.email = email;
        this.nik = nik;
        this.nomortelpon = nomortelpon;
        this.jeniskendaraan = jeniskendaraan;
        this.jp = jp;
    }

    public List<JenisPelanggaran> getJp() {
        return jp;
    }

    public void setJp(List<JenisPelanggaran> jp) {
        this.jp = jp;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTipekendaraan() {
        return tipekendaraan;
    }

    public void setTipekendaraan(String tipekendaraan) {
        this.tipekendaraan = tipekendaraan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNomortelpon() {
        return nomortelpon;
    }

    public void setNomortelpon(String nomortelpon) {
        this.nomortelpon = nomortelpon;
    }
}


