/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;

import com.TugasBesar.pojo.Dokter;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.TugasBesar.service.DokterService;

/**
 *
 * @author Kurnia R. Putra
 */
public class DokterServiceImpl implements DokterService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Dokter> findAll() {
        List<Dokter> listDokter = new ArrayList<>();
        String sql = "SELECT * FROM dokter";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Dokter dokter = new Dokter();
                dokter.setId(rs.getInt("id"));
                dokter.setNama(rs.getString("nama"));
                dokter.setUmur(rs.getInt("umur"));
                dokter.setAlamat(rs.getString("alamat"));
                dokter.setJadwalKonsultasi(rs.getString("jadwal_konsultasi"));

                listDokter.add(dokter);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return listDokter;
    }

    @Override
    public Integer create(Dokter object) {
        int result = 0;
        String sql = "INSERT INTO dokter(nama, umur, jenis_kelamin, "
                + "departemen, nomor_telepon, alamat, tanggal_lahir) "
                + "VALUES('" + object.getNama() + "', "
                + "" + object.getUmur() + ", "
                + "'" + object.getAlamat() + "')";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Dokter object) {
        int result = 0;
        String sql = "UPDATE dokter SET jadwal_konsultasi='" + object.getJadwalKonsultasi() + "'"
                + " WHERE id= " + object.getId() + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Dokter findById(int id) {
        Dokter dokter = null;
        String sql = "SELECT * FROM dokter WHERE id=" + id + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                dokter = new Dokter();
                dokter.setId(rs.getInt("id"));
                dokter.setNama(rs.getString("nama"));
                dokter.setUmur(rs.getInt("umur"));
                dokter.setAlamat(rs.getString("alamat"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return dokter;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM dokter WHERE id=" + id + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
