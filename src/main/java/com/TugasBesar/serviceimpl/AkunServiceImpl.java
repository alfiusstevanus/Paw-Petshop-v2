/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;

import com.TugasBesar.pojo.Akun;
import com.TugasBesar.pojo.Dokter;
import com.TugasBesar.service.AkunService;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kurnia R. Putra
 */
public class AkunServiceImpl implements AkunService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public Dokter login(String username, String password) {
        Dokter dokter = null;
        Akun akun = null;
        String sql = "SELECT dokter.id, dokter.nama,dokter.umur,dokter.alamat,dokter.jadwal_konsultasi, "
                + "akun.id, akun.email, akun.username, akun.level "
                + "FROM dokter, akun "
                + "WHERE dokter.id = akun.id "
                + "AND akun.username = '" + username + "' "
                + "AND akun.password = '" + password + "'";

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
                dokter.setJadwalKonsultasi(rs.getString("jadwal_konsultasi"));
                akun = new Akun();
                akun.setId(rs.getInt("id"));
                akun.setEmail(rs.getString("email"));
                akun.setUsername(rs.getString("username"));
                akun.setLevel(rs.getString("level"));
                dokter.setAkun(akun);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return dokter;
    }

    @Override
    public Integer register(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
