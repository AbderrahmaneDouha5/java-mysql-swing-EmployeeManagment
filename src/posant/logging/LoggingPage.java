

package posant.logging;

import java.awt.Color;
import posant.databases.*;
import posant.mainapp.Home;
public class LoggingPage extends javax.swing.JFrame {

    Loggingdb database;
    protected String username;
    protected String password;
    public LoggingPage(String username,String password) {
        database = new Loggingdb(username,password);
        this.username = username;
        this.password = password;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loggingnamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loggingpasswordfield = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loggingerrorlabel = new javax.swing.JLabel();
        singupbutton = new com.k33ptoo.components.KButton();
        singinbutton = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posant/logging/icons8-user-100.png"))); // NOI18N

        loggingnamefield.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        loggingnamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        loggingnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggingnamefieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:");

        loggingpasswordfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        loggingpasswordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggingpasswordfieldActionPerformed(evt);
            }
        });

        jLabel3.setText("PassWord:");

        loggingerrorlabel.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        loggingerrorlabel.setForeground(new java.awt.Color(255, 0, 51));
        loggingerrorlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        singupbutton.setBorder(null);
        singupbutton.setForeground(new java.awt.Color(0, 0, 0));
        singupbutton.setText("Sing Up");
        singupbutton.setBorderPainted(false);
        singupbutton.setFocusPainted(false);
        singupbutton.setFocusable(false);
        singupbutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        singupbutton.setkBorderRadius(35);
        singupbutton.setkEndColor(new java.awt.Color(255, 255, 255));
        singupbutton.setkFillButton(false);
        singupbutton.setkForeGround(new java.awt.Color(0, 0, 0));
        singupbutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        singupbutton.setkHoverForeGround(new java.awt.Color(51, 51, 51));
        singupbutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        singupbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        singupbutton.setkStartColor(new java.awt.Color(51, 51, 51));
        singupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singupbuttonMouseClicked(evt);
            }
        });

        singinbutton.setBorder(null);
        singinbutton.setForeground(new java.awt.Color(0, 0, 0));
        singinbutton.setText("Sing In");
        singinbutton.setBorderPainted(false);
        singinbutton.setFocusPainted(false);
        singinbutton.setFocusable(false);
        singinbutton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        singinbutton.setkBorderRadius(35);
        singinbutton.setkEndColor(new java.awt.Color(102, 102, 102));
        singinbutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        singinbutton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        singinbutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        singinbutton.setkSelectedColor(new java.awt.Color(204, 204, 204));
        singinbutton.setkStartColor(new java.awt.Color(0, 0, 0));
        singinbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singinbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loggingnamefield)
                        .addComponent(loggingpasswordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(singupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(singinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(loggingerrorlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggingnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggingpasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(loggingerrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loggingnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggingnamefieldActionPerformed
        
    }//GEN-LAST:event_loggingnamefieldActionPerformed

    private void loggingpasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggingpasswordfieldActionPerformed
        
    }//GEN-LAST:event_loggingpasswordfieldActionPerformed

    private void singupbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singupbuttonMouseClicked
        String name = loggingnamefield.getText();
        int l_password = loggingpasswordfield.getText().hashCode();
        if(name.equals("")||loggingpasswordfield.getText().equals("")) {
            loggingerrorlabel.setForeground(Color.red);
            loggingerrorlabel.setText("User name and password are required");
            
          
        }else{
            if(!database.chekPass(name, l_password)) {
                loggingerrorlabel.setForeground(Color.red);
                loggingerrorlabel.setText("There is no account with this entiries");
            }else{
                new Home(name+"_db", username, password).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_singupbuttonMouseClicked

    private void singinbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singinbuttonMouseClicked
        String name = loggingnamefield.getText();
        int l_password = loggingpasswordfield.getText().hashCode();
        if(name.equals("")||loggingpasswordfield.getText().equals("")) {
            loggingerrorlabel.setForeground(Color.red);
            loggingerrorlabel.setText("User name and password are required");
            
          
        }else{
            if(database.checkName(name)) {
                loggingerrorlabel.setForeground(Color.red);
                loggingerrorlabel.setText("this user name is already used");
            }else{
                database.insert(name, l_password);
                new db(username,password).create_ini_db(name+"_db");
                new Home(name+"_db", username, password).setVisible(true);
                this.dispose();
                
            }
            
        }
    }//GEN-LAST:event_singinbuttonMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loggingerrorlabel;
    private javax.swing.JTextField loggingnamefield;
    private javax.swing.JPasswordField loggingpasswordfield;
    private com.k33ptoo.components.KButton singinbutton;
    private com.k33ptoo.components.KButton singupbutton;
    // End of variables declaration//GEN-END:variables

}
