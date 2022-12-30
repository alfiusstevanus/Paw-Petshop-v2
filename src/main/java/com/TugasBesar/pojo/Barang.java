/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.pojo;

/**
 *
 * @author Kurnia R. Putra
 */
public class Barang {
    private Integer id;
    private String nama;
    private int harga;
    private int stok;
    private String jenisHewan;
    private String kategori;

    public Barang() {
    }

    public Barang(Integer id, String nama, int harga, int stok, String jenisHewan, String kategori) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.jenisHewan = jenisHewan;
        this.kategori = kategori;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    
    
}
