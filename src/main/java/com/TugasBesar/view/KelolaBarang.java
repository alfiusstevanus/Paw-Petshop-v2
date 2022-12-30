package com.TugasBesar.view;

import com.TugasBesar.pojo.Barang;
import com.TugasBesar.service.BarangService;
import com.TugasBesar.serviceimpl.BarangServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class KelolaBarang extends javax.swing.JFrame {

    BarangService barangService;
    Barang barang;
    List<Barang> listBarang = new ArrayList<>();

    public KelolaBarang() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
    }

    private void loadData() {
        barangService = new BarangServiceImpl();
        listBarang = barangService.findAll();
        Object[][] objectBarang = new Object[listBarang.size()][6];

        int counter = 0;
        for (Barang barang : listBarang) {
            objectBarang[counter][0] = barang.getId();
            objectBarang[counter][1] = barang.getNama();
            objectBarang[counter][2] = barang.getHarga();
            objectBarang[counter][3] = barang.getStok();
            objectBarang[counter][4] = barang.getJenisHewan();
            objectBarang[counter][5] = barang.getKategori();
            counter++;
        }
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
                objectBarang,
                new String[]{
                    "ID", "Nama Barang", "Harga", "Stok", "Jenis Hewan", "Kategori"
                }
        ));
    }

    private void loadData(Barang barang) {
        Object[][] objectBarang = new Object[1][6];

        objectBarang[0][0] = barang.getId();
        objectBarang[0][1] = barang.getNama();
        objectBarang[0][2] = barang.getHarga();
        objectBarang[0][3] = barang.getStok();
        objectBarang[0][4] = barang.getJenisHewan();
        objectBarang[0][5] = barang.getKategori();

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
                objectBarang,
                new String[]{
                    "ID", "Nama Barang", "Harga", "Stok", "Jenis Hewan", "Kategori"
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

        groupHewan = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        radioAnjing = new javax.swing.JRadioButton();
        radioKucing = new javax.swing.JRadioButton();
        radioKelinci = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        brnPrint = new javax.swing.JButton();
        brnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Barang");
        setBackground(new java.awt.Color(102, 102, 255));

        jPanel3.setBackground(new java.awt.Color(202, 151, 124));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ID :");

        jPanel1.setBackground(new java.awt.Color(192, 162, 156));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Harga ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Stok ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nama Barang ");

        txtStok.setEditable(false);

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jenis Hewan");

        comboKategori.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piih Kategori", "Keberseihan", "Perlengkapan", "Makanan", "Kesehatan", "Kebutuhan" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Kategori");

        groupHewan.add(radioAnjing);
        radioAnjing.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioAnjing.setText("Anjing");
        radioAnjing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAnjingActionPerformed(evt);
            }
        });

        groupHewan.add(radioKucing);
        radioKucing.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioKucing.setText("Kucing");
        radioKucing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioKucingActionPerformed(evt);
            }
        });

        groupHewan.add(radioKelinci);
        radioKelinci.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioKelinci.setText("Kelinci");
        radioKelinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioKelinciActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/acer/Documents/Kuliah/Semester_3/ISB%20205%20-%20Pemrograman%20Berorientasi%20Obyek/tugasBesar/TugasBesar/src/main/java/com/TugasBesar/icon/cat (1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\dog.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\rabbit.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioKucing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(radioAnjing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(radioKelinci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(radioKucing)
                                .addComponent(radioKelinci))
                            .addComponent(jLabel11)))
                    .addComponent(jLabel2)
                    .addComponent(radioAnjing)
                    .addComponent(jLabel10))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(192, 162, 156));

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\plus.png")); // NOI18N
        btnSave.setText("ADD");
        btnSave.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        brnPrint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        brnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\printer.png")); // NOI18N
        brnPrint.setText("PRINT");
        brnPrint.setMargin(new java.awt.Insets(4, 14, 4, 14));
        brnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnPrintActionPerformed(evt);
            }
        });

        brnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        brnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\clear.png")); // NOI18N
        brnClear.setText("CLEAR");
        brnClear.setMargin(new java.awt.Insets(4, 14, 4, 14));
        brnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnClearActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\updated.png")); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\delete.png")); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRefresh1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\previous.png")); // NOI18N
        btnRefresh1.setText("KEMBALI");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\refresh.png")); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\Kuliah\\Semester_3\\ISB 205 - Pemrograman Berorientasi Obyek\\tugasBesar\\TugasBesar\\src\\main\\java\\com\\TugasBesar\\icon\\search.png")); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setText("Search by ID");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(brnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(brnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(brnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(brnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Barang", "Harga", "Stok", "Jenis Hewan", "Kategori"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("KELOLA BARANG");

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtId.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int id;
        Barang searchedBarang = new Barang();

        if (txtSearch.getText().equals("Search by ID")) {
            JOptionPane.showMessageDialog(null, "Masukan ID terlebih dahulu !");
        } else {
            id = Integer.parseInt(txtSearch.getText());
            searchedBarang = barangService.findById(id);
            if (searchedBarang != null) {
                loadData(searchedBarang);
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String nama, jenisHewan, kategori;
        int harga;

        barangService = new BarangServiceImpl();
        radioAnjing.setActionCommand("Anjing");
        radioKucing.setActionCommand("Kucing");
        radioKelinci.setActionCommand("Kelinci");

        ButtonModel selectButton = groupHewan.getSelection();

        if (txtNama.getText().equals("") | txtHarga.getText().equals("") | comboKategori.getSelectedIndex() == 0 | selectButton == null) {
            JOptionPane.showMessageDialog(null, "Isi seluruh Data terlebih dahulu!");
        } else {
            jenisHewan = selectButton.getActionCommand();
            nama = txtNama.getText();
            harga = Integer.parseInt(txtHarga.getText());
            kategori = comboKategori.getSelectedItem().toString();

            barang = new Barang();
            barang.setNama(nama);
            barang.setHarga(harga);
            barang.setJenisHewan(jenisHewan);
            barang.setKategori(kategori);

            barangService.create(barang);
            JOptionPane.showMessageDialog(null, "Data Barang berhasil di Tambah");
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void brnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnPrintActionPerformed
        MessageFormat header = new MessageFormat("Daftar Data Barang");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabelBarang.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_brnPrintActionPerformed

    private void brnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnClearActionPerformed
        emptyField();
    }//GEN-LAST:event_brnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String nama, jenisHewan, kategori;
        int id = 0, harga = 0, stok = 0;
        barangService = new BarangServiceImpl();

        radioAnjing.setActionCommand("Anjing");
        radioKucing.setActionCommand("Kucing");
        radioKelinci.setActionCommand("Kelinci");

        ButtonModel selectButton = groupHewan.getSelection();

        if (txtNama.getText().equals("") | txtHarga.getText().equals("") | txtStok.getText().equals("") | comboKategori.getSelectedIndex() == 0 | selectButton == null) {
            JOptionPane.showMessageDialog(null, "Isi seluruh Data terlebih dahulu!");
        } else {
            jenisHewan = selectButton.getActionCommand();

            id = Integer.parseInt(txtId.getText());
            nama = txtNama.getText();
            harga = Integer.parseInt(txtHarga.getText());
            kategori = comboKategori.getSelectedItem().toString();
            stok = Integer.parseInt(txtStok.getText());

            barang = new Barang();
            barang.setId(id);
            barang.setNama(nama);
            barang.setHarga(harga);
            barang.setStok(stok);
            barang.setKategori(kategori);
            barang.setJenisHewan(jenisHewan);

            barangService.update(barang);
            JOptionPane.showMessageDialog(null, "Data Barang berhasil di Update");
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void emptyField() {
        txtId.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        groupHewan.clearSelection();
        comboKategori.setSelectedIndex(0);
        txtJenisHewan = "";
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id;
        barangService = new BarangServiceImpl();
        ButtonModel selectButton = groupHewan.getSelection();

        if (txtNama.getText().equals("") | txtHarga.getText().equals("") | txtStok.getText().equals("") | comboKategori.getSelectedIndex() == 0 | selectButton == null) {
            JOptionPane.showMessageDialog(null, "Isi seluruh Data terlebih dahulu!");
        } else {

            id = Integer.parseInt(txtId.getText());

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus Barang ini ? ", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                barangService.delete(id);
                loadData();
                emptyField();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadData();
        txtSearch.setText("Search by ID");
        emptyField();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        String nama, jenisHewan, kategori;
        int id, harga, stok;
        int row = tabelBarang.getSelectedRow();

        id = Integer.parseInt(tabelBarang.getValueAt(row, 0).toString());
        nama = tabelBarang.getValueAt(row, 1).toString();
        harga = Integer.parseInt(tabelBarang.getValueAt(row, 2).toString());
        stok = Integer.parseInt(tabelBarang.getValueAt(row, 3).toString());
        jenisHewan = tabelBarang.getValueAt(row, 4).toString();
        kategori = tabelBarang.getValueAt(row, 5).toString();

        txtId.setText(id + "");
        txtNama.setText(nama);
        txtHarga.setText(harga + "");
        txtStok.setText(stok + "");
        if (jenisHewan.equals("Kucing")) {
            radioKucing.setSelected(true);
        }
        if (jenisHewan.equals("Anjing")) {
            radioAnjing.setSelected(true);
        }
        if (jenisHewan.equals("Kelinci")) {
            radioKelinci.setSelected(true);
        }
        comboKategori.setSelectedItem(kategori);
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        CRUDBarang crud = new CRUDBarang();
        crud.setVisible(true);
        close();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void radioAnjingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAnjingActionPerformed
        txtJenisHewan = "Anjing";
    }//GEN-LAST:event_radioAnjingActionPerformed

    private void radioKucingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioKucingActionPerformed
        txtJenisHewan = "Kucing";
    }//GEN-LAST:event_radioKucingActionPerformed

    private void radioKelinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioKelinciActionPerformed
        txtJenisHewan = "Kelinci";
    }//GEN-LAST:event_radioKelinciActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaBarang().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnClear;
    private javax.swing.JButton brnPrint;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboKategori;
    private javax.swing.ButtonGroup groupHewan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAnjing;
    private javax.swing.JRadioButton radioKelinci;
    private javax.swing.JRadioButton radioKucing;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
    private String txtJenisHewan;
}
