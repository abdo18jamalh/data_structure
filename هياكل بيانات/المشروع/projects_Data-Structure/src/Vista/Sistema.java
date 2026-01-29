/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

public final class Sistema extends javax.swing.JFrame {
    SinglyLinkedList sin=new SinglyLinkedList();
     CircularLinkedList cr= new  CircularLinkedList();
     DoublyLinkedList Do =new DoublyLinkedList();
     LinkedListStack St =new LinkedListStack();
     LinkedListQueue Qu =new LinkedListQueue();
     
    //***********************
    ///************************************************************
    
    //*************************************************************
    public Sistema() {
        initComponents();
        of();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ButHome = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        txtCorreo14 = new javax.swing.JTextField();
        txtCorreo2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        txtCorreo15 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        txtCorreo16 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jPanel44 = new javax.swing.JPanel();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        txtCorreo17 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jPanel46 = new javax.swing.JPanel();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        txtCorreo18 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 8, 206));

        btnNuevaVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaVenta.setText("CircularLinkedList");
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaVenta.setFocusable(false);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClientes.setText("Stack");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setFocusable(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProductos.setText("Queue");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setFocusable(false);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnConfig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfig.setText("DoublyLinkedList");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfig.setFocusable(false);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SinglyLinkedList");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButHome.setBackground(new java.awt.Color(0, 255, 255));
        ButHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButHome.setText("الصفحة الرائيسية");
        ButHome.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.pink));
        ButHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes)
                .addGap(35, 35, 35)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButHome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(ButHome)
                .addGap(154, 154, 154)
                .addComponent(tipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 80));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        jButton13.setBackground(new java.awt.Color(0, 204, 204));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("تسجيل موظف في البداية");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 204));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("تسجيل موظف في النهاية");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText("تسجيل موظف في مكان محدد");
        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 204, 204));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton17.setText("عرض الشكل");
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("حذف من البداية");
        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 204, 204));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setText("حذف من النهاية");
        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel13.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 520, 370));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        txtCorreo14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCorreo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo14ActionPerformed(evt);
            }
        });

        txtCorreo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtCorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo2ActionPerformed(evt);
            }
        });

        jLabel5.setText("البيانات ");

        jLabel6.setText("رقم index  المكان");

        ok.setBackground(new java.awt.Color(0, 204, 204));
        ok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ok.setText("اضافة البيانات");
        ok.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(txtCorreo14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 360, 240));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel13.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1270, 180));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("خورزميات SinglyLinkedList  ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 630, 70));

        jTabbedPane1.addTab("7", jPanel13);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        txtCorreo15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtCorreo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo15ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ادخال البيانات");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo15, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 420, 170));

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        jButton45.setBackground(new java.awt.Color(0, 204, 204));
        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton45.setText("جلب من البداية");
        jButton45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton45MouseClicked(evt);
            }
        });
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(0, 204, 204));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton46.setText("حذف من البداية");
        jButton46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton46MouseClicked(evt);
            }
        });
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(0, 204, 204));
        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton47.setText("عرض الشكل");
        jButton47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton47MouseClicked(evt);
            }
        });
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(0, 204, 204));
        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton48.setText("حذف من النهاية");
        jButton48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(0, 204, 204));
        jButton73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton73.setText("جلب من النهاية");
        jButton73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton73MouseClicked(evt);
            }
        });
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(0, 204, 204));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton43.setText("تسجيل موظف في البداية");
        jButton43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton43MouseClicked(evt);
            }
        });
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(0, 204, 204));
        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton44.setText("تسجيل موظف في النهاية");
        jButton44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel27.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 360));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setEnabled(false);
        jScrollPane6.setViewportView(jTextArea7);

        jPanel27.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 180));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("خورزميات CircularLinkedList  ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel27.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 650, 70));

        jPanel15.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("7", jPanel15);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        jButton74.setBackground(new java.awt.Color(0, 204, 204));
        jButton74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton74.setText("جلب من البداية");
        jButton74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton74MouseClicked(evt);
            }
        });
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(0, 204, 204));
        jButton75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton75.setText("حذف من البداية");
        jButton75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton75MouseClicked(evt);
            }
        });
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(0, 204, 204));
        jButton76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton76.setText("عرض الشكل");
        jButton76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton76MouseClicked(evt);
            }
        });
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(0, 204, 204));
        jButton77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton77.setText("حذف من النهاية");
        jButton77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton77MouseClicked(evt);
            }
        });
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(0, 204, 204));
        jButton78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton78.setText("جلب من النهاية");
        jButton78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton78MouseClicked(evt);
            }
        });
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(0, 204, 204));
        jButton79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton79.setText("تسجيل موظف في البداية");
        jButton79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton79MouseClicked(evt);
            }
        });
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.setBackground(new java.awt.Color(0, 204, 204));
        jButton80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton80.setText("تسجيل موظف في النهاية");
        jButton80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton80MouseClicked(evt);
            }
        });
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton79, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel18.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 360));

        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        txtCorreo16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtCorreo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo16ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("ادخال البيانات");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo16, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel18.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 420, 170));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setEnabled(false);
        jScrollPane7.setViewportView(jTextArea12);

        jPanel18.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 180));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("خورزميات DoublyLinkedList  ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel18.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 690, 70));

        jTabbedPane1.addTab("7", jPanel18);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setEnabled(false);
        jScrollPane8.setViewportView(jTextArea13);

        jPanel21.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 180));

        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        jButton81.setBackground(new java.awt.Color(0, 204, 204));
        jButton81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton81.setText("جلب من البداية top");
        jButton81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton81MouseClicked(evt);
            }
        });
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(0, 204, 204));
        jButton82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton82.setText("حذف من البداية pop");
        jButton82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton82MouseClicked(evt);
            }
        });
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(0, 204, 204));
        jButton83.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton83.setText("عرض الشكل");
        jButton83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton83MouseClicked(evt);
            }
        });
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(0, 204, 204));
        jButton86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton86.setText("تسجيل موظف في البداية push");
        jButton86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton86MouseClicked(evt);
            }
        });
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton86, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 360));

        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        txtCorreo17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtCorreo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo17ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ادخال البيانات");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo17, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel21.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 420, 170));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("خورزميات Stack  ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel21.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 420, 70));

        jTabbedPane1.addTab("7", jPanel21);

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setEnabled(false);
        jScrollPane13.setViewportView(jTextArea14);

        jPanel36.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 180));

        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        jButton88.setBackground(new java.awt.Color(0, 204, 204));
        jButton88.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton88.setText("جلب من البداية front");
        jButton88.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton88MouseClicked(evt);
            }
        });
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(0, 204, 204));
        jButton89.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton89.setText("حذف من البداية dequeue");
        jButton89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton89MouseClicked(evt);
            }
        });
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(0, 204, 204));
        jButton90.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton90.setText("عرض الشكل");
        jButton90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton90MouseClicked(evt);
            }
        });
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(0, 204, 204));
        jButton93.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton93.setText("تسجيل موظف في البداية enqueue");
        jButton93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton93MouseClicked(evt);
            }
        });
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton93, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel36.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 360));

        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 129, 219)));

        txtCorreo18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtCorreo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo18ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("ادخال البيانات");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo18, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel36.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 420, 170));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("خورزميات Queue  ");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel36.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 450, 70));

        jPanel24.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("7", jPanel24);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1280, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
       jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        
    }//GEN-LAST:event_btnConfigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        jTabbedPane1.setSelectedIndex(0);
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnProductosMouseClicked

    private void ButHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButHomeActionPerformed
        // TODO add your handling code here:
        
        jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_ButHomeActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtCorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
         
       
        jTextArea2.setText(" ");
        jTextArea2.setText(sin.display());
        
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        sin.removeFirst();
         jTextArea2.setText(" ");
          jTextArea2.setText(sin.display());
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        sin.removeLast();
         jTextArea2.setText(" ");
          jTextArea2.setText(sin.display());
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        if(txtCorreo2.getText().equals("") ){
            JOptionPane.showMessageDialog(null, " الحقل مطلوبة");
        }else{
            sin.addFirst(txtCorreo2.getText());
        jTextArea2.setText(" ");
        jTextArea2.setText(sin.display());
            JOptionPane.showMessageDialog(null, "تم تسجيل الموظف");
            
            
        }
        
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        if(txtCorreo2.getText().equals("") ){
            JOptionPane.showMessageDialog(null, " الحقل مطلوبة");
        }else{
            sin.addLast(txtCorreo2.getText());
        jTextArea2.setText(" ");
        jTextArea2.setText(sin.display());
            JOptionPane.showMessageDialog(null, "تم تسجيل الموظف");
            
            
        }
        
    }//GEN-LAST:event_jButton14MouseClicked

    private void txtCorreo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo14ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
       no();
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton43MouseClicked
        // TODO add your handling code here:
        check("addFirst");
        
        
    }//GEN-LAST:event_jButton43MouseClicked

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
        // TODO add your handling code here:

        check("addLast");
        
    }//GEN-LAST:event_jButton44MouseClicked

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void txtCorreo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo15ActionPerformed

    private void jButton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MouseClicked
        // TODO add your handling code here:
        
        jTextArea7.setText(" ");
          jTextArea7.setText((String) cr.getFirst());
    }//GEN-LAST:event_jButton45MouseClicked

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MouseClicked
        // TODO add your handling code here:
       check("removeFirst");
         
    }//GEN-LAST:event_jButton46MouseClicked

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton47MouseClicked
        // TODO add your handling code here:
        
        jTextArea7.setText(" ");
        jTextArea7.setText(cr.display());
    }//GEN-LAST:event_jButton47MouseClicked

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        // TODO add your handling code here:
        check("removeLast");
        
    }//GEN-LAST:event_jButton48MouseClicked

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton73MouseClicked
        // TODO add your handling code here:
        check("getLast");
         
    }//GEN-LAST:event_jButton73MouseClicked

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton74MouseClicked
        // TODO add your handling code here:
        check("getFirst");
        
    }//GEN-LAST:event_jButton74MouseClicked

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton75MouseClicked
        // TODO add your handling code here:
        jTextArea12.setText(" ");
           Do.removeFirst();
           jTextArea12.setText(Do.display());
    }//GEN-LAST:event_jButton75MouseClicked

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton76MouseClicked
        // TODO add your handling code here:
        jTextArea12.setText(" ");
        jTextArea12.setText(Do.display());
    }//GEN-LAST:event_jButton76MouseClicked

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton77MouseClicked
        // TODO add your handling code here:
        jTextArea12.setText(" ");
           Do.removeLast();
           jTextArea12.setText(Do.display());
    }//GEN-LAST:event_jButton77MouseClicked

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton78MouseClicked
        // TODO add your handling code here:
        jTextArea12.setText(" ");
          jTextArea12.setText((String) Do.getLast());
    }//GEN-LAST:event_jButton78MouseClicked

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton79MouseClicked
        // TODO add your handling code here:
        Do.addFirst(txtCorreo16.getText());
        jTextArea12.setText(" ");
        jTextArea12.setText(Do.display());
    }//GEN-LAST:event_jButton79MouseClicked

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton80MouseClicked
        // TODO add your handling code here:
        Do.addLast(txtCorreo16.getText());
        jTextArea12.setText(" ");
        jTextArea12.setText(Do.display());
    }//GEN-LAST:event_jButton80MouseClicked

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void txtCorreo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo16ActionPerformed

    private void jButton81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton81MouseClicked
        // TODO add your handling code here:
        jTextArea13.setText(" ");
          jTextArea13.setText((String) St.top());
    }//GEN-LAST:event_jButton81MouseClicked

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton82MouseClicked
        // TODO add your handling code here:
        
           St.pop();
        jTextArea13.setText("");
        jTextArea13.setText((String) St.dis());
    }//GEN-LAST:event_jButton82MouseClicked

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton83MouseClicked
        // TODO add your handling code here:
        jTextArea13.setText("");
        jTextArea13.setText((String) St.dis());
    }//GEN-LAST:event_jButton83MouseClicked

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton86MouseClicked
        // TODO add your handling code here:
        St.push(txtCorreo17.getText());
        jTextArea13.setText((String) St.dis());
    }//GEN-LAST:event_jButton86MouseClicked

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton86ActionPerformed

    private void txtCorreo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo17ActionPerformed

    private void jButton88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton88MouseClicked
        // TODO add your handling code here:
        jTextArea14.setText(" ");
          jTextArea14.setText((String) Qu.front());
    }//GEN-LAST:event_jButton88MouseClicked

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton89MouseClicked
        // TODO add your handling code here:
        Qu.dequeue();
        jTextArea14.setText("");
        jTextArea14.setText((String) Qu.dis());
    }//GEN-LAST:event_jButton89MouseClicked

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton90MouseClicked
        // TODO add your handling code here:
        jTextArea14.setText("");
        jTextArea14.setText((String) Qu.dis());
    }//GEN-LAST:event_jButton90MouseClicked

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton93MouseClicked
        // TODO add your handling code here:
         Qu.enqueue(txtCorreo18.getText());
        jTextArea14.setText((String) Qu.dis());
    }//GEN-LAST:event_jButton93MouseClicked

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton93ActionPerformed

    private void txtCorreo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo18ActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        // TODO add your handling code here:
        if(txtCorreo2.getText().equals("")||txtCorreo14.getText().equals("") ){
            JOptionPane.showMessageDialog(null, " الحقل مطلوبة");
        }else{
            As();
         of();
            JOptionPane.showMessageDialog(null, "تم تسجيل الموظف");
            
            
        }
         
    }//GEN-LAST:event_okMouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButHome;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton93;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JButton ok;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txtCorreo14;
    private javax.swing.JTextField txtCorreo15;
    private javax.swing.JTextField txtCorreo16;
    private javax.swing.JTextField txtCorreo17;
    private javax.swing.JTextField txtCorreo18;
    private javax.swing.JTextField txtCorreo2;
    // End of variables declaration//GEN-END:variables
    

    
    

  

   

    //private void RegistrarDetalle() {
    //    int id = Vdao.IdVenta();
     //   idinn=id;
      //  for (int i = 0; i < TableVenta.getRowCount(); i++) {
       //     int id_pro = Integer.parseInt(TableVenta.getValueAt(i, 4).toString());
       //     int cant = Integer.parseInt(TableVenta.getValueAt(i, 2).toString());
        //    double precio = Double.parseDouble(TableVenta.getValueAt(i, 1).toString());
        //    Dv.setId_pro(id_pro);
        //   Dv.setCantidad(cant);
         //   Dv.setPrecio(precio);
         //   Dv.setId(id);
         //   Vdao.RegistrarDetalle(Dv);

       // }
        /*int cliente = Integer.parseInt(txtIdCV.getText());
        Vdao.pdfV(id, cliente, Totalpagar, LabelVendedor.getText());*/


