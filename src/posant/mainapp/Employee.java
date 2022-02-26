
package posant.mainapp;


import posant.mainapp.Employee_frames.*;
import posant.databases.db;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JPanel {

    db database;
    String dbname;
    protected String username;
    protected String password;
    DefaultTableModel model;
    public Employee(String db, String username, String password) {
       
        dbname = db;
        database = new db(dbname , username, password);
        this.username = username;
        this.password = password;
        initComponents();
        
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
        
    }
    public Employee(){
        
    }

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeesearchfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        refreshbutton = new javax.swing.JButton();
        kButton1 = new com.k33ptoo.components.KButton();

        setBackground(new java.awt.Color(255, 255, 255));

        employeesearchfield.setBackground(new java.awt.Color(0, 102, 153));
        employeesearchfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        employeesearchfield.setForeground(new java.awt.Color(51, 51, 51));
        employeesearchfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        employeesearchfield.setCaretColor(new java.awt.Color(204, 204, 204));
        employeesearchfield.setOpaque(false);
        employeesearchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeesearchfieldKeyReleased(evt);
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
        jLabel2.setText("Employee");

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Phone", "Birth Date", "Start Date", "Type", "Job", "Monthly Salary", "Daily Salary", "Debts", "Offered", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        kButton1.setBorder(null);
        kButton1.setText("Add Employee");
        kButton1.setBorderPainted(false);
        kButton1.setFocusPainted(false);
        kButton1.setFocusable(false);
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(employeesearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshbutton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(employeesearchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employeesearchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeesearchfieldKeyReleased
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        database.search_employee(employeesearchfield.getText(), model);
        
    }//GEN-LAST:event_employeesearchfieldKeyReleased

    private void employeetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetableMouseClicked
        int r = employeetable.getSelectedRow();
        new EmployeeProfile(dbname,username,password,Integer.parseInt(employeetable.getValueAt(r, 0).toString())).setVisible(true);
    }//GEN-LAST:event_employeetableMouseClicked

    private void refreshbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbuttonMouseClicked
        model = (DefaultTableModel) employeetable.getModel();
        model.setNumRows(0);
        load_table();
    }//GEN-LAST:event_refreshbuttonMouseClicked

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        new AddEmployee(dbname,username,password).setVisible(true);
    }//GEN-LAST:event_kButton1MouseClicked
    public  void load_table(){
        model = (DefaultTableModel) employeetable.getModel();
        database.display_employee(model);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeesearchfield;
    public javax.swing.JTable employeetable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JButton refreshbutton;
    // End of variables declaration//GEN-END:variables
}
