/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.pojo;

/**
 *
 * @author acer
 */
public class Transaksi {

    private int idTransaksi;
    private int jumlah;
    private int totalHarga;
    private String namaPelanggan;
    Pelanggan pelanggan;

    public Transaksi() {
    }

    public Transaksi(int idTransaksi, int jumlah, int totalHarga, String namaPelanggan, Pelanggan pelanggan) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.namaPelanggan = namaPelanggan;
        this.pelanggan = pelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

}
