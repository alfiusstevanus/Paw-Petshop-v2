package com.TugasBesar.view;

import com.TugasBesar.pojo.Admin;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Admin admin;

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Menu(Admin admin) {
        this.admin = admin;
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
    }

    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }

    public void loadData() {
        txtAdmin.setText(admin.getNama());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnAdmin = new javax.swing.JButton();
        btnAdmin1 = new javax.swing.JButton();
        btnAdmin2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAdmin3 = new javax.swing.JButton();
        btnAdmin4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Menu");

        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin.setText("BARANG");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnAdmin1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin1.setText("LAPORAN");
        btnAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin1ActionPerformed(evt);
            }
        });

        btnAdmin2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin2.setText("TRANSAKSI");
        btnAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("DAFTAR MENU");

        btnAdmin3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin3.setText("LOGOUT");
        btnAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin3ActionPerformed(evt);
            }
        });

        btnAdmin4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin4.setText("KONSULTASI");
        btnAdmin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Hai,");

        txtAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAdmin.setForeground(new java.awt.Color(0, 102, 255));
        txtAdmin.setText("admin");

        jMenu3.setText("Menu");

        jMenuItem1.setText("Kembali");
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdmin3)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdmin)
                .addGap(162, 162, 162)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtAdmin))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btnAdmin3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        CRUDBarang crud = new CRUDBarang();
        crud.setVisible(true);
        close();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin1ActionPerformed
        Pembukuan pembukuan = new Pembukuan();
        pembukuan.setVisible(true);
        close();
    }//GEN-LAST:event_btnAdmin1ActionPerformed

    private void btnAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin2ActionPerformed
        InfoPelanggan info = new InfoPelanggan();
        info.setVisible(true);
        close();
    }//GEN-LAST:event_btnAdmin2ActionPerformed

    private void btnAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin3ActionPerformed
        LoginFormAdmin loginAdmin = new LoginFormAdmin();

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin ingin Logout? ", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            loginAdmin.setVisible(true);
            close();
        }
    }//GEN-LAST:event_btnAdmin3ActionPerformed

    private void btnAdmin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin4ActionPerformed
        Konsultasi konsul = new Konsultasi();
        konsul.setVisible(true);
        close();
    }//GEN-LAST:event_btnAdmin4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAdmin1;
    private javax.swing.JButton btnAdmin2;
    private javax.swing.JButton btnAdmin3;
    private javax.swing.JButton btnAdmin4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel txtAdmin;
    // End of variables declaration//GEN-END:variables
}