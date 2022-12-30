package com.TugasBesar.view;

import com.TugasBesar.pojo.Barang;
import com.TugasBesar.pojo.Transaksi;
import com.TugasBesar.service.BarangService;
import com.TugasBesar.service.TransaksiService;
import com.TugasBesar.serviceimpl.BarangServiceImpl;
import com.TugasBesar.serviceimpl.TransaksiServiceImpl;
import com.TugasBesar.utilities.ConnectionManager;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KeranjangBelanja extends javax.swing.JFrame {
    
    private ConnectionManager conMan;
    private Connection conn;

    String nama = "";
    ArrayList<Integer> listKeranjang = new ArrayList<>();
    ArrayList<Integer> listJumlah = new ArrayList<>();

    Statement stmt;
    BarangService barangService;
    TransaksiService transaksiService = new TransaksiServiceImpl();
    Transaksi transaksi = new Transaksi();

    Struk struk;

    List<Barang> listBarang = new ArrayList<>();
    Integer[] id = new Integer[listKeranjang.size()];
    Integer[] jumlah = new Integer[listJumlah.size()];
    int total = 0;
    int totalBayar = 0;
    int nominal = 0;

    public KeranjangBelanja() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public KeranjangBelanja(ArrayList listJumlah, ArrayList listKeranjang, String nama) {
        this.nama = nama;
        this.listKeranjang = listKeranjang;
        this.listJumlah = listJumlah;
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
    }

    private void loadData() {
        barangService = new BarangServiceImpl();
        id = listKeranjang.toArray(id);
        jumlah = listJumlah.toArray(jumlah);

        for (Integer x : id) {
            listBarang.add(barangService.findById(x));
        }

        Object[][] objectBarang = new Object[listBarang.size()][5];

        int counter = 0;
        for (Barang barang : listBarang) {
            total = jumlah[counter] * barang.getHarga();
            objectBarang[counter][0] = barang.getId();
            objectBarang[counter][1] = barang.getNama();
            objectBarang[counter][2] = jumlah[counter];
            objectBarang[counter][3] = barang.getHarga();
            objectBarang[counter][4] = total;
            totalBayar = totalBayar + total;
            counter++;
        }
        txtTotalBayar.setText("Rp. " + totalBayar);
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
                objectBarang,
                new String[]{
                    "Id", "Nama", "Jumlah", "Harga", "Total"
                }
        ));
    }

    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        group_gender = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_background = new javax.swing.JPanel();
        panel_header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        txtNominal = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnLanjut1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel1.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Keranjang Belanja");
        setUndecorated(true);
        setResizable(false);

        panel_background.setBackground(new java.awt.Color(202, 151, 124));

        panel_header.setBackground(new java.awt.Color(192, 162, 156));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("KERANJANG BELANJA");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\trolley.png")); // NOI18N

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5))
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2))
        );

        jPanel2.setBackground(new java.awt.Color(192, 162, 156));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL: ");

        txtTotalBayar.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalBayar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalBayar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalBayar.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalBayar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalBayar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Jumlah", "Harga", "Total"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelBarang);

        txtNominal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNominal.setText("Masukan Nominal");
        txtNominal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNominalMouseClicked(evt);
            }
        });

        btnBayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBayar.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\banknote.png")); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NOMINAL UANG:");

        btnLanjut1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLanjut1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\previous.png")); // NOI18N
        btnLanjut1.setText("KEMBALI");
        btnLanjut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_backgroundLayout = new javax.swing.GroupLayout(panel_background);
        panel_background.setLayout(panel_backgroundLayout);
        panel_backgroundLayout.setHorizontalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel_backgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLanjut1)
                    .addGroup(panel_backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBayar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_backgroundLayout.setVerticalGroup(
            panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(btnLanjut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        String nama, jenisKelamin, departemen, nomorTelepon, alamat;
        int id, umur;

        int row = tabelBarang.getSelectedRow();
        id = Integer.parseInt(tabelBarang.getValueAt(row, 0).toString());
        nama = tabelBarang.getValueAt(row, 1).toString();
        umur = Integer.parseInt(tabelBarang.getValueAt(row, 2).toString());
        jenisKelamin = tabelBarang.getValueAt(row, 3).toString();
        departemen = tabelBarang.getValueAt(row, 4).toString();
        nomorTelepon = tabelBarang.getValueAt(row, 5).toString();
        alamat = tabelBarang.getValueAt(row, 6).toString();
    }//GEN-LAST:event_tabelBarangMouseClicked

    public Integer update(Barang barang, int id, int jumlah) {
        int result = 0;
        String sql = "UPDATE barang SET stok=" + (barang.getStok() - jumlah)
                + " WHERE id=" + id + "";
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

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        int counter = 0;

        if (txtNominal.getText().equals("Masukan Nominal") | txtNominal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan nominal uang terlebih dahulu!");
        } else {
            for (Barang barang : listBarang) {
                update(barang, id[counter], jumlah[counter]);
                counter++;
            }
            nominal = Integer.parseInt(txtNominal.getText());
            if (nominal >= totalBayar) {
                struk = new Struk(totalBayar, nominal, nama);
                struk.setVisible(true);
                close();
            } else {
                JOptionPane.showMessageDialog(null, "Nominal Uang Yang Anda Masukkan Tidak Cukup !");
            }
            transaksi.setNamaPelanggan(nama);
            transaksi.setTotalHarga(totalBayar);
            transaksiService.create(transaksi);
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtNominalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNominalMouseClicked
        txtNominal.setText("");
    }//GEN-LAST:event_txtNominalMouseClicked

    private void btnLanjut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjut1ActionPerformed
        TransaksiBelanja transaksi = new TransaksiBelanja();
        transaksi.setVisible(true);
        close();
    }//GEN-LAST:event_btnLanjut1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KeranjangBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeranjangBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeranjangBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeranjangBelanja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeranjangBelanja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnLanjut1;
    private javax.swing.ButtonGroup group_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_background;
    private javax.swing.JPanel panel_header;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtNominal;
    private javax.swing.JLabel txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
