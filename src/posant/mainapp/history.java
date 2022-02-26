
package posant.mainapp;


import posant.mainapp.Employee_frames.*;
import posant.databases.db;
import javax.swing.table.DefaultTableModel;

public class history extends javax.swing.JPanel {
    protected String username;
    protected String password;
    db database;
    String dbname;
    DefaultTableModel model;
    public history(String db,String username, String password) {
       
        dbname = db;
        database = new db(dbname , username, password);
        this.username = username;
        this.password = password;
        initComponents();
        
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
        
    }
    public history(){
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historysearchfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        refreshbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        historysearchfield.setBackground(new java.awt.Color(0, 102, 153));
        historysearchfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        historysearchfield.setForeground(new java.awt.Color(51, 51, 51));
        historysearchfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        historysearchfield.setCaretColor(new java.awt.Color(204, 204, 204));
        historysearchfield.setOpaque(false);
        historysearchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                historysearchfieldKeyReleased(evt);
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
        jLabel2.setText("History");

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "employee_name", "operation", "date_time", "value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 687, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(historysearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historysearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historysearchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_historysearchfieldKeyReleased
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        database.search_history_name(historysearchfield.getText(), model);
        
    }//GEN-LAST:event_historysearchfieldKeyReleased

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
        model = (DefaultTableModel) employeetable.getModel();
        database.display_history(model);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable employeetable;
    private javax.swing.JTextField historysearchfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshbutton;
    // End of variables declaration//GEN-END:variables
}
