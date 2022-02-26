
package posant.mainapp.Employee_frames;

import java.awt.Color;
import posant.databases.db;
import posant.mainapp.*;

public class AddEmployee extends javax.swing.JFrame {
    protected String username;
    protected String password;
    db database ;
    String dbname;
    myDate date;
    public AddEmployee(String db,String username, String password) {
        dbname = db;
        database = new db(dbname , username, password);
        this.username = username;
        this.password = password;
        date = new myDate();
        initComponents();
        second_ini();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addemployeenamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addemployeephonefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addemployeesalaryfield = new javax.swing.JTextField();
        addemployeejobcombo = new javax.swing.JComboBox<>();
        addemployeetypecombo = new javax.swing.JComboBox<>();
        addemployeeerrorlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addemployeebrithdateyearcombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addemployeebrithdatemonthcombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        addemployeebrithdatedaycombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        addemployeestartdateyearcombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addemployeestartdatemonthcombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        addemployeestartdatedaycombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addemployeebutton = new com.k33ptoo.components.KButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE
        );
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        addemployeenamefield.setBackground(new java.awt.Color(0, 153, 153));
        addemployeenamefield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        addemployeenamefield.setForeground(new java.awt.Color(204, 204, 204));
        addemployeenamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addemployeenamefield.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        addemployeephonefield.setBackground(new java.awt.Color(0, 153, 153));
        addemployeephonefield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        addemployeephonefield.setForeground(new java.awt.Color(204, 204, 204));
        addemployeephonefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addemployeephonefield.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salary");

        addemployeesalaryfield.setBackground(new java.awt.Color(0, 153, 153));
        addemployeesalaryfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        addemployeesalaryfield.setForeground(new java.awt.Color(255, 255, 255));
        addemployeesalaryfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        addemployeesalaryfield.setOpaque(false);

        addemployeeerrorlabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        addemployeeerrorlabel.setForeground(new java.awt.Color(255, 0, 51));
        addemployeeerrorlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Birth Date");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("year:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("month:");

        addemployeebrithdatemonthcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeebrithdatemonthcomboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("day:");

        addemployeebrithdatedaycombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeebrithdatedaycomboActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("year:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Start Date");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("month:");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("day:");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Type:");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Job:");

        addemployeebutton.setBorder(null);
        addemployeebutton.setText("Add Employee");
        addemployeebutton.setBorderPainted(false);
        addemployeebutton.setFocusPainted(false);
        addemployeebutton.setFocusable(false);
        addemployeebutton.setkBorderRadius(20);
        addemployeebutton.setkEndColor(new java.awt.Color(255, 255, 255));
        addemployeebutton.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        addemployeebutton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        addemployeebutton.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        addemployeebutton.setkPressedColor(new java.awt.Color(255, 255, 255));
        addemployeebutton.setkSelectedColor(new java.awt.Color(255, 255, 255));
        addemployeebutton.setkStartColor(new java.awt.Color(51, 51, 51));
        addemployeebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addemployeebuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(addemployeeerrorlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addemployeephonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(addemployeesalaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addemployeenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addemployeebrithdateyearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addemployeebrithdatemonthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addemployeebrithdatedaycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addemployeejobcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addemployeestartdateyearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addemployeestartdatemonthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addemployeetypecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addemployeestartdatedaycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addemployeebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addemployeenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(addemployeephonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addemployeesalaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addemployeebrithdateyearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(addemployeebrithdatemonthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(addemployeebrithdatedaycombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addemployeestartdateyearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(addemployeestartdatemonthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(addemployeestartdatedaycombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addemployeetypecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addemployeejobcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addemployeebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addemployeeerrorlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addemployeebrithdatemonthcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeebrithdatemonthcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addemployeebrithdatemonthcomboActionPerformed

    public boolean chekc_phone(String phone){
        return false;
    }
    private void addemployeebrithdatedaycomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeebrithdatedaycomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addemployeebrithdatedaycomboActionPerformed

    private void addemployeebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemployeebuttonMouseClicked
        String name = addemployeenamefield.getText();
        String phone = addemployeephonefield.getText();
        String salary = addemployeesalaryfield.getText();
        String birth_year =  (String) addemployeebrithdateyearcombo.getSelectedItem();
        String birth_month =(String) addemployeebrithdatemonthcombo.getSelectedItem();
        String birth_day = (String) addemployeebrithdatedaycombo.getSelectedItem();
        String start_year = (String) addemployeestartdateyearcombo.getSelectedItem();
        String start_month = (String) addemployeestartdatemonthcombo.getSelectedItem();
        String start_day = (String) addemployeestartdatedaycombo.getSelectedItem();
        
        Integer phone_in;
        Double salary_doub;
        if(name.equals("")||phone.equals("")||salary.equals("")||birth_year.equals("--")||birth_month.equals("--")||birth_day.equals("--")||start_year.equals("--")||start_month.equals("--")||start_day.equals("--")){
            addemployeeerrorlabel.setForeground(Color.red);
            addemployeeerrorlabel.setText("Enter all information");

        }else{
            if(phone.length()!=10){
                addemployeeerrorlabel.setForeground(Color.red);
                addemployeeerrorlabel.setText("Enter a valid phone number");
            }else{
                String birth_date = date.form_date(Integer.parseInt(birth_year), Integer.parseInt(birth_month), Integer.parseInt(birth_day));
                String start_date = date.form_date( Integer.parseInt(start_year) , Integer.parseInt(start_month),Integer.parseInt(start_day));
                try{
                    phone_in = Integer.parseInt(phone);
                }catch(NumberFormatException nfe){
                    addemployeeerrorlabel.setForeground(Color.red);
                    addemployeeerrorlabel.setText("Enter a valid phone number");   
                }
                try{
                    salary_doub = Double.parseDouble(salary);
                }catch(NumberFormatException nfe){
                    addemployeeerrorlabel.setForeground(Color.red);
                    addemployeeerrorlabel.setText("Enter a valid salary");   
                }
                database.add_timer(database.select_lookup_name("Type_lookup", addemployeetypecombo.getSelectedIndex()+1));
                database.add_salary_short(Double.parseDouble(salary), Double.parseDouble(salary)/30, addemployeetypecombo.getSelectedIndex()+1, database.select_lastid("Timer"));
                database.add_work(start_date, addemployeejobcombo.getSelectedIndex()+1);
                database.add_employee(name, phone,birth_date ,database.select_lastid("Salary"),database.select_lastid("Work") );
                database.pay_event(database.select_lastid("employee"));
                dispose();
            }
        }
        
        
        
    }//GEN-LAST:event_addemployeebuttonMouseClicked
    private void second_ini(){
       
        database.select_lookup(addemployeejobcombo,"job_lookup");
        database.select_lookup(addemployeetypecombo, "type_lookup");
        date.display_all(addemployeebrithdateyearcombo, addemployeebrithdatemonthcombo, addemployeebrithdatedaycombo);
        date.display_all(addemployeestartdateyearcombo, addemployeestartdatemonthcombo, addemployeestartdatedaycombo);
        addemployeestartdateyearcombo.setSelectedItem(date.current_year());
        addemployeestartdatemonthcombo.setSelectedItem(date.current_month());
        addemployeestartdatedaycombo.setSelectedItem(date.current_day());
    }   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addemployeebrithdatedaycombo;
    private javax.swing.JComboBox<String> addemployeebrithdatemonthcombo;
    private javax.swing.JComboBox<String> addemployeebrithdateyearcombo;
    private com.k33ptoo.components.KButton addemployeebutton;
    private javax.swing.JLabel addemployeeerrorlabel;
    private javax.swing.JComboBox<String> addemployeejobcombo;
    private javax.swing.JTextField addemployeenamefield;
    private javax.swing.JTextField addemployeephonefield;
    private javax.swing.JTextField addemployeesalaryfield;
    private javax.swing.JComboBox<String> addemployeestartdatedaycombo;
    private javax.swing.JComboBox<String> addemployeestartdatemonthcombo;
    private javax.swing.JComboBox<String> addemployeestartdateyearcombo;
    private javax.swing.JComboBox<String> addemployeetypecombo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
