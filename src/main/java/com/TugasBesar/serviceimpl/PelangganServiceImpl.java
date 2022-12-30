/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;


import com.TugasBesar.pojo.Pelanggan;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.TugasBesar.service.PelangganService;

/**
 *
 * @author Kurnia R. Putra
 */
public class PelangganServiceImpl implements PelangganService {
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Pelanggan> findAll() {
        List<Pelanggan> listPelanggan = new ArrayList<>();
        String sql = "SELECT * FROM pelanggan";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setIdPelanggan(rs.getInt("id"));
                pelanggan.setNama(rs.getString("nama"));
                pelanggan.setAlamat(rs.getString("alamat"));
                pelanggan.setNomorTelepon(rs.getString("no_telp"));

                listPelanggan.add(pelanggan);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return listPelanggan;
    }

    @Override
    public Integer create(Pelanggan object) {
        int result = 0;
        String sql = "INSERT INTO pelanggan (nama, alamat, no_telp) "
                + "VALUES('" + object.getNama() + "', "
                + "'" + object.getAlamat()+ "', "
                + "'" + object.getNomorTelepon()+ "')";

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
    public Integer update(Pelanggan object) {
        int result = 0;
        String sql = "UPDATE pelanggan SET nama='" + object.getNama() + "',"
                + " alamat='" + object.getAlamat()+ "',"
                + " no_telp='" + object.getNomorTelepon()+ "'"
                + " WHERE id=" + object.getIdPelanggan()+ "";

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
    public Pelanggan findById(int id) {
        Pelanggan pelanggan = null;
        String sql = "SELECT * FROM pelanggan WHERE id=" + id + "";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setIdPelanggan(rs.getInt("id"));
                pelanggan.setNama(rs.getString("nama"));
                pelanggan.setAlamat(rs.getString("alamat"));
                pelanggan.setNomorTelepon(rs.getString("no_telp"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(BarangServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return pelanggan;
    }

    @Override
    public Integer delete(int id) {
        int result = 0;
        String sql = "DELETE FROM pelanggan WHERE id=" + id + "";

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
