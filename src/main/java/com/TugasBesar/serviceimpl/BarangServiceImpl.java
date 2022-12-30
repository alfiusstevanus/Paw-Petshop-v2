/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;

import com.TugasBesar.pojo.Barang;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.TugasBesar.service.BarangService;

/**
 *
 * @author Kurnia R. Putra
 */
public class BarangServiceImpl implements BarangService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Barang> findAll() {
        List<Barang> listBarang = new ArrayList<>();
        String sql = "SELECT * FROM barang";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Barang barang = new Barang();
                barang.setId(rs.getInt("id"));
                barang.setNama(rs.getString("nama"));
                barang.setJenisHewan(rs.getString("jenis_hewan"));
                barang.setHarga(rs.getInt("harga"));
                barang.setStok(rs.getInt("stok"));
                barang.setKategori(rs.getString("kategori"));

                listBarang.add(barang);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return listBarang;
    }

    @Override
    public Integer create(Barang object) {
        int result = 0;
        String sql = "INSERT INTO barang(nama, harga, stok, jenis_hewan, kategori) "
                + "VALUES('" + object.getNama() + "', "
                + "" + object.getHarga() + ", "
                + "" + object.getStok()+ ", "
                + "'" + object.getJenisHewan() + "', "
                + "'" + object.getKategori() + "')";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Barang object) {
        int result = 0;
        String sql = "UPDATE barang SET nama='" + object.getNama() + "',"
                + " harga=" + object.getHarga() + ","
                + " stok=" + object.getStok()+ ","
                + " jenis_hewan='" + object.getJenisHewan() + "',"
                + " kategori='" + object.getKategori() + "'"
                + " WHERE id=" + object.getId() + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    

    @Override
    public Barang findById(int id) {
        Barang barang = null;
        String sql = "SELECT * FROM barang WHERE id=" + id + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                barang = new Barang();
                barang.setId(rs.getInt("id"));
                barang.setNama(rs.getString("nama"));
                barang.setJenisHewan(rs.getString("jenis_hewan"));
                barang.setHarga(rs.getInt("harga"));
                barang.setStok(rs.getInt("stok"));
                barang.setKategori(rs.getString("kategori"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return barang;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM barang WHERE id=" + id + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
