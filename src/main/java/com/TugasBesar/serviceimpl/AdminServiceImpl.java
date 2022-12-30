/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;

import com.TugasBesar.pojo.Admin;
import com.TugasBesar.pojo.Akun;
import com.TugasBesar.service.AdminService;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kurnia R. Putra
 */
public class AdminServiceImpl implements AdminService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public Admin login(String username, String password) {
        Admin admin = null;
        Akun akun = null;
        String sql = "SELECT admin.id, admin.nama, "
                + "akun.id, akun.email, akun.username, akun.level "
                + "FROM admin, akun "
                + "WHERE admin.id = akun.id "
                + "AND akun.username = '" + username + "' "
                + "AND akun.password = '" + password + "'";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                admin = new Admin();
                admin.setId(rs.getInt("id"));
                admin.setNama(rs.getString("nama"));
                akun = new Akun();
                akun.setId(rs.getInt("id"));
                akun.setEmail(rs.getString("email"));
                akun.setUsername(rs.getString("username"));
                akun.setLevel(rs.getString("level"));
                admin.setAkun(akun);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return admin;
    }

    @Override
    public Integer register(String username, String password) {
        int result = 0;
        String sql = "INSERT INTO akun(email, username, password, level) "
                + "VALUES('" + username + "@gmail.com" + "', "
                + "'" + username + "', "
                + "'" + password + "', "
                + "'" + "admin" + "')";

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
    public List<Admin> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer create(Admin object) {
        int result = 0;
        String sql = "INSERT INTO admin (nama) "
                + "VALUES('" + object.getNama() + "')";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    

    @Override
    public Integer update(Admin object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Admin findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
