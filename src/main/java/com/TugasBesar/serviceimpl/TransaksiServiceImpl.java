/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TugasBesar.serviceimpl;

import com.TugasBesar.pojo.Pelanggan;
import com.TugasBesar.pojo.Transaksi;
import com.TugasBesar.service.TransaksiService;
import com.TugasBesar.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class TransaksiServiceImpl implements TransaksiService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Transaksi> findAll() {
        List<Transaksi> listTransaksi = new ArrayList<>();
        String sql = "SELECT * FROM transaksi";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Transaksi transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
                transaksi.setNamaPelanggan(rs.getString("nama_pelanggan"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));

                listTransaksi.add(transaksi);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return listTransaksi;
    }

    @Override
    public Integer create(Transaksi object) {
        int result = 0;
        String sql = "INSERT INTO transaksi (nama_pelanggan,total_harga) "
                + "VALUES('" + object.getNamaPelanggan() + "', "
                + "" + object.getTotalHarga() + ")";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Integer update(Transaksi object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transaksi findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
