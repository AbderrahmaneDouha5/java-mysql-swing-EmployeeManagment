
package posant.mainapp;

import java.awt.Color;
import posant.databases.db;
import javax.swing.DefaultListModel;

public class Operations extends javax.swing.JPanel {
    protected String username;
    protected String password;
    db database;
    public Operations(String dbname,String username, String password) {
        database = new db(dbname , username, password);
        this.username = username;
        this.password = password;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addofferedidfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addofferedvaluefield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addofferednamefield = new javax.swing.JTextField();
        addofferederrorlabel = new javax.swing.JLabel();
        addofferedbutton = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        adddebtsidfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adddebtsvaluefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adddebtsnamefield = new javax.swing.JTextField();
        adddebtserrorlabel = new javax.swing.JLabel();
        adddebtbutton = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addjobnamefield = new javax.swing.JTextField();
        addjoberrorlabel = new javax.swing.JLabel();
        addjobbutton = new com.k33ptoo.components.KButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 963));

        addofferedidfield.setForeground(new java.awt.Color(255, 255, 255));
        addofferedidfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addofferedidfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addofferedidfield.setOpaque(false);
        addofferedidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addofferedidfieldActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("id:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Offered");

        addofferedvaluefield.setForeground(new java.awt.Color(255, 255, 255));
        addofferedvaluefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addofferedvaluefield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addofferedvaluefield.setOpaque(false);
        addofferedvaluefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addofferedvaluefieldKeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Value:");

        addofferednamefield.setForeground(new java.awt.Color(255, 255, 255));
        addofferednamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addofferednamefield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addofferednamefield.setOpaque(false);
        addofferednamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addofferednamefieldActionPerformed(evt);
            }
        });
        addofferednamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addofferednamefieldKeyReleased(evt);
            }
        });

        addofferederrorlabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        addofferederrorlabel.setForeground(new java.awt.Color(255, 0, 51));

        addofferedbutton.setBorder(null);
        addofferedbutton.setText("Add Offered");
        addofferedbutton.setBorderPainted(false);
        addofferedbutton.setFocusPainted(false);
        addofferedbutton.setFocusable(false);
        addofferedbutton.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        addofferedbutton.setkBorderRadius(30);
        addofferedbutton.setkEndColor(new java.awt.Color(255, 255, 255));
        addofferedbutton.setkForeGround(new java.awt.Color(0, 0, 0));
        addofferedbutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        addofferedbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addofferedbutton.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        addofferedbutton.setkPressedColor(new java.awt.Color(204, 204, 204));
        addofferedbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        addofferedbutton.setkStartColor(new java.awt.Color(255, 255, 255));
        addofferedbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addofferedbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(addofferedvaluefield, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(addofferedidfield)
                    .addComponent(jLabel8)
                    .addComponent(addofferednamefield))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addofferederrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addofferedbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addofferedidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addofferednamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addofferedvaluefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addofferederrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addofferedbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        adddebtsidfield.setForeground(new java.awt.Color(255, 255, 255));
        adddebtsidfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        adddebtsidfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adddebtsidfield.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("id:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Debt");

        adddebtsvaluefield.setForeground(new java.awt.Color(255, 255, 255));
        adddebtsvaluefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        adddebtsvaluefield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adddebtsvaluefield.setOpaque(false);
        adddebtsvaluefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adddebtsvaluefieldKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Value:");

        adddebtsnamefield.setForeground(new java.awt.Color(255, 255, 255));
        adddebtsnamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        adddebtsnamefield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adddebtsnamefield.setOpaque(false);
        adddebtsnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddebtsnamefieldActionPerformed(evt);
            }
        });
        adddebtsnamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adddebtsnamefieldKeyReleased(evt);
            }
        });

        adddebtserrorlabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        adddebtserrorlabel.setForeground(new java.awt.Color(255, 0, 51));

        adddebtbutton.setBorder(null);
        adddebtbutton.setText("Add Debt");
        adddebtbutton.setBorderPainted(false);
        adddebtbutton.setFocusPainted(false);
        adddebtbutton.setFocusable(false);
        adddebtbutton.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        adddebtbutton.setkBorderRadius(30);
        adddebtbutton.setkEndColor(new java.awt.Color(255, 255, 255));
        adddebtbutton.setkForeGround(new java.awt.Color(0, 0, 0));
        adddebtbutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        adddebtbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        adddebtbutton.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        adddebtbutton.setkPressedColor(new java.awt.Color(204, 204, 204));
        adddebtbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        adddebtbutton.setkStartColor(new java.awt.Color(255, 255, 255));
        adddebtbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddebtbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(adddebtsvaluefield, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(adddebtsidfield)
                    .addComponent(jLabel4)
                    .addComponent(adddebtsnamefield))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(adddebtserrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adddebtbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adddebtsidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adddebtsnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adddebtsvaluefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adddebtserrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adddebtbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Job");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Name:");

        addjobnamefield.setForeground(new java.awt.Color(255, 255, 255));
        addjobnamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addjobnamefield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addjobnamefield.setOpaque(false);
        addjobnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjobnamefieldActionPerformed(evt);
            }
        });
        addjobnamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addjobnamefieldKeyReleased(evt);
            }
        });

        addjoberrorlabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        addjoberrorlabel.setForeground(new java.awt.Color(255, 0, 51));
        addjoberrorlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        addjobbutton.setBorder(null);
        addjobbutton.setText("Add Job");
        addjobbutton.setBorderPainted(false);
        addjobbutton.setFocusPainted(false);
        addjobbutton.setFocusable(false);
        addjobbutton.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        addjobbutton.setkBorderRadius(30);
        addjobbutton.setkEndColor(new java.awt.Color(255, 255, 255));
        addjobbutton.setkForeGround(new java.awt.Color(0, 0, 0));
        addjobbutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        addjobbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addjobbutton.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        addjobbutton.setkPressedColor(new java.awt.Color(204, 204, 204));
        addjobbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        addjobbutton.setkStartColor(new java.awt.Color(255, 255, 255));
        addjobbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addjobbuttonMouseClicked(evt);
            }
        });
        addjobbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjobbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addjobnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addjobbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(addjoberrorlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addjobnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjobbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addjoberrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adddebtsvaluefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adddebtsvaluefieldKeyReleased
        
    }//GEN-LAST:event_adddebtsvaluefieldKeyReleased

    private void adddebtsnamefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adddebtsnamefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_adddebtsnamefieldKeyReleased

    private void adddebtsnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddebtsnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adddebtsnamefieldActionPerformed

    private void addofferedvaluefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addofferedvaluefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addofferedvaluefieldKeyReleased

    private void addofferednamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addofferednamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addofferednamefieldActionPerformed

    private void addofferednamefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addofferednamefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addofferednamefieldKeyReleased

    private void addofferedidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addofferedidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addofferedidfieldActionPerformed

    private void addjobnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjobnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addjobnamefieldActionPerformed

    private void addjobnamefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addjobnamefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_addjobnamefieldKeyReleased

    private void adddebtbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddebtbuttonMouseClicked
        String id = adddebtsidfield.getText();
        String name = adddebtsnamefield.getText();
        String value = adddebtsvaluefield.getText();
        
        
        if(name.equals("")&&id.equals("")||value.equals("")){
            adddebtserrorlabel.setForeground(Color.red);
            adddebtserrorlabel.setText("Enter all information");
        }else if(!name.equals("")&&!id.equals("")){
            if(database.select_employee_with_name(name).size() == 0){
                adddebtserrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("No employee with this id");
            }
            else if(database.select_employee_with_id(Integer.parseInt(id)).size() == 0){
                adddebtserrorlabel.setForeground(Color.red);
                adddebtserrorlabel.setText("No employee with this id");
            }

            
            else{
                try{
                database.update_debts_with_id(Integer.parseInt(id), Double.parseDouble(value));
                database.update_total(Integer.parseInt(id), -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(Integer.parseInt(id))[0],database.get_employee_name_phone_with_id(Integer.parseInt(id))[1], 2, Double.parseDouble(value), id);

                adddebtserrorlabel.setForeground(Color.green);
                adddebtserrorlabel.setText("add seuccessefly");
                adddebtsidfield.setText("");
                adddebtsnamefield.setText("");
                adddebtsvaluefield.setText("");
                }catch(NumberFormatException fx){
                    adddebtserrorlabel.setForeground(Color.red);
                    adddebtserrorlabel.setText("Enter a valid value");
                }
            }
        }
   
        else if(!name.equals("")){
            if(database.select_employee_with_name(name).size() > 1){
                adddebtserrorlabel.setForeground(Color.red);
                adddebtserrorlabel.setText("there is "+database.select_employee_with_name(name).size()+" employee with this name" );
            }else if(database.select_employee_with_name(name).size() == 0){
                adddebtserrorlabel.setForeground(Color.red);
                adddebtserrorlabel.setText("No employee with this name");
            }
            
            else{
                try{
                database.update_debts_with_name(name, Double.parseDouble(value));
                database.update_total_with_name(name, -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(database.select_employee_with_name(name).get(0))[0],database.get_employee_name_phone_with_id(database.select_employee_with_name(name).get(0))[1], 2, Double.parseDouble(value), id);

                adddebtserrorlabel.setForeground(Color.GREEN);
                adddebtserrorlabel.setText("add seuccessefly");
                adddebtsidfield.setText("");
                adddebtsnamefield.setText("");
                adddebtsvaluefield.setText("");
            
                }catch(NumberFormatException fx){
                    adddebtserrorlabel.setForeground(Color.red);
                    adddebtserrorlabel.setText("Enter a valid value");
                }
            }
        }else if(!id.equals("")){
            if(database.select_employee_with_id(Integer.parseInt(id)).size() == 0){
                System.out.println(database.select_employee_with_id(Integer.parseInt(id)).size());
                adddebtserrorlabel.setForeground(Color.red);
                adddebtserrorlabel.setText("No employee with this id");
            }
            else{
                try{
                database.update_debts_with_id(Integer.parseInt(id), Double.parseDouble(value));
                database.update_total(Integer.parseInt(id), -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(Integer.parseInt(id))[0],database.get_employee_name_phone_with_id(Integer.parseInt(id))[1], 2, Double.parseDouble(value), id);

                adddebtserrorlabel.setForeground(Color.GREEN);
                adddebtserrorlabel.setText("add seuccessefly");
                adddebtsidfield.setText("");
                adddebtsnamefield.setText("");
                adddebtsvaluefield.setText("");
                }catch(NumberFormatException fx){
                    adddebtserrorlabel.setForeground(Color.red);
                    adddebtserrorlabel.setText("Enter a valid value");
                }
                
            }
        }
    }//GEN-LAST:event_adddebtbuttonMouseClicked

    private void addofferedbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addofferedbuttonMouseClicked
        String id = addofferedidfield.getText();
        String name = addofferednamefield.getText();
        String value = addofferedvaluefield.getText();
        
        
        if(name.equals("")&&id.equals("")||value.equals("")){
            addofferederrorlabel.setForeground(Color.red);
            addofferederrorlabel.setText("Enter all information");
        }else if(!name.equals("")&&!id.equals("")){
            if(database.select_employee_with_name(name).size() == 0){
                addofferederrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("No employee with this id");
            }
            else if(database.select_employee_with_id(Integer.parseInt(id)).size() == 0){
                addofferederrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("No employee with this id");
            }

            
            else{
                try{
                database.update_offered_with_id(Integer.parseInt(id), Double.parseDouble(value));
                database.update_total(Integer.parseInt(id), -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(Integer.parseInt(id))[0],database.get_employee_name_phone_with_id(Integer.parseInt(id))[1], 2, Double.parseDouble(value), id);

                addofferederrorlabel.setForeground(Color.green);
                addofferederrorlabel.setText("add seuccessefly");
                addofferedidfield.setText("");
                addofferednamefield.setText("");
                addofferedvaluefield.setText("");
                }catch(NumberFormatException fx){
                    addofferederrorlabel.setForeground(Color.red);
                    addofferederrorlabel.setText("Enter a valid value");
                }
            }
        }
   
        else if(!name.equals("")){
            if(database.select_employee_with_name(name).size() > 1){
                addofferederrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("there is "+database.select_employee_with_name(name).size()+" employee with this name" );
            }else if(database.select_employee_with_name(name).size() == 0){
                addofferederrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("No employee with this name");
            }
            
            else{
                try{
                database.update_offered_with_name(name, Double.parseDouble(value));
                database.update_total_with_name(name, -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(database.select_employee_with_name(name).get(0))[0],database.get_employee_name_phone_with_id(database.select_employee_with_name(name).get(0))[1], 2, Double.parseDouble(value), id);

                addofferederrorlabel.setForeground(Color.GREEN);
                addofferederrorlabel.setText("add seuccessefly");
                addofferedidfield.setText("");
                addofferednamefield.setText("");
                addofferedvaluefield.setText("");
            
                }catch(NumberFormatException fx){
                    addofferederrorlabel.setForeground(Color.red);
                    addofferederrorlabel.setText("Enter a valid value");
                }
            }
        }else if(!id.equals("")){
            if(database.select_employee_with_id(Integer.parseInt(id)).size() == 0){
                System.out.println(database.select_employee_with_id(Integer.parseInt(id)).size());
                addofferederrorlabel.setForeground(Color.red);
                addofferederrorlabel.setText("No employee with this id");
            }
            else{
                try{
                database.update_offered_with_id(Integer.parseInt(id), Double.parseDouble(value));
                database.update_total(Integer.parseInt(id), -Double.parseDouble( value));
                database.add_history(database.get_employee_name_phone_with_id(Integer.parseInt(id))[0],database.get_employee_name_phone_with_id(Integer.parseInt(id))[1], 2, Double.parseDouble(value), id);

                addofferederrorlabel.setForeground(Color.GREEN);
                addofferederrorlabel.setText("add seuccessefly");
                addofferedidfield.setText("");
                addofferednamefield.setText("");
                addofferedvaluefield.setText("");
                }catch(NumberFormatException fx){
                    addofferederrorlabel.setForeground(Color.red);
                    addofferederrorlabel.setText("Enter a valid value");
                }
                
            }
        }
    }//GEN-LAST:event_addofferedbuttonMouseClicked

    private void addjobbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addjobbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addjobbuttonMouseClicked

    private void addjobbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjobbuttonActionPerformed
        String name = addjobnamefield.getText();
        if(!name.equals("")){
            database.add_job(name);
            addjobnamefield.setText("");
            addjoberrorlabel.setForeground(Color.green);
            addjoberrorlabel.setText("Add Successfuly");
        }else{
            addjoberrorlabel.setForeground(Color.red);
            addjoberrorlabel.setText("Enter a value");
        }
    }//GEN-LAST:event_addjobbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton adddebtbutton;
    private javax.swing.JLabel adddebtserrorlabel;
    private javax.swing.JTextField adddebtsidfield;
    private javax.swing.JTextField adddebtsnamefield;
    private javax.swing.JTextField adddebtsvaluefield;
    private com.k33ptoo.components.KButton addjobbutton;
    private javax.swing.JLabel addjoberrorlabel;
    private javax.swing.JTextField addjobnamefield;
    private com.k33ptoo.components.KButton addofferedbutton;
    private javax.swing.JLabel addofferederrorlabel;
    private javax.swing.JTextField addofferedidfield;
    private javax.swing.JTextField addofferednamefield;
    private javax.swing.JTextField addofferedvaluefield;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

