
package posant.mainapp;


import posant.databases.db;


public class Home extends javax.swing.JFrame {
    String dbname;
    db database ;
    Archive a;
    Employee e;
    Operations o;
    history h;
    protected String username;
    protected String password;
    JpanelLoader panelloader = new JpanelLoader();
    public Home(String d, String username, String password) {
        dbname = d;
        database = new db(dbname,username,password);
        e = new Employee(dbname,username,password);
        a = new Archive(dbname,username,password);
        o = new Operations(dbname, username, password);
        h = new history(dbname,username, password);
        this.username = username;
        this.password = password;
        initComponents();
   
        set_close_time();
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        operationsbutton = new com.k33ptoo.components.KButton();
        employeebutton = new com.k33ptoo.components.KButton();
        archivebutton = new com.k33ptoo.components.KButton();
        historybutton = new com.k33ptoo.components.KButton();
        mainpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        operationsbutton.setBorder(null);
        operationsbutton.setText("Operations");
        operationsbutton.setFocusPainted(false);
        operationsbutton.setFocusable(false);
        operationsbutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        operationsbutton.setkEndColor(new java.awt.Color(255, 255, 255));
        operationsbutton.setkForeGround(new java.awt.Color(0, 0, 0));
        operationsbutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        operationsbutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        operationsbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        operationsbutton.setkStartColor(new java.awt.Color(255, 255, 255));
        operationsbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operationsbuttonMouseClicked(evt);
            }
        });

        employeebutton.setBorder(null);
        employeebutton.setText("Employee");
        employeebutton.setFocusPainted(false);
        employeebutton.setFocusable(false);
        employeebutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        employeebutton.setkEndColor(new java.awt.Color(255, 255, 255));
        employeebutton.setkForeGround(new java.awt.Color(0, 0, 0));
        employeebutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        employeebutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        employeebutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        employeebutton.setkStartColor(new java.awt.Color(255, 255, 255));
        employeebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeebuttonMouseClicked(evt);
            }
        });

        archivebutton.setBorder(null);
        archivebutton.setText("Archive");
        archivebutton.setFocusPainted(false);
        archivebutton.setFocusable(false);
        archivebutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        archivebutton.setkEndColor(new java.awt.Color(255, 255, 255));
        archivebutton.setkForeGround(new java.awt.Color(0, 0, 0));
        archivebutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        archivebutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        archivebutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        archivebutton.setkStartColor(new java.awt.Color(255, 255, 255));
        archivebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archivebuttonMouseClicked(evt);
            }
        });

        historybutton.setBorder(null);
        historybutton.setText("History");
        historybutton.setFocusPainted(false);
        historybutton.setFocusable(false);
        historybutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        historybutton.setkEndColor(new java.awt.Color(255, 255, 255));
        historybutton.setkForeGround(new java.awt.Color(0, 0, 0));
        historybutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        historybutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        historybutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        historybutton.setkStartColor(new java.awt.Color(255, 255, 255));
        historybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historybuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operationsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(archivebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(employeebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(operationsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(archivebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(historybutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        getContentPane().add(mainpanel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1180, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void operationsbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operationsbuttonMouseClicked
       panelloader.jPanelLoader(mainpanel, o);
    }//GEN-LAST:event_operationsbuttonMouseClicked

    private void employeebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeebuttonMouseClicked
        panelloader.jPanelLoader(mainpanel, e);
    }//GEN-LAST:event_employeebuttonMouseClicked

    private void archivebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivebuttonMouseClicked
        panelloader.jPanelLoader(mainpanel, a);
    }//GEN-LAST:event_archivebuttonMouseClicked

    private void historybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historybuttonMouseClicked
        panelloader.jPanelLoader(mainpanel, h);
    }//GEN-LAST:event_historybuttonMouseClicked
    
    private void set_close_time(){
        Thread register = new Thread(() -> {
            for(Integer x : database.select_employee()) database.update_close_time(new myDate().current_date_time(), x);
        });
        Runtime.getRuntime().addShutdownHook(register);
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton archivebutton;
    private com.k33ptoo.components.KButton employeebutton;
    private com.k33ptoo.components.KButton historybutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainpanel;
    private com.k33ptoo.components.KButton operationsbutton;
    // End of variables declaration//GEN-END:variables
}