private boolean isNumeric(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}


   
    
   
private void As() {
        
           String idText =txtCorreo14.getText();
        
        int id = Integer.parseInt(idText);
        sin.addAtPosition(txtCorreo2.getText(),id);
        jTextArea2.setText(" ");
        jTextArea2.setText(sin.display());
            

            
    }
    

    private void no() {
        
        txtCorreo14.setVisible(true);
        jLabel6.setVisible(true);
        ok.setVisible(true);
            
    }
    
  private void of() {
        
          txtCorreo14.setVisible(false);
        jLabel6.setVisible(false);
            ok.setVisible(false);

            
    }
private void check(String choice) {
        
          
switch (choice) {
                case "addFirst": {
                    if(txtCorreo15.getText().equals("") ){
                        JOptionPane.showMessageDialog(null, " الحقل مطلوبة");
                    }else{
                            cr.addFirst(txtCorreo15.getText());
                            jTextArea7.setText(" ");
                            jTextArea7.setText(cr.display());
                    JOptionPane.showMessageDialog(null, "تم تسجيل ");
            
            
                    }
                    break;
                }
                case "addLast": {
                    if(txtCorreo15.getText().equals("") ){
                        JOptionPane.showMessageDialog(null, " الحقل مطلوبة");
                    }else{
                           cr.addLast(txtCorreo15.getText());
                            jTextArea7.setText(" ");
                            jTextArea7.setText(cr.display());
                    JOptionPane.showMessageDialog(null, "تم تسجيل ");
            
            
                    }
                    break;
                }
                case "removeFirst": {
                    
                    
                        
                            jTextArea7.setText(" ");
                            cr.removeFirst();
                            jTextArea7.setText(cr.display());
                    JOptionPane.showMessageDialog(null, "تم خذف من البداية");
            
            
                    
                    break;
                }
                case "removeLast": {
                    
            
                    jTextArea7.setText(" ");
                            cr.removeLast();
                            jTextArea7.setText(cr.display());
                    JOptionPane.showMessageDialog(null, "تم خذف من النهاية ");
            
            
                    
                    break;
                }
                case "getFirst": {
                    String mod =((String) cr.getFirst());
                    if(mod=="null" ){
                        JOptionPane.showMessageDialog(null, " الحقل ");
                    }else{
                        jTextArea7.setText(" ");
                        jTextArea7.setText((String) cr.getFirst());
                    JOptionPane.showMessageDialog(null, "تم تسجيل الموظف");
            
            
                    }
                    break;
                }
                case "getLast": {
                    String mod =((String) cr.getLast());
                    if(mod.equals("") ){
                        JOptionPane.showMessageDialog(null, " الحقل ");
                    }else{
                            jTextArea7.setText(" ");
                             jTextArea7.setText((String) cr.getLast());
                    JOptionPane.showMessageDialog(null, "تم تسجيل الموظف");
            
            
                    }
                    break;
                }
                
                default: {
                    System.out.println("Please enter correct choice");
                    break;
                }
            }
            
    }
    
    
}
