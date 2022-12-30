/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.pojo;

/**
 *
 * @author Kurnia R. Putra
 */
public class Admin {

    private String nama;
    private Integer id;
    private boolean loginStatus;
    private Akun akun;

    public Admin() {
    }

    public Admin(String nama, Integer id, boolean loginStatus, Akun akun) {
        this.nama = nama;
        this.id = id;
        this.loginStatus = loginStatus;
        this.akun = akun;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }

   

}
