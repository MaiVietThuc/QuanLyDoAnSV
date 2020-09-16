/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conectdatabase.GetConnectionUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DeTai;

/**
 *
 * @author ASUS
 */
public class FDeTaiDoAn extends javax.swing.JFrame {
        
    private final ArrayList<DeTai> aCB_DETAI;//khai bao toan cuc
    /**
     * Creates new form FQLDeTai
     */
    public FDeTaiDoAn() {
  
        initComponents();
        
        aCB_DETAI=new ArrayList<>();
        getShowData();
        getShowDataComboxFilter(cbDT_Filter);
        getShowDataComboxUP(cbMSDT_Update);
        getShowDataComboxDEL(cbMSDT_Delete);
    }

    private void  getShowData() {
        try {
            aCB_DETAI.clear();
          
            //String connectionURL =  "jdbc:sqlserver://localhost;sqlIstanceName=DESKTOP-SKTH6LI\\SQLEXPRESS;database=QUANLYDIEMVADETAITOTNGHIEP;userName=SA;password=123";       
            //Connection conn = DriverManager.getConnection(connectionURL);
            Connection conn= GetConnectionUtils.getDB();//khai bao toan cuc
            Statement st=conn.createStatement();//khai bao toan cuc
            String sql = "select * from DETAI";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                
                  DeTai fr=new DeTai(rs.getString("MSDT"),rs.getString("TENDT"));
            
                aCB_DETAI.add(fr);
                
            }
          
            DefaultTableModel model = new DefaultTableModel();
            
            Object[] columnsName = new Object[2];
            
            columnsName[0] = "MSDT";
            columnsName[1] = "TÊN ĐỀ TÀI";
            
            model.setColumnIdentifiers(columnsName);
            
            Object[] rowData = new Object[2];
            
            for(int i = 0; i < aCB_DETAI.size(); i++){
                
                rowData[0] = aCB_DETAI.get(i).getMSDT().trim();
                rowData[1] = aCB_DETAI.get(i).getTENDT().trim();
                
                model.addRow(rowData);
            }
            
            jTDETAI.setModel(model);
            conn.close();
            st.close();
        }  catch (ClassNotFoundException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
    }
    
    private void  getShowDataComboxFilter(JComboBox tenbien){
        try {
           aCB_DETAI.clear();
           tenbien.removeAllItems();
        
            //Connection conn=ConnectiontionUtils.getMyConnection();;//khai bao toan cuc
           Connection conn= GetConnectionUtils.getDB();
            Statement st=conn.createStatement();//khai bao toan cuc
            String sqlcheck="select * from DETAI";
            ResultSet rs=st.executeQuery(sqlcheck);
            
            while(rs.next()){
                
                DeTai fr=new DeTai(rs.getString("MSDT"), rs.getString("TENDT"));
               aCB_DETAI.add(fr);
         
            }
          
            
            for(int i = 0; i < aCB_DETAI.size(); i++){
                
              tenbien.addItem(aCB_DETAI.get(i).toString());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
        private void getShowDataComboxUP(JComboBox tenbien){

             try {
           aCB_DETAI.clear();
           tenbien.removeAllItems();
        
            //Connection conn=ConnectiontionUtils.getMyConnection();;//khai bao toan cuc
           Connection conn= GetConnectionUtils.getDB();
            Statement st=conn.createStatement();//khai bao toan cuc
            String sqlcheck="select * from DETAI";
            ResultSet rs=st.executeQuery(sqlcheck);
            
            while(rs.next()){
                
                DeTai fr=new DeTai(rs.getString("MSDT"), rs.getString("TENDT"));
               aCB_DETAI.add(fr);
         
            }
          
            
            for(int i = 0; i < aCB_DETAI.size(); i++){
                
              tenbien.addItem(aCB_DETAI.get(i).toString());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
        
        private void getShowDataComboxDEL(JComboBox tenbien){
            
            try {
           aCB_DETAI.clear();
           tenbien.removeAllItems();
       
           Connection conn= GetConnectionUtils.getDB();
            Statement st=conn.createStatement();//khai bao toan cuc
            String sqlcheck="select * from DETAI";
            ResultSet rs=st.executeQuery(sqlcheck);
            
            while(rs.next()){
                
                DeTai fr=new DeTai(rs.getString("MSDT"), rs.getString("TENDT"));
               aCB_DETAI.add(fr);
         
            }
          
            
            for(int i = 0; i < aCB_DETAI.size(); i++){
                
              tenbien.addItem(aCB_DETAI.get(i).toString());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDETAI = new javax.swing.JTable();
        cbDT_Filter = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenDT_Update = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        cbMSDT_Update = new javax.swing.JComboBox();
        lbTrongTen_Update = new javax.swing.JLabel();
        lbTongMSDT_Up = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoaDT = new javax.swing.JButton();
        cbMSDT_Delete = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        lbTrongTenDT_Del = new javax.swing.JLabel();
        lbTrongMSDT_Del = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMSDT_Add = new javax.swing.JTextField();
        txtTenDT_Add = new javax.swing.JTextField();
        btnThemDT = new javax.swing.JButton();
        lbTrongTen_Them = new javax.swing.JLabel();
        lbTrongMSDT_Them = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("VNI 27 Bendigo", 3, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐỀ TÀI ĐỒ ÁN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM")));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("tìm kiếm đề tài: ");

        jTDETAI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MSDT", "TÊN ĐỀ TÀI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTDETAI);

        cbDT_Filter.setMaximumRowCount(20);
        cbDT_Filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDT_Filter.setSelectedIndex(-1);
        cbDT_Filter.setToolTipText("tìm kiếm đề tài");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cbDT_Filter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDT_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jLabel5.setText("ĐỀ TÀI");

        jLabel6.setText("TÊN ĐỀ TÀI");

        txtTenDT_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDT_UpdateActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbMSDT_Update.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMSDT_Update.setSelectedIndex(-1);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PEN.png"))); // NOI18N
        jLabel13.setText("CẬP NHẬT ĐỀ TÀI VÀO CSDL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbTrongTen_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lbTongMSDT_Up, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(159, 159, 159))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMSDT_Update, 0, 285, Short.MAX_VALUE)
                            .addComponent(txtTenDT_Update)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMSDT_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTongMSDT_Up)
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDT_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTrongTen_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );

        jTabbedPane1.addTab("UPDATE DT", jPanel4);

        jLabel7.setText("ĐỀ TÀI");

        btnXoaDT.setText("XÓA DT");
        btnXoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDTActionPerformed(evt);
            }
        });

        cbMSDT_Delete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMSDT_Delete.setSelectedIndex(-1);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PEN.png"))); // NOI18N
        jLabel12.setText("XÓA ĐỀ TÀI KHỎI CSDL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lbTrongTenDT_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lbTrongMSDT_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMSDT_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnXoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMSDT_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lbTrongMSDT_Del)
                .addGap(72, 72, 72)
                .addComponent(btnXoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTrongTenDT_Del)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("XÓA DT", jPanel5);

        jLabel3.setText("MSDT");

        jLabel4.setText("TÊN ĐỀ TÀI");

        txtMSDT_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSDT_AddActionPerformed(evt);
            }
        });

        txtTenDT_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDT_AddActionPerformed(evt);
            }
        });

