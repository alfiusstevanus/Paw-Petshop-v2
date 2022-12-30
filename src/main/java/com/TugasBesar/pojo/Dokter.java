/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.pojo;

/**
 *
 * @author acer
 */
public class Dokter {

    private Integer id;
    private String nama;
    private String jadwalKonsultasi;
    private int umur;
    private String alamat;
    private Akun akun;
    private boolean loginStatus;

    public Dokter() {
    }

    public Dokter(Integer id, String nama, String jadwalKonsultasi, int umur, String alamat, Akun akun, boolean loginStatus) {
        this.id = id;
        this.nama = nama;
        this.jadwalKonsultasi = jadwalKonsultasi;
        this.umur = umur;
        this.alamat = alamat;
        this.akun = akun;
        this.loginStatus = loginStatus;
    }

    public String getJadwalKonsultasi() {
        return jadwalKonsultasi;
    }

    public void setJadwalKonsultasi(String jadwalKonsultasi) {
        this.jadwalKonsultasi = jadwalKonsultasi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

}
