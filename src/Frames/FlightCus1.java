/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class FlightCus1 extends javax.swing.JFrame {
    
    public FlightCus1() {
        initComponents();
        //jPanel5.setVisible(false);
        jButton9.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        //jPanel12.setVisible(false);
        //jLabel19.setVisible(false);
        jButton12.setVisible(false);       
    }
    int i=0;
    String TrainName="";
    int Tcount=0;
    String[] Trains= new String[100];
    int x;
    int port = 3306;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblTName1 = new javax.swing.JLabel();
        lblTStartTime1 = new javax.swing.JLabel();
        lblTNo1 = new javax.swing.JLabel();
        lblTReachingTime1 = new javax.swing.JLabel();
        lblTStartDate1 = new javax.swing.JLabel();
        lblTReachingDate1 = new javax.swing.JLabel();
        lblTotalTime1 = new javax.swing.JLabel();
        lblStart1 = new javax.swing.JLabel();
        lblDest1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        lblTPrice1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblTName2 = new javax.swing.JLabel();
        lblTStartTime2 = new javax.swing.JLabel();
        lblTNo2 = new javax.swing.JLabel();
        lblTReachingTime2 = new javax.swing.JLabel();
        lblTStartDate2 = new javax.swing.JLabel();
        lblTReachingDate2 = new javax.swing.JLabel();
        lblTotalTime2 = new javax.swing.JLabel();
        lblStart2 = new javax.swing.JLabel();
        lblDest2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        lblTPrice2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblTName3 = new javax.swing.JLabel();
        lblTStartTime3 = new javax.swing.JLabel();
        lblTNo3 = new javax.swing.JLabel();
        lblTReachingTime3 = new javax.swing.JLabel();
        lblTStartDate3 = new javax.swing.JLabel();
        lblTReachingDate3 = new javax.swing.JLabel();
        lblTotalTime3 = new javax.swing.JLabel();
        lblStart3 = new javax.swing.JLabel();
        lblDest3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        lblTPrice3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new Color(0,0,0,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        jButton1.setAlignmentX(0.5F);
        jButton1.setInheritsPopupMenu(true);
        jButton1.setMaximumSize(new java.awt.Dimension(45, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(45, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(45, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setAlignmentX(0.5F);
        jButton2.setInheritsPopupMenu(true);
        jButton2.setMaximumSize(new java.awt.Dimension(45, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(45, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(45, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("...Trouvaille Destiano...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(null);

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plane.png"))); // NOI18N
        jButton3.setText("Flight");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(0, 150, 216, 41);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/train (1).png"))); // NOI18N
        jButton4.setText("Train");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 210, 216, 41);

        jButton6.setBackground(new Color(0,0,0,0));
        jButton6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ship (2).png"))); // NOI18N
        jButton6.setText("Cruise");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(0, 270, 216, 41);

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("About");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(0, 390, 216, 41);

        jButton18.setBackground(new Color(0,0,0,0));
        jButton18.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Logout");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18);
        jButton18.setBounds(0, 330, 216, 41);

        jButton19.setBackground(new Color(0,0,0,0));
        jButton19.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homepage.png"))); // NOI18N
        jButton19.setText("Home");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19);
        jButton19.setBounds(0, 90, 216, 41);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel44);
        jLabel44.setBounds(80, 20, 130, 30);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/man.png"))); // NOI18N
        jPanel3.add(jLabel45);
        jLabel45.setBounds(11, 10, 70, 70);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel46);
        jLabel46.setBounds(80, 60, 110, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Version - 0.0.1");
        jPanel3.add(jLabel47);
        jLabel47.setBounds(50, 440, 170, 15);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, 460));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Find Flight");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(0, 102, 153)));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 295, 42));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 42));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 295, 42));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 295, 42));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 295, 42));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 230));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 295, 42));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 42));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 295, 42));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 295, 42));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 295, 42));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 103, 220, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("From");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 34, -1, -1));

        jTextField1.setBackground(new Color(0,0,0,0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 58, 173, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("To");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 106, -1, -1));

        jTextField2.setBackground(new Color(0,0,0,0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 130, 173, 33));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 222, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Date");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 173, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Find");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 274, -1, 58));

        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 272, -1));

        jButton8.setText("||");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 58, -1, -1));

        jButton9.setBackground(new java.awt.Color(0, 102, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Previous");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 117, 48));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oops.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("OOPs");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Flight not found");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel19))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel18))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel19)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel20)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 490, 190));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTName1.setText("Mahananda");
        jPanel8.add(lblTName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 184, -1));

        lblTStartTime1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTStartTime1.setText("07:10 AM");
        jPanel8.add(lblTStartTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        lblTNo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTNo1.setForeground(new java.awt.Color(102, 102, 102));
        lblTNo1.setText("#1111111");
        jPanel8.add(lblTNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 89, -1));

        lblTReachingTime1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTReachingTime1.setText("03:40 PM,");
        jPanel8.add(lblTReachingTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        lblTStartDate1.setText("21 Oct");
        jPanel8.add(lblTStartDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 42, 50, -1));

        lblTReachingDate1.setText("21 Oct");
        jPanel8.add(lblTReachingDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 62, -1));

        lblTotalTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTime1.setText("33h 15m");
        jPanel8.add(lblTotalTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        lblStart1.setText("New Delhi");
        jPanel8.add(lblStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 110, -1));

        lblDest1.setText("Kolkata");
        jPanel8.add(lblDest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("-----------");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("-----------");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 153));
        jButton13.setText("Go");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 80, 40));

        lblTPrice1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTPrice1.setForeground(new java.awt.Color(102, 51, 0));
        lblTPrice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTPrice1.setText("Rs 2000");
        jPanel8.add(lblTPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 80, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel9.setForeground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTName2.setText("Mahananda");
        jPanel9.add(lblTName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 184, -1));

        lblTStartTime2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTStartTime2.setText("07:10 AM");
        jPanel9.add(lblTStartTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        lblTNo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTNo2.setForeground(new java.awt.Color(102, 102, 102));
        lblTNo2.setText("#1111111");
        jPanel9.add(lblTNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 89, -1));

        lblTReachingTime2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTReachingTime2.setText("03:40 PM,");
        jPanel9.add(lblTReachingTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        lblTStartDate2.setText("21 Oct");
        jPanel9.add(lblTStartDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 42, 50, -1));

        lblTReachingDate2.setText("21 Oct");
        jPanel9.add(lblTReachingDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 62, -1));

        lblTotalTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTime2.setText("33h 15m");
        jPanel9.add(lblTotalTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        lblStart2.setText("New Delhi");
        jPanel9.add(lblStart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 110, -1));

        lblDest2.setText("Kolkata");
        jPanel9.add(lblDest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("-----------");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("-----------");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 102, 153));
        jButton16.setText("Go");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 80, 40));

        lblTPrice2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTPrice2.setForeground(new java.awt.Color(102, 51, 0));
        lblTPrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTPrice2.setText("Rs 2000");
        jPanel9.add(lblTPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 80, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTName3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTName3.setText("Mahananda");
        jPanel10.add(lblTName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 184, -1));

        lblTStartTime3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTStartTime3.setText("07:10 AM");
        jPanel10.add(lblTStartTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, -1, -1));

        lblTNo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTNo3.setForeground(new java.awt.Color(102, 102, 102));
        lblTNo3.setText("#1111111");
        jPanel10.add(lblTNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 89, -1));

        lblTReachingTime3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTReachingTime3.setText("03:40 PM,");
        jPanel10.add(lblTReachingTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        lblTStartDate3.setText("21 Oct");
        jPanel10.add(lblTStartDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 42, 50, -1));

        lblTReachingDate3.setText("21 Oct");
        jPanel10.add(lblTReachingDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 62, -1));

        lblTotalTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTime3.setText("33h 15m");
        jPanel10.add(lblTotalTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        lblStart3.setText("New Delhi");
        jPanel10.add(lblStart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 110, -1));

        lblDest3.setText("Kolkata");
        jPanel10.add(lblDest3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("-----------");
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("-----------");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 102, 153));
        jButton17.setText("Go");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 80, 40));

        lblTPrice3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTPrice3.setForeground(new java.awt.Color(102, 51, 0));
        lblTPrice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTPrice3.setText("Rs 2000");
        jPanel10.add(lblTPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 80, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 580, 340));

        jButton12.setBackground(new java.awt.Color(0, 102, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Next");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 117, 48));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(225,225,225));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(i==0){
            Thread th=new Thread(){
                public void run(){
                    try{

                        for(int i=0;i<=216;i++){
                            Thread.sleep(3);
                            jPanel3.setBounds(0, 0,i, 460);
                        }
                    }
                    catch(Exception e){

                    }
                }
            };th.start();
            i++;
            jButton5.setVisible(false);
        }
        else{
            Thread th=new Thread(){
                public void run(){
                    try{

                        for(int i=216;i>=0;i--){
                            Thread.sleep(3);
                            jPanel3.setBounds(0, 0,i, 460);
                        }
                    }
                    catch(Exception e){

                    }
                }
            };th.start();
            i--;
            jButton5.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        //jButton2.setForeground(new Color(225,225,225));
        jButton2.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:

        jButton2.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);   
        jPanel11.setVisible(false);
        jButton12.setVisible(false); 
        jPanel5.setVisible(true);
        Tcount=0;
        
        String from=jTextField1.getText();
        String to=jTextField2.getText();
        
        SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
        String day="", dt="",date = dformat.format(jDateChooser1.getDate());
        int d,FinalSum=0;
        for(d=0; date.charAt(d)!='/';d++){
            dt+=date.charAt(d);
        }
        if(Integer.parseInt(dt)>31){
            System.out.println("Invalid Input");
            return;
        }
        FinalSum+=Integer.parseInt(dt);
        dt="";
        for( d=d+1; date.charAt(d)!='/';d++){
            dt+=date.charAt(d);
        }
        switch(Integer.parseInt(dt)){
            case 1:FinalSum+=1;
            break;
            case 2:FinalSum+=4;
            break;
            case 3:FinalSum+=4;
            break;
            case 4:FinalSum+=0;
            break;
            case 5:FinalSum+=2;
            break;
            case 6:FinalSum+=5;
            break;
            case 7:FinalSum+=0;
            break;
            case 8:FinalSum+=3;
            break;
            case 9:FinalSum+=6;
            break;
            case 10:FinalSum+=1;
            break;
            case 11:FinalSum+=4;
            break;
            case 12:FinalSum+=6;
            break;
            default : System.out.println("Invalid Input!!");
            return;
        }
        dt="";
        for( d=d+1;d<date.length()-2;d++){
            dt+=date.charAt(d);
        }
        switch(Integer.parseInt(dt)%4){
            case 0: FinalSum+=6;
            break;
            case 1: FinalSum+=4;
            break;
            case 2: FinalSum+=2;
            break;
            case 3: FinalSum+=0;
            break;                        
        }
        dt="";
        for( d=date.length()-2;d<date.length();d++){
            dt+=date.charAt(d);
        }
        FinalSum+=Integer.parseInt(dt)+(Integer.parseInt(dt)/4);
        FinalSum=FinalSum%7;
        switch(FinalSum){
            case 0:day="Sat";
            break;
            case 1:day="Sun";
            break;
            case 2:day="Mon";
            break;
            case 3:day="Tue";
            break;
            case 4:day="Wed";
            break;
            case 5:day="Thurs";
            break;
            case 6:day="Fri";
            break;
        }
    

        try
           {            
                      Class.forName("java.sql.Driver");

                      Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                      Connection cn1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                      Connection cn2=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                      Connection cn3=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");

                      Statement stmt=cn.createStatement();
                      Statement stmt2=cn1.createStatement();
                      Statement stmt1=cn2.createStatement();
                      Statement TrainDet=cn3.createStatement();


                      ResultSet rs= stmt.executeQuery("select * from flight where Days like '%" + day + "%' and Available = 1");
                      System.out.println("select * from flight where Days like '%" + day + "%' and Available = 1");
                      int count=0,st=0,st1=0;
                     //System.out.println("...");

                      ResultSet trDet;
                      while(rs.next()){
                          
                                 count=0;    
                                 String Train=rs.getString("Name");
                                 //System.out.println(Train);
                                 ResultSet rs1 = stmt1.executeQuery("Select station, Slno from "+Train+" where station='"+from+"'");
                                 if(rs1.next()){
                                            //System.out.println(rs1.getString("Slno"));
                                            st=Integer.parseInt(rs1.getString("Slno"));
                                            count++;                            
                                 }
                                 ResultSet rs2 = stmt2.executeQuery("Select station, Slno from "+Train+" where station='"+to+"'");
                                 if(rs2.next()){
                                     //System.out.println("...");
                                            st1=Integer.parseInt(rs2.getString("Slno"));
                                            count++;                            
                                 }
                                 if(count==2 && st<st1){
                                         
                                               
                                               Trains[Tcount]=Train;
                                               Tcount++;
                                           }
                                 System.out.println(Tcount+"t");
                                 }
                      }
           catch(Exception e){
               System.out.println(e) ;}
        
      if(Tcount==0){
          jPanel11.setVisible(true);
          jPanel5.setVisible(false);
      }
      else{
        String stime="",rtime="";
        x=0;
        
        for (x=1; x<=Tcount; x++){
                    if(x==1){
                        try{
                            jPanel8.setVisible(true);
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x-1] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo1.setText(resTd.getString("Number"));
                                lblTName1.setText(resTd.getString("Name"));
                                lblStart1.setText(jTextField1.getText());
                                lblDest1.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time=stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime1.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String  t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime1.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice1.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime1.setText(hr + "hr "+min+"m");
                                    
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate1.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate1.setText(sdformat.format(jDateChooser1.getDate()));
                                   //
                                    SimpleDateFormat smformat = new SimpleDateFormat("MM");
                                    smonth=Integer.parseInt(smformat.format(jDateChooser1.getDate()));
                                    //
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate1.setText(lblTStartDate1.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                    }
                    else if(x==2){
                        jPanel9.setVisible(true);
                        
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x-1] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo2.setText(resTd.getString("Number"));
                                lblTName2.setText(resTd.getString("Name"));
                                lblStart2.setText(jTextField1.getText());
                                lblDest2.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time =stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime2.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime2.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice2.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime2.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate2.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate2.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("dd");
                                    smonth=Integer.parseInt(sdformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate2.setText(lblTStartDate2.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                    }
                    else if(x==3){
                        jPanel10.setVisible(true);
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                            
                            int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x-1] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo3.setText(resTd.getString("Number"));
                                lblTName3.setText(resTd.getString("Name"));
                                lblStart3.setText(jTextField1.getText());
                                lblDest3.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time = stime=resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime3.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime3.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice3.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime3.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate3.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate3.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("dd");
                                    smonth=Integer.parseInt(sdformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate3.setText(lblTStartDate3.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            } 
                    }
                        catch(Exception e){System.out.println(e);}
                        //System.out.println("0");
                        break;
                        
        
                    }
        }
      }
      if(Tcount>3){
          jButton12.setVisible(true);
      }
    
         
        
        
         
      
        
        
        
            
        
            
    
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        jPanel6.setVisible(true);
        try{
            Class.forName("java.sql.Driver");
            Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from flightSuggestion where  Station like '"+jTextField1.getText()+"%'");
            int s=0;
            jLabel9.setText(null);
            jLabel10.setText(null);
            jLabel11.setText(null);
            jLabel12.setText(null);
            jLabel8.setText(null);
            while(rs.next()){
                //System.out.println(rs.getString("station"));
                s++;
                if(s==1)
                    jLabel9.setText(rs.getString("Station"));
                if(s==2)
                    jLabel10.setText(rs.getString("Station"));
                if(s==3)
                    jLabel11.setText(rs.getString("Station"));
                if(s==4)
                    jLabel12.setText(rs.getString("Station"));
                if(s==5)
                    jLabel8.setText(rs.getString("Station"));
            }           
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String x=jTextField1.getText();
        jTextField1.setText(jTextField2.getText());
        jTextField2.setText(x);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
         jPanel6.setVisible(false);
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        jPanel7.setVisible(true);
        try{
            Class.forName("java.sql.Driver");
            Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from flightSuggestion where  Station like '"+jTextField2.getText()+"%'");
            int s=0;
            jLabel14.setText(null);
            jLabel15.setText(null);
            jLabel16.setText(null);
            jLabel17.setText(null);
            jLabel13.setText(null);
            while(rs.next()){                
                s++;
                if(s==1)
                    jLabel14.setText(rs.getString("Station"));
                if(s==2)
                    jLabel15.setText(rs.getString("Station"));
                if(s==3)
                    jLabel16.setText(rs.getString("Station"));
                if(s==4)
                    jLabel17.setText(rs.getString("Station"));
                if(s==5)
                    jLabel13.setText(rs.getString("Station"));
            }           
        }
        catch(Exception e){
            //System.out.println(e);
        }
        
        ///////
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jLabel13.getText());
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jLabel14.getText());
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jLabel15.getText());
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jLabel16.getText());
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        jTextField2.setText(jLabel17.getText());
        jPanel7.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jLabel8.getText());
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jLabel9.getText());
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jLabel10.getText());
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jLabel11.getText());
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(jLabel12.getText());
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton9.setVisible(true);
        int z=x+2;
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        
      String stime="",rtime="";
        int v=x-1;
        for (x=x; x<=z && Tcount>x; x++){
                    
                    if(x-v==1){
                        try{
                            jPanel8.setVisible(true);
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                            if(resTd.next()){
                                lblTNo1.setText(resTd.getString("Number"));
                                lblTName1.setText(resTd.getString("Name"));
                                lblStart1.setText(jTextField1.getText());
                                lblDest1.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time=stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime1.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String  t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime1.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice1.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime1.setText(hr + "hr "+min+"m");
                                    
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate1.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate1.setText(sdformat.format(jDateChooser1.getDate()));
                                   //
                                    SimpleDateFormat smformat = new SimpleDateFormat("MM");
                                    smonth=Integer.parseInt(smformat.format(jDateChooser1.getDate()));
                                    //
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate1.setText(lblTStartDate1.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                    }
                    else if(x-v==2){
                        jPanel9.setVisible(true);
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo2.setText(resTd.getString("Number"));
                                lblTName2.setText(resTd.getString("Name"));
                                lblStart2.setText(jTextField1.getText());
                                lblDest2.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time =stime=resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime2.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime2.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice2.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime2.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate2.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate2.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("dd");
                                    smonth=Integer.parseInt(sdformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate2.setText(lblTStartDate2.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                    }
                    else if(x-v==3){
                        jPanel10.setVisible(true);
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                            
                            int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo3.setText(resTd.getString("Number"));
                                lblTName3.setText(resTd.getString("Name"));
                                lblStart3.setText(jTextField1.getText());
                                lblDest3.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time =stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime3.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime3.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice3.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime3.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate3.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate3.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("MM");
                                    smonth=Integer.parseInt(smformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate3.setText(lblTStartDate3.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            } 
                    
                        }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                        else{
                            jButton12.setVisible(true);                            
                        }
                        if(Tcount>x+1){
                            
                        }
                    }}
        System.out.println(x);
                        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton12.setVisible(true);
        if(x%3!=0){
            x=x-((x%3)+3);
        }
        else{
            x=x-6;
        }        
        System.out.println(x);
        int z=x+2;
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        
      String stime="",rtime="";
        int v=x-1;
        for (x=x; x<=z && Tcount>x; x++){
                    
                    if(x-v==1){
                        try{
                            jPanel8.setVisible(true);
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                            if(resTd.next()){
                                lblTNo1.setText(resTd.getString("Number"));
                                lblTName1.setText(resTd.getString("Name"));
                                lblStart1.setText(jTextField1.getText());
                                lblDest1.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time=stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime1.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String  t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime1.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice1.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime1.setText(hr + "hr "+min+"m");
                                    
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate1.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate1.setText(sdformat.format(jDateChooser1.getDate()));
                                   //
                                    SimpleDateFormat smformat = new SimpleDateFormat("MM");
                                    smonth=Integer.parseInt(smformat.format(jDateChooser1.getDate()));
                                    //
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate1.setText(lblTStartDate1.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                    }
                    else if(x-v==2){
                        jPanel9.setVisible(true);
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                        int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo2.setText(resTd.getString("Number"));
                                lblTName2.setText(resTd.getString("Name"));
                                lblStart2.setText(jTextField1.getText());
                                lblDest2.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time =stime=resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime2.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime2.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice2.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime2.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate2.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate2.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("dd");
                                    smonth=Integer.parseInt(sdformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate2.setText(lblTStartDate2.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            }
                            }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                    }
                    else if(x-v==3){
                        jPanel10.setVisible(true);
                        try{   
                        Class.forName("java.sql.Driver");
                        Connection CTd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Connection CSd=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                         Connection CSd1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                        Statement stmtTd=CTd.createStatement();
                        Statement stmtSd=CSd.createStatement();       
                        Statement stmtSd1=CSd1.createStatement();

                        ResultSet resTd;
                            
                            int SDis=0,Sday=0,Eday=0,Stime=0,Etime=0,EDis=0;
                       //System.out.println(Trains[x-1]);
                            resTd=stmtTd.executeQuery("Select * from flight WHERE Name = '"+ Trains[x] +"'");
                             //System.out.println("...");
                            if(resTd.next()){
                               // System.out.println("...");
                                lblTNo3.setText(resTd.getString("Number"));
                                lblTName3.setText(resTd.getString("Name"));
                                lblStart3.setText(jTextField1.getText());
                                lblDest3.setText(jTextField2.getText());
                                
                                ResultSet resSd=stmtSd.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField1.getText()+"'" );
                                if(resSd.next()){
                                String t = "";
                                String time =stime= resSd.getString("Arrival");
                                Stime=Integer.parseInt(time);
                                Sday=Integer.parseInt(resSd.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTStartTime3.setText(t);
                                SDis=Integer.parseInt(resSd.getString("Distance"));

                                }
                                ResultSet resSd1=stmtSd1.executeQuery("Select * from "+resTd.getString("Name")+" Where Station ='"+jTextField2.getText()+"'" );
                                if(resSd1.next()){
                                String t = "";
                                String time =rtime= resSd1.getString("Arrival");
                                Etime=Integer.parseInt(time);
                                Eday=Integer.parseInt(resSd1.getString("DayNo"));
                                if(Integer.parseInt(time)<1200){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " AM";
                                }
                                else if(Integer.parseInt(time)/1000 == 1 && (Integer.parseInt(time)%1000) / 100 == 2){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }        
                                else if(Integer.parseInt(time) <2400){
                                    int a;
                                    for(a=0; a<2;a++)
                                        t += time.charAt(a);
                                        t = Integer.toString(Integer.parseInt(t) - 12);
                                    t += ":";
                                    for(a=2; a<4;a++)
                                        t += time.charAt(a);
                                    t += " PM";
                                }
                                
                                lblTReachingTime3.setText(t);
                                EDis=Integer.parseInt(resSd1.getString("Distance"));

                                }
                               
                                lblTPrice3.setText((EDis - SDis)+" Km");
                                 int TotalTime=((Eday-Sday)*2400)+(Etime-Stime);
                                 int min, hr=TotalTime/100;
                                    if(TotalTime%100>=60){
                                        hr+=1;
                                        min=TotalTime%100-60;
                                    }
                                    else{
                                        min=TotalTime%100;
                                    }
                                    lblTotalTime3.setText(hr + "hr "+min+"m");
                                    ///////////////////////
                                    SimpleDateFormat ddformat = new SimpleDateFormat("dd");
                                    String sdate=( ddformat.format(jDateChooser1.getDate()));

                                    SimpleDateFormat mformat = new SimpleDateFormat("MM");
                                    int smonth=Integer.parseInt( mformat.format(jDateChooser1.getDate()));
                                    String month="";

                                    //int hr=75;
                                    int moreDay=0;
                                    if(hr>24 ){
                                        moreDay=hr/24;
                                    }else if(Integer.parseInt(rtime)<=Integer.parseInt(stime)){
                                        moreDay=1;
                                    }
                                     if(hr>24 || Integer.parseInt(rtime)<=Integer.parseInt(stime)){

                                     if(smonth==1 || smonth==3||smonth==5|| smonth==7||smonth==8 ||smonth==10||smonth==12){
                                        if(Integer.parseInt(sdate)+moreDay >31){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 31);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }else if(smonth==4||smonth==6||smonth==9||smonth==11){
                                        if(Integer.parseInt(sdate)+moreDay >30){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 30);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }              
                                    }else if(smonth==2){
                                        if(Integer.parseInt(sdate)+moreDay >28){
                                            sdate=Integer.toString((Integer.parseInt(sdate)+moreDay)- 28);
                                            smonth++;                
                                        }else{
                                            sdate=Integer.toString(Integer.parseInt(sdate)+moreDay);
                                        }            
                                    }
                                     }
                                        switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTReachingDate3.setText(sdate+" "+month);
                                    SimpleDateFormat sdformat = new SimpleDateFormat("dd"); 
                                    lblTStartDate3.setText(sdformat.format(jDateChooser1.getDate()));
                                    SimpleDateFormat smformat = new SimpleDateFormat("MM");
                                    smonth=Integer.parseInt(smformat.format(jDateChooser1.getDate()));
                                    switch (smonth){
                                        case 1: month="Jan";
                                        break;
                                        case 2: month="Feb";
                                        break;
                                        case 3: month="Mar";
                                        break;
                                        case 4: month="Apr";
                                        break;
                                        case 5: month="May";
                                        break;
                                        case 6: month="Jun";
                                        break;
                                        case 7: month="Jul";
                                        break;
                                        case 8: month="Aug";
                                        break;
                                        case 9: month="Sep";
                                        break;
                                        case 10: month="Oct";
                                        break;
                                        case 11: month="Nov";
                                        break;
                                        case 12: month="Dec";
                                        break;            
                                    }
                                    lblTStartDate3.setText(lblTStartDate3.getText()+month);
                                    
                                   ///////////////////////////////////////
                            
                            } 
                    
                        }catch(Exception e){System.out.println(e);}
                        if(Tcount==x+1){
                            jButton12.setVisible(false);
                        }
                    }}
        if(x<=3){
            jButton9.setVisible(false);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        TrainCheckOut tco=new TrainCheckOut();
        tco.setVisible(true);
        tco.lblTName.setText(lblTName1.getText());
        tco.lblTStartTime.setText(lblTStartTime1.getText());
        tco.lblTStartDate.setText(lblTStartDate1.getText());
        tco.lblTotalTime.setText(lblTotalTime1.getText());
        tco.lblTReachingTime.setText(lblTReachingTime1.getText());
        tco.lblTReachingDate.setText(lblTReachingDate1.getText());
        tco.lblStart.setText(lblStart1.getText());
        tco.lblTPrice.setText(lblTPrice1.getText());
        tco.lblDest.setText(lblDest1.getText());
        tco.lblTNo.setText(lblTNo1.getText());
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        TrainCheckOut tco=new TrainCheckOut();
        tco.setVisible(true);
        tco.lblTName.setText(lblTName2.getText());
        tco.lblTStartTime.setText(lblTStartTime2.getText());
        tco.lblTStartDate.setText(lblTStartDate2.getText());
        tco.lblTotalTime.setText(lblTotalTime2.getText());
        tco.lblTReachingTime.setText(lblTReachingTime2.getText());
        tco.lblTReachingDate.setText(lblTReachingDate2.getText());
        tco.lblStart.setText(lblStart2.getText());
        tco.lblTPrice.setText(lblTPrice2.getText());
        tco.lblDest.setText(lblDest2.getText());
        tco.lblTNo.setText(lblTNo2.getText());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        TrainCheckOut tco=new TrainCheckOut();
        tco.setVisible(true);
        tco.lblTName.setText(lblTName3.getText());
        tco.lblTStartTime.setText(lblTStartTime3.getText());
        tco.lblTStartDate.setText(lblTStartDate3.getText());
        tco.lblTotalTime.setText(lblTotalTime3.getText());
        tco.lblTReachingTime.setText(lblTReachingTime3.getText());
        tco.lblTReachingDate.setText(lblTReachingDate3.getText());
        tco.lblStart.setText(lblStart3.getText());
        tco.lblTPrice.setText(lblTPrice3.getText());
        tco.lblDest.setText(lblDest3.getText());
        tco.lblTNo.setText(lblTNo3.getText());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new Color(225,225,225));
        jButton3.setForeground(new Color(0,102,153));

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setForeground(new Color(225,225,225));
        jButton3.setBackground(new Color(0,0,0,0));

    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        //jButton4.setBackground(new Color(225,225,225));
        //jButton4.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        //jButton4.setForeground(new Color(225,225,225));
        //jButton4.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightCus1().setVisible(true);
            }
        });
        this .dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        jButton6.setBackground(new Color(225,225,225));
        jButton6.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        jButton6.setForeground(new Color(225,225,225));
        jButton6.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setBackground(new Color(225,225,225));
        jButton7.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        jButton7.setForeground(new Color(225,225,225));
        jButton7.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
        // TODO add your handling code here:
        jButton18.setBackground(new Color(225,225,225));
        jButton18.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        // TODO add your handling code here:
        jButton18.setForeground(new Color(225,225,225));
        jButton18.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
        // TODO add your handling code here:
        jButton19.setBackground(new Color(225,225,225));
        jButton19.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        // TODO add your handling code here:
        jButton19.setForeground(new Color(225,225,225));
        jButton19.setBackground(new Color(0,0,0,0));
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Home Ah=new Home();
        Ah.setVisible(true);
        Ah.jLabel5.setIcon(jLabel45.getIcon());
        Ah.jLabel4.setText(jLabel44.getText());
        Ah.jLabel6.setText(jLabel46.getText());
        this .dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton7ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
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
            java.util.logging.Logger.getLogger(FlightCus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightCus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightCus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightCus1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightCus1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDest1;
    private javax.swing.JLabel lblDest2;
    private javax.swing.JLabel lblDest3;
    private javax.swing.JLabel lblStart1;
    private javax.swing.JLabel lblStart2;
    private javax.swing.JLabel lblStart3;
    private javax.swing.JLabel lblTName1;
    private javax.swing.JLabel lblTName2;
    private javax.swing.JLabel lblTName3;
    private javax.swing.JLabel lblTNo1;
    private javax.swing.JLabel lblTNo2;
    private javax.swing.JLabel lblTNo3;
    private javax.swing.JLabel lblTPrice1;
    private javax.swing.JLabel lblTPrice2;
    private javax.swing.JLabel lblTPrice3;
    private javax.swing.JLabel lblTReachingDate1;
    private javax.swing.JLabel lblTReachingDate2;
    private javax.swing.JLabel lblTReachingDate3;
    private javax.swing.JLabel lblTReachingTime1;
    private javax.swing.JLabel lblTReachingTime2;
    private javax.swing.JLabel lblTReachingTime3;
    private javax.swing.JLabel lblTStartDate1;
    private javax.swing.JLabel lblTStartDate2;
    private javax.swing.JLabel lblTStartDate3;
    private javax.swing.JLabel lblTStartTime1;
    private javax.swing.JLabel lblTStartTime2;
    private javax.swing.JLabel lblTStartTime3;
    private javax.swing.JLabel lblTotalTime1;
    private javax.swing.JLabel lblTotalTime2;
    private javax.swing.JLabel lblTotalTime3;
    // End of variables declaration//GEN-END:variables
}
