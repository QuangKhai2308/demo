/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Controller.SanPham;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class menu_banhang extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanly_banhang
     */
    protected ArrayList<SanPham> listSP = new ArrayList<>();
    protected String dbUser = "sa",dbPass="23082001";
    int index = 0;
    
    Connection conn;
    public menu_banhang() {
        initComponents();
        conn = getConnection();
        listSP = fetchListall();
        renderListall(listSP);
        
        listSP = fetchListBalen();
        renderListBalen(listSP);
        
        listSP = fetchListConverse();
        renderListConverse(listSP);
        
        listSP = fetchListMCQueen();
        renderListMCQueen(listSP);
        
        listSP = fetchListVans();
        renderListVans(listSP);
    }
    public Connection getConnection(){
        Connection conn = null;
         String url = "jdbc:sqlserver://localhost:1433;databaseName = QLBH";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(
                url,
                this.dbUser,
                this.dbPass
            );
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAll = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVans = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMC = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCon = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnKH = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnQLHD = new javax.swing.JButton();
        btnDT = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(927, 580));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tblAll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng", "Màu sắc", "Size", "Giá tiền ", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAll.setRowHeight(23);
        jScrollPane1.setViewportView(tblAll);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("All", jPanel2);

        tblVans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng", "Màu sắc", "Size", "Giá tiền", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVans.setRowHeight(23);
        jScrollPane2.setViewportView(tblVans);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Vans", jPanel3);

        tblMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng", "Màu sắc", "Size", "Giá tiền ", "Trạng thái"
            }
        ));
        tblMC.setRowHeight(23);
        jScrollPane3.setViewportView(tblMC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MC Queen", jPanel4);

        tblCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng", "Màu sắc", "Size", "Giá tiền ", "Trạng thái"
            }
        ));
        tblCon.setRowHeight(23);
        jScrollPane4.setViewportView(tblCon);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Convesres", jPanel5);

        tblBal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày nhập", "Loại sản phẩm", "Số lượng", "Màu sắc", "Size", "Giá tiền ", "Trạng thái"
            }
        ));
        tblBal.setRowHeight(23);
        jScrollPane5.setViewportView(tblBal);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Balenciaga", jPanel6);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("SHOP GIAY XINH");

        btnKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guard.png"))); // NOI18N
        btnKH.setText("Khách hàng");
        btnKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHActionPerformed(evt);
            }
        });

        btnTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tk.png"))); // NOI18N
        btnTK.setText("TT hóa đơn");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        btnQLSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/writing.png"))); // NOI18N
        btnQLSP.setText("Quản lý SP");
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });

        btnQLHD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQLHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/supermarket.png"))); // NOI18N
        btnQLHD.setText("Quản lý HĐ");
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });

        btnDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sinusoid.png"))); // NOI18N
        btnDT.setText("Doanh thu");
        btnDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDTActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter.png"))); // NOI18N
        jButton6.setText("Đăng xuất");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/shoes.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/advertising.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delivery.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Địa chỉ: Tòa nhà FPT Polytechnic, Phố Trịnh Văn Bô, Nam Từ Liêm, Hà Nội");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telephone: 02223456789");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telephone: 02223456789");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnQLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnQLHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDT, btnKH, btnQLHD, btnQLSP, btnTK, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnKH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDT, btnKH, btnQLHD, btnQLSP, btnTK, jButton6});

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     protected void renderListall(ArrayList<SanPham> data){
        DefaultTableModel modelall = (DefaultTableModel) this.tblAll.getModel();
        modelall.setRowCount(0);
        for(int i =0 ;i < data.size(); i++){
            SanPham sp = data.get(i);
            modelall.addRow(new Object[]{
                sp.getID_SP(),
                sp.getTen_SP(),
                sp.getNgaynhap(),
                sp.getLoai_SP(),
                sp.getSoLuong(),
                sp.getMauSac(),
                sp.getSize(),
                sp.getGiaTien(),
                sp.getTrangThai()
            });
        }
    }
    protected ArrayList<SanPham> fetchListall() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "SELECT * FROM SANPHAM";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ID_SP = rs.getNString("ID_SP");
                String Ten_SP = rs.getNString("TEN_SP");
                String Loai_SP = rs.getNString("LOAI_SP");
                String MauSac = rs.getNString("MAUSAC");
                int Size = rs.getInt("SIZE");
                String Image = rs.getString("IMAGES");
                double GiaBan = rs.getDouble("GIABAN");
                String NgayNhap = rs.getString("NGNHAP");
                int SoLuong = rs.getInt("SOLUONG");
                String TrangThai = rs.getNString("TRANGTHAI");

                SanPham sp = new SanPham(ID_SP, Ten_SP, Loai_SP, MauSac, Size, Image, GiaBan, NgayNhap, SoLuong, TrangThai);
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    protected void renderListBalen(ArrayList<SanPham> data){
        DefaultTableModel modelsneaker = (DefaultTableModel) this.tblBal.getModel();
        modelsneaker.setRowCount(0);
        for(int i =0 ;i < data.size(); i++){
            SanPham sp = data.get(i);
            modelsneaker.addRow(new Object[]{
                sp.getID_SP(),
                sp.getTen_SP(),
                sp.getNgaynhap(),
                sp.getLoai_SP(),
                sp.getSoLuong(),
                sp.getMauSac(),
                sp.getSize(),
                sp.getGiaTien(),
                sp.getTrangThai()
            });
        }
    }
    protected ArrayList<SanPham> fetchListBalen() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "SELECT * FROM SANPHAM WHERE LOAI_SP like 'Balenciaga'";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ID_SP = rs.getNString("ID_SP");
                String Ten_SP = rs.getNString("TEN_SP");
                String Loai_SP = rs.getNString("LOAI_SP");
                String MauSac = rs.getNString("MAUSAC");
                int Size = rs.getInt("SIZE");
                String Image = rs.getString("IMAGES");
                double GiaBan = rs.getDouble("GIABAN");
                String NgayNhap = rs.getString("NGNHAP");
                int SoLuong = rs.getInt("SOLUONG");
                String TrangThai = rs.getNString("TRANGTHAI");

                SanPham sp = new SanPham(ID_SP, Ten_SP, Loai_SP, MauSac, Size, Image, GiaBan, NgayNhap, SoLuong, TrangThai);
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    protected void renderListConverse(ArrayList<SanPham> data){
        DefaultTableModel modelsneaker = (DefaultTableModel) this.tblCon.getModel();
        modelsneaker.setRowCount(0);
        for(int i =0 ;i < data.size(); i++){
            SanPham sp = data.get(i);
            modelsneaker.addRow(new Object[]{
                sp.getID_SP(),
                sp.getTen_SP(),
                sp.getNgaynhap(),
                sp.getLoai_SP(),
                sp.getSoLuong(),
                sp.getMauSac(),
                sp.getSize(),
                sp.getGiaTien(),
                sp.getTrangThai()
            });
        }
    }
    protected ArrayList<SanPham> fetchListConverse() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "SELECT * FROM SANPHAM WHERE LOAI_SP like 'Converse'";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ID_SP = rs.getNString("ID_SP");
                String Ten_SP = rs.getNString("TEN_SP");
                String Loai_SP = rs.getNString("LOAI_SP");
                String MauSac = rs.getNString("MAUSAC");
                int Size = rs.getInt("SIZE");
                String Image = rs.getString("IMAGES");
                double GiaBan = rs.getDouble("GIABAN");
                String NgayNhap = rs.getString("NGNHAP");
                int SoLuong = rs.getInt("SOLUONG");
                String TrangThai = rs.getNString("TRANGTHAI");

                SanPham sp = new SanPham(ID_SP, Ten_SP, Loai_SP, MauSac, Size, Image, GiaBan, NgayNhap, SoLuong, TrangThai);
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    protected void renderListMCQueen(ArrayList<SanPham> data){
        DefaultTableModel modelsneaker = (DefaultTableModel) this.tblBal.getModel();
        modelsneaker.setRowCount(0);
        for(int i =0 ;i < data.size(); i++){
            SanPham sp = data.get(i);
            modelsneaker.addRow(new Object[]{
                sp.getID_SP(),
                sp.getTen_SP(),
                sp.getNgaynhap(),
                sp.getLoai_SP(),
                sp.getSoLuong(),
                sp.getMauSac(),
                sp.getSize(),
                sp.getGiaTien(),
                sp.getTrangThai()
            });
        }
    }
    protected ArrayList<SanPham> fetchListMCQueen() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "SELECT * FROM SANPHAM WHERE LOAI_SP like 'Alexander MC Queen'";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ID_SP = rs.getNString("ID_SP");
                String Ten_SP = rs.getNString("TEN_SP");
                String Loai_SP = rs.getNString("LOAI_SP");
                String MauSac = rs.getNString("MAUSAC");
                int Size = rs.getInt("SIZE");
                String Image = rs.getString("IMAGES");
                double GiaBan = rs.getDouble("GIABAN");
                String NgayNhap = rs.getString("NGNHAP");
                int SoLuong = rs.getInt("SOLUONG");
                String TrangThai = rs.getNString("TRANGTHAI");

                SanPham sp = new SanPham(ID_SP, Ten_SP, Loai_SP, MauSac, Size, Image, GiaBan, NgayNhap, SoLuong, TrangThai);
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    protected void renderListVans(ArrayList<SanPham> data){
        DefaultTableModel modelsneaker = (DefaultTableModel) this.tblVans.getModel();
        modelsneaker.setRowCount(0);
        for(int i =0 ;i < data.size(); i++){
            SanPham sp = data.get(i);
            modelsneaker.addRow(new Object[]{
                sp.getID_SP(),
                sp.getTen_SP(),
                sp.getNgaynhap(),
                sp.getLoai_SP(),
                sp.getSoLuong(),
                sp.getMauSac(),
                sp.getSize(),
                sp.getGiaTien(),
                sp.getTrangThai()
            });
        }
    }
    protected ArrayList<SanPham> fetchListVans() {
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "SELECT * FROM SANPHAM WHERE LOAI_SP like 'Vans'";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ID_SP = rs.getNString("ID_SP");
                String Ten_SP = rs.getNString("TEN_SP");
                String Loai_SP = rs.getNString("LOAI_SP");
                String MauSac = rs.getNString("MAUSAC");
                int Size = rs.getInt("SIZE");
                String Image = rs.getString("IMAGES");
                double GiaBan = rs.getDouble("GIABAN");
                String NgayNhap = rs.getString("NGNHAP");
                int SoLuong = rs.getInt("SOLUONG");
                String TrangThai = rs.getNString("TRANGTHAI");

                SanPham sp = new SanPham(ID_SP, Ten_SP, Loai_SP, MauSac, Size, Image, GiaBan, NgayNhap, SoLuong, TrangThai);
                list.add(sp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        // TODO add your handling code here:
        QLSP ql = new QLSP();
        this.getDesktopPane().add(ql);
        ql.setVisible(true);
        ql.setLocation(this.getDesktopPane().getWidth() / 2 - ql.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - ql.getHeight() / 2);
        this.dispose();
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        thongtin_hoadon tt_hd = new thongtin_hoadon();
        this.getDesktopPane().add(tt_hd);
        tt_hd.setVisible(true);
        tt_hd.setLocation(this.getDesktopPane().getWidth() / 2 - tt_hd.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - tt_hd.getHeight() / 2);
        this.dispose();
    }//GEN-LAST:event_btnTKActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        lg.setLocation(this.getDesktopPane().getWidth() / 2 - lg.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - lg.getHeight() / 2);
//        System.out.println(this.getDesktopPane().getWidth());
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHActionPerformed
        // TODO add your handling code here:
        Thongtin_khachhang cus = new Thongtin_khachhang();
        this.getDesktopPane().add(cus);
        cus.setVisible(true);
        cus.setLocation(this.getDesktopPane().getWidth() / 2 - cus.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - cus.getHeight() / 2);
        this.dispose();
    }//GEN-LAST:event_btnKHActionPerformed

    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        // TODO add your handling code here:
        QLBH ql = new QLBH();
        this.getDesktopPane().add(ql);
        ql.setVisible(true);
        ql.setLocation(this.getDesktopPane().getWidth() / 2 - ql.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - ql.getHeight() / 2);
        this.dispose();
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void btnDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDTActionPerformed
        // TODO add your handling code here:
        Quanly_doanhthu qldt = new Quanly_doanhthu();
        this.getDesktopPane().add(qldt);
        qldt.setVisible(true);
        qldt.setLocation(this.getDesktopPane().getWidth() / 2 - qldt.getWidth() / 2, (this.getDesktopPane().getHeight()) / 2 - qldt.getHeight() / 2);
        this.dispose();
    }//GEN-LAST:event_btnDTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDT;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnQLHD;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAll;
    private javax.swing.JTable tblBal;
    private javax.swing.JTable tblCon;
    private javax.swing.JTable tblMC;
    private javax.swing.JTable tblVans;
    // End of variables declaration//GEN-END:variables
}