        btnThemDT.setText("THÊM ĐỀ TÀI");
        btnThemDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDTActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\BAI TAP DO AN\\HINH ANH\\PEN.png")); // NOI18N
        jLabel11.setText("THÊM ĐỀ TÀI VÀO CSDL");

        btnReset.setText("Reset Filed");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTrongMSDT_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtMSDT_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenDT_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThemDT)
                                .addGap(54, 54, 54)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTrongTen_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSDT_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbTrongMSDT_Them)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDT_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbTrongTen_Them)
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("THÊM DT", jPanel2);

        btnHome.setIcon(new javax.swing.ImageIcon("D:\\BAI TAP DO AN\\HINH ANH\\metrostation-black-home-icon-png-clipart.jpg")); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDT_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDT_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDT_UpdateActionPerformed

    private void txtMSDT_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSDT_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSDT_AddActionPerformed

    private void txtTenDT_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDT_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDT_AddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
            if (txtTenDT_Update.getText().trim().equals("")) {
                lbTrongTen_Update.setText("Không được bỏ trống tên đề tài!");
                txtTenDT_Update.grabFocus();
                return;
            } 
            //else if (cbMSDT_Update.equals(Selec)==null);
            //    cbMSDT_Update.grabFocus();
             //   return;   }
            else {
                lbTrongTen_Update.setText("");
            
            
            try {
         
         int vt=cbMSDT_Update.getSelectedIndex();
         String msdt=aCB_DETAI.get(vt).getMSDT();
         String tendt = txtTenDT_Update.getText();
         
       
        Connection conn= GetConnectionUtils.getDB();
         //Connection conn=ConnectionUtils.getMyConnection();;
         Statement st=conn.createStatement();
          String sqlcheck="select * from DETAI where MSDT='"+msdt+"'";
            ResultSet rs=st.executeQuery(sqlcheck);
            int count=0;
            while(rs.next()){
                count++;
                
            }
            
            String sqlinsert="Update DETAI set TENDT='"+tendt+"' where MSDT='"+msdt+"'";
            int rownum=st.executeUpdate(sqlinsert);
            getShowData();
            getShowDataComboxFilter(cbDT_Filter);
            getShowDataComboxUP(cbMSDT_Update);
            getShowDataComboxDEL(cbMSDT_Delete);
       
            if(count!=0){
                
                JOptionPane.showMessageDialog(null,"Đã cập nhật đề tài thành công!");
                
            }else{ 
         if(rownum==0){
             JOptionPane.showMessageDialog(null,"Insert không thành công");
             
         }
            }
     } catch (SQLException ex) {
         Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(FDeTaiDoAn.class.getName()).log(Level.SEVERE, null, ex);
     }
       }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnXoaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDTActionPerformed
        
       
            try {
         
         int vt=cbMSDT_Delete.getSelectedIndex();
         String msdt=aCB_DETAI.get(vt).getMSDT();
  
         
       
        Connection conn= GetConnectionUtils.getDB();       
         Statement st=conn.createStatement();
          String sqlcheck="select * from DETAI where MSDT='"+msdt+"'";
            ResultSet rs=st.executeQuery(sqlcheck);
            int count=0;
            while(rs.next()){
                count++;
                
            }
            
            String sqlinsert="DELETE FROM DETAI where MSDT='"+msdt+"'";
            int rownum=st.executeUpdate(sqlinsert);
            getShowData();
            getShowDataComboxFilter(cbDT_Filter);
            getShowDataComboxUP(cbMSDT_Update);
            getShowDataComboxDEL(cbMSDT_Delete);
        
            if(count!=0){
                
                JOptionPane.showMessageDialog(null,"Đã xóa đề tài thành công!");
                
            }else{ 
         if(rownum==0){
             JOptionPane.showMessageDialog(null,"Xóa không thành công!");
             
         }
            }
     } catch (SQLException ex) {
     } catch (ClassNotFoundException ex) {
     }
       
        
    }//GEN-LAST:event_btnXoaDTActionPerformed

    private void btnThemDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDTActionPerformed
        
       if (txtTenDT_Add.getText().trim().equals("") ||txtMSDT_Add.getText().trim().equals("")) {
                lbTrongTen_Them.setText("Không được bỏ trống mã đề tài hoặc tên đề tài!");
                txtTenDT_Add.grabFocus();
                txtMSDT_Add.grabFocus();
                return;
            } 
       
            else {
                lbTrongTen_Them.setText("");
                lbTrongMSDT_Them.setText("");
       }
            
            try {
         
         String msdt = txtMSDT_Add.getText();
         String tendt = txtTenDT_Add.getText();
         
       
        Connection conn= GetConnectionUtils.getDB();        
         Statement st=conn.createStatement();
          String sqlcheck="select MSDT from DETAI";
            ResultSet rs=st.executeQuery(sqlcheck);
            int count=0;
            while(rs.next()){
                count++;
                
            }
            
            
       
            if(count!=0){
                
                JOptionPane.showMessageDialog(null,"Đã trùng mã số đề tài!");
                
            }if(count==0){ 
              String sqlinsert="INSERT INTO DETAI VALUES('"+msdt+"','"+tendt+"')";
            int rownum=st.executeUpdate(sqlinsert);
            getShowData();
            getShowDataComboxFilter(cbDT_Filter);
            getShowDataComboxUP(cbMSDT_Update);
            getShowDataComboxDEL(cbMSDT_Delete);  
                
                
         if(rownum==0){
             JOptionPane.showMessageDialog(null,"Thêm mới đề tài không thành công!");
             
         }
         else{
               JOptionPane.showMessageDialog(null,"Thêm mới đề tài thành công!");
         }
            }
     } catch (SQLException | ClassNotFoundException ex) {
     }
      
        
    }//GEN-LAST:event_btnThemDTActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        txtMSDT_Add.setText("");
        txtTenDT_Add.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       
        FChucNang f = new FChucNang();
                    f.setVisible(true);
                    this.dispose();
        
    }//GEN-LAST:event_btnHomeActionPerformed
  
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FDeTaiDoAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDeTaiDoAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDeTaiDoAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDeTaiDoAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDeTaiDoAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThemDT;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoaDT;
    private javax.swing.JComboBox cbDT_Filter;
    private javax.swing.JComboBox cbMSDT_Delete;
    private javax.swing.JComboBox cbMSDT_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDETAI;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTongMSDT_Up;
    private javax.swing.JLabel lbTrongMSDT_Del;
    private javax.swing.JLabel lbTrongMSDT_Them;
    private javax.swing.JLabel lbTrongTenDT_Del;
    private javax.swing.JLabel lbTrongTen_Them;
    private javax.swing.JLabel lbTrongTen_Update;
    private javax.swing.JTextField txtMSDT_Add;
    private javax.swing.JTextField txtTenDT_Add;
    private javax.swing.JTextField txtTenDT_Update;
    // End of variables declaration//GEN-END:variables
}
