package com.TugasBesar.view;

import com.TugasBesar.pojo.Dokter;
import com.TugasBesar.service.DokterService;
import com.TugasBesar.serviceimpl.DokterServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Konsultasi extends javax.swing.JFrame {
    
    DokterService dokterService;
    Dokter dokter;
    
    public Konsultasi() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
        
    }
    
    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    private void emptyField() {
        txtTanggal.setDate(new Date());
        comboDokter.setSelectedIndex(0);
    }
    
    private void loadData() {
        dokterService = new DokterServiceImpl();
        List<Dokter> listDokter = new ArrayList<>();
        listDokter = dokterService.findAll();
        Object[][] objectBarang = new Object[listDokter.size()][5];
        
        int counter = 0;
        for (Dokter dokter : listDokter) {
            objectBarang[counter][0] = dokter.getId();
            objectBarang[counter][1] = dokter.getNama();
            objectBarang[counter][2] = dokter.getUmur();
            objectBarang[counter][3] = dokter.getAlamat();
            objectBarang[counter][4] = dokter.getJadwalKonsultasi();
            counter++;
        }
        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
                objectBarang,
                new String[]{
                    "ID Dokter", "Nama Dokter", "Umur", "Alamat", "Jadwal Konsultasi"
                }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        comboDokter = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnAjukan = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Stok Barang");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("KONSULTASI DOKTER HEWAN");

        btnKembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Dokter", "Nama Dokter", "Umur", "Alamat", "Jadwal Konsultasi"
            }
        ));
        tabelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDokter);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Pilih Dokter :");

        comboDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piih Dokter", "Dr. Sucipto Utomo", "Dr. Sri Rahmawati", "Dr. Joni Subarjo" }));
        comboDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDokterActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Input Tanggal :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Data Dokter :");

        btnAjukan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAjukan.setText("AJUKAN");
        btnAjukan.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAjukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjukanActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_print.setText("KELUAR");
        btn_print.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        jMenu1.setText("Konsultasi");

        jMenuItem1.setText("Kembali");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(189, 189, 189))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_print))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboDokter, 0, 166, Short.MAX_VALUE)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAjukan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(75, 75, 75)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(comboDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjukan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tabelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDokterMouseClicked

    }//GEN-LAST:event_tabelDokterMouseClicked

    private void btnAjukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjukanActionPerformed
        String nama, jadwalKonsultasi = "";
        Date tanggal;
        int id = 0;
        dokterService = new DokterServiceImpl();
        
        tanggal = txtTanggal.getDate();
        if (tanggal != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            jadwalKonsultasi = sdf.format(tanggal);
        }
        
        if (comboDokter.getSelectedIndex() == 0 | txtTanggal.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih Dokter terlebih dahulu!");
        } else {
            nama = comboDokter.getSelectedItem().toString();
            if (nama.equals("Dr. Sucipto Utomo")) {
                id = 1;
            } else if (nama.equals("Dr. Sri Rahmawati")) {
                id = 2;
            } else if (nama.equals("Dr. Joni Subarjo")) {
                id = 3;
            }
            dokter = new Dokter();
            dokter.setNama(nama);
            dokter.setId(id);
            dokter.setJadwalKonsultasi(jadwalKonsultasi);
            
            dokterService.update(dokter);
            JOptionPane.showMessageDialog(null, "Jadwal berhasil diajukan");
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btnAjukanActionPerformed

    private void comboDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDokterActionPerformed

    }//GEN-LAST:event_comboDokterActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar dari Aplikasi ? ", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            close();
        }
    }//GEN-LAST:event_btn_printActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konsultasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjukan;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> comboDokter;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDokter;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables
}
