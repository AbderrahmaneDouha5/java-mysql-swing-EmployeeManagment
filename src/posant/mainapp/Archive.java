/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package posant.mainapp;


import posant.mainapp.Employee_frames.*;
import posant.databases.db;
import javax.swing.table.DefaultTableModel;

public class Archive extends javax.swing.JPanel {
    myDate date;
    db database;
    String dbname;
    protected String username;
    protected String password;
    DefaultTableModel model;
    public Archive(String db, String username, String password) {
        dbname = db;
        database = new db(dbname, username ,password);
        date = new myDate();
        this.username = username;
        this.password = password;
        initComponents();
        
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
        
    }
    public Archive(){
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archivesearchnamefield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        refreshbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        archivesearchnamefield.setBackground(new java.awt.Color(0, 102, 153));
        archivesearchnamefield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        archivesearchnamefield.setForeground(new java.awt.Color(51, 51, 51));
        archivesearchnamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        archivesearchnamefield.setCaretColor(new java.awt.Color(204, 204, 204));
        archivesearchnamefield.setOpaque(false);
        archivesearchnamefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                archivesearchnamefieldKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Archive");

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Phone", "Birth Date", "Monthly Salary", "Start Date", "End Date", "Reason"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employeetable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeetable.setDropMode(javax.swing.DropMode.ON);
        employeetable.setRowHeight(25);
        employeetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeetableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(employeetable);

        refreshbutton.setText("refresh");
        refreshbutton.setFocusPainted(false);
        refreshbutton.setFocusable(false);
        refreshbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshbuttonMouseClicked(evt);
            }
        });
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(687, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(archivesearchnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshbutton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archivesearchnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void archivesearchnamefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_archivesearchnamefieldKeyReleased
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        database.search_archive_name(model, archivesearchnamefield.getText());
    }//GEN-LAST:event_archivesearchnamefieldKeyReleased

    private void employeetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetableMouseClicked
        
    }//GEN-LAST:event_employeetableMouseClicked

    private void refreshbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbuttonMouseClicked
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
    }//GEN-LAST:event_refreshbuttonMouseClicked

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        
    }//GEN-LAST:event_refreshbuttonActionPerformed
    public  void load_table(){
        model =  (DefaultTableModel) employeetable.getModel();
        database.display_archive(model);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField archivesearchnamefield;
    private javax.swing.JTable employeetable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshbutton;
    // End of variables declaration//GEN-END:variables
}
