
package posant.databases;

import java.sql.SQLException;
import java.sql.Statement;
import posant.mainapp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

public class db extends maindb{
    
    myDate date;
    private String username;
    private String password;
    public db(String db, String username, String password){
        
        super(db,username,password);

        this.username = username;
        this.password = password;
        date = new myDate();
        
        
    }
    
    public db(){
        super();
        date = new myDate();
    }
    public db(String username, String password){
        super(username,password);
    }
    
    public void create_ini_db(String name){
        this.createdb(name);
        this.usedb(name);
        
        this.create_job_lookup();
        this.create_type_lookup();
        this.create_operation_lookup();
        this.create_work_table();
        this.create_timer_table();
        this.create_salary_table();
        this.create_employee_table();
        this.create_reasons_lookup();
        this.create_archive_table();
        this.create_history_table();
    }
   
    public int resultset_size(ResultSet r){
        int s = 0;
        try{
        
        while(r.next()) s++;
        return s;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       return s;
    }
    
    
    private void create_employee_table(){
        try{
            String sql = "CREATE TABLE Employee("
                    +"id INT AUTO_INCREMENT,"
                    +"Name VARCHAR(50) NOT NULL,"
                    +"Phone VARCHAR(10) NOT NULL DEFAULT '0000000000',"
                    + "Birth_date DATE,"
                    +"Salary_id INT NOT NULL UNIQUE,"
                    +"Work_id INT NOT NULL UNIQUE,"
                    +"PRIMARY KEY(id),"
                    +"CONSTRAINT FK_Employee_Salary FOREIGN KEY (Salary_id)"
                    +"REFERENCES Salary(id),"
                    + "CONSTRAINT FK_Employee_Work FOREIGN KEY(Work_id)"
                    + "REFERENCES Work(id)"
                    +");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
          }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
    
    private void create_timer_table(){
        try{
            String sql = "CREATE TABLE Timer("
                    + "id INT AUTO_INCREMENT,"
                    + "constant_time INT NOT NULL,"
                    + "time INT,"
                    + "close_time VARCHAR(25) NOT NULL DEFAULT 'first' ,"
                    + "PRIMARY KEY(id)"
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
          }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    public void insert_close_timer(){
        
        try{
            String sql = "INSERT INTO Timer(close_time)"
                    + "VALUES( "+date.current_date_time()
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
          }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public DefaultTableModel display_employee(DefaultTableModel model){
        try{
            String sql = 
                      "SELECT e.id, e.Name, e.Phone, e.Birth_date, s.Monthly_salary, "
                    + "s.Daily_salary, s.Debts, s.Offered, s.Total, t.Name, j.Name, w.Start_day "
                    + "From Employee AS e "
                    + "JOIN Salary AS s ON e.Salary_id = s.id "
                    + "JOIN Work AS w ON e.Work_id = w.id "
                    + "JOIN Type_lookup AS t ON s.Type_id = t.id "
                    + "JOIN Job_lookup AS j ON w.Job_id = j.id "
                    + "ORDER BY e.id ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("e.id")),r.getString("e.Name"),r.getString("e.Phone"),r.getString("e.Birth_date"),r.getString("w.Start_day"),r.getString("t.Name"),r.getString("j.Name"),String.valueOf(r.getDouble("s.Monthly_salary")),String.valueOf(r.getDouble("s.Daily_salary")),String.valueOf(r.getDouble("s.Debts")),String.valueOf(r.getDouble("s.Offered")),String.valueOf(r.getDouble("s.Total"))});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public String[] get_employee_with_id(int id){
        String[] result;
        try{
            String sql = 
                      "SELECT e.id, e.Name, e.Phone, e.Birth_date, s.Monthly_salary, "
                    + "s.Daily_salary, s.Debts, s.Offered, t.Name, j.Name, w.Start_day "
                    + "From Employee AS e "
                    + "JOIN Salary AS s ON e.Salary_id = s.id "
                    + "JOIN Work AS w ON e.Work_id = w.id "
                    + "JOIN Type_lookup AS t ON s.Type_id = t.id "
                    + "JOIN Job_lookup AS j ON w.Job_id = j.id "
                    + "WHERE  e.id = "+id+";";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) {
            result = new String[]{String.valueOf(r.getInt("e.id")),r.getString("e.Name"),r.getString("e.Phone"),r.getString("e.Birth_date"),r.getString("w.Start_day"),r.getString("t.Name"),r.getString("j.Name"),String.valueOf(r.getDouble("s.Monthly_salary")),String.valueOf(r.getDouble("s.Daily_salary")),String.valueOf(r.getDouble("s.Debts")),String.valueOf(r.getDouble("s.Offered")),String.valueOf(r.getDouble("s.Monthly_salary")-(r.getDouble("s.Debts")+r.getDouble("s.Offered")))};
             return result;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new String[0];
    }
    public String[] get_employee_with_id_archive(int id){
        String[] result;
        try{
            String sql = 
                      "SELECT  e.Name, e.Phone, e.Birth_date, s.Monthly_salary, "
                    + " w.Start_day "
                    + "From Employee AS e "
                    + "JOIN Salary AS s ON e.Salary_id = s.id "
                    + "JOIN Work AS w ON e.Work_id = w.id "
                    + "WHERE  e.id = "+id+";";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) {
            result = new String[]{r.getString("e.Name"),r.getString("e.Phone"),r.getString("e.Birth_date"),r.getString("w.Start_day"),String.valueOf(r.getDouble("s.Monthly_salary"))};
             return result;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new String[0];
    }
    
    private void create_salary_table(){
        try{
            String sql = "CREATE TABLE Salary("
                    + "id INT AUTO_INCREMENT,"
                    + "Monthly_salary DOUBLE ,"
                    + "Daily_salary DOUBLE ,"
                    + "Debts DOUBLE NOT NULL DEFAULT 0,"
                    + "Offered DOUBLE NOT NULL DEFAULT 0,"
                    + "Total DOUBLE NOT NULL DEFAULT 0,"
                    + "Type_id INT NOT NULL DEFAULT 1,"
                    + "Timer_id INT NOT NULL,"
                    + "PRIMARY KEY(id),"
                    + "CONSTRAINT FK_Type_Lookup FOREIGN KEY(Type_id)"
                    + "REFERENCES Type_Lookup(id),"
                    + "CONSTRAINT FK_Salary_Timer FOREIGN KEY(Timer_id)"
                    + "REFERENCES Timer(id)"
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }   
    
    
    private void create_type_lookup(){
        try{
            String sql = "CREATE TABLE Type_Lookup("
                    + "id INT AUTO_INCREMENT,"
                    + "Name VARCHAR(10) NOT NULL,"
                    + "PRIMARY KEY(id)"
                    + ");";
                    
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            sql = "INSERT INTO Type_Lookup(Name)"
                    + "VALUES('monthly');";
            s.executeUpdate(sql);
            sql = "INSERT INTO Type_Lookup(Name)"
                    + "VALUES('daily');";
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    private void create_work_table(){
        try{
            String sql = "CREATE TABLE Work("
                    + "id INT AUTO_INCREMENT,"
                    + "start_day DATE NOT NULL,"
                    + "end_day DATE,"
                    + "Job_id INT NOT NULL,"
                    + "PRIMARY KEY(id),"
                    + "CONSTRAINT FK_Job_Lookup FOREIGN KEY(Job_id)"
                    + "REFERENCES Job_Lookup(id)"
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    
    private void create_job_lookup(){
        try{
            String sql = "CREATE TABLE Job_Lookup("
                    + "id INT AUTO_INCREMENT,"
                    + "Name VARCHAR(20) NOT NULL,"
                    + "PRIMARY KEY(id)"
                    + ");";
                   
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            sql = "INSERT INTO Job_Lookup(Name) VALUE('Cleaner');";
            s.executeUpdate(sql);
            sql = "INSERT INTO Job_Lookup(Name) VALUE('Acountant');";
            s.executeUpdate(sql);
            sql = "INSERT INTO Job_Lookup(Name) VALUE('Secretary');";
            s.executeUpdate(sql);
            sql = "INSERT INTO Job_Lookup(Name) VALUE('Driver');";
            s.executeUpdate(sql);
            sql = "INSERT INTO Job_Lookup(Name) VALUE('Guarder');";
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    private void create_history_table(){
        try{
            String sql = "CREATE TABLE history("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "employee_name VARCHAR(50) NOT NULL,"
                    + "employee_phone VARCHAR(10) NOT NULL,"
                    + "operation_id INT NOT NULL,"
                    + "value DOUBLE NOT NULL,"
                    + "date DATETIME NOT NULL,"
                    + "PRIMARY KEY(id),"
                    + "CONSTRAINT FK_operationlookup_history FOREIGN KEY(operation_id)"
                    + "REFERENCES operation_lookup(id) "
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void add_history(String name, String phone, int operation_id, Double value,String description){
        try{
            String sql = "INSERT INTO history(employee_name, employee_phone, operation_id, value, date) "
                    + "VALUES(?, ?, ?, ?, ?);";
                    
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setInt(3,operation_id);
            pstmt.setDouble(4, value);
            pstmt.setString(5, date.current_date_time());
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    
    private void create_operation_lookup(){
        try{
            String sql = "CREATE TABLE operation_lookup("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "Name VARCHAR(50) NOT NULL,"
                    + "PRIMARY KEY(id) "
                    + ");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            sql = "INSERT INTO operation_lookup(Name) VALUE('Debt');";
            s.executeUpdate(sql);
            sql = "INSERT INTO operation_lookup(Name) VALUE('Offered');";
            s.executeUpdate(sql);
            sql = "INSERT INTO operation_lookup(Name) VALUE('Pay');";
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void add_job(String name){
        try{
            String sql = "INSERT INTO Job_Lookup(Name) VALUE(?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void add_salary_long(Double monthly_salary,Double daily_salary,Double debts,Double offered,int type_id,int timer_id){
        try{
            String sql = "INSERT INTO Salary(Monthly_salary, Daily_salary, Debts, Offered, Type_id, Timer_id) "
                    + "VALUES("+monthly_salary+","+daily_salary+","+debts+","+offered+","+type_id+","+timer_id+");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
    
    
    public void add_salary_short(Double monthly_salary,Double daily_salary,int type_id, int timer_id){
        try{
            String sql = "INSERT INTO Salary(Monthly_salary, Daily_salary,  Type_id, Timer_id) "
                    + "VALUES("+monthly_salary+","+daily_salary+","+type_id+","+timer_id+");";
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
    
   
    public void add_employee(String name,String phone,String birth_date,int salary_id,int work_id){
        if(!birth_date.equals("--")){
         try{
            
            String sql = "INSERT INTO Employee(Name, Phone, Birth_date, Salary_id, Work_id) "
                    + "VALUES('"+name+"','"+phone+"','"+birth_date+"',"+salary_id+","+work_id+");";
                
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
        }else{   
          try{
            
            String sql = "INSERT INTO Employee(Name, Phone, Salary_id, Work_id) "
                    + "VALUES('"+name+"','"+phone+"',"+salary_id+","+work_id+");";
               
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
          }
        }
    }
    
    public void update_salary(Double monthly_salary,int type_id, int id){
        try{
            
            String sql = "UPDATE salary "
                    + "SET Monthly_salary = ?, Daily_salary = ?, type_id = ? "
                    + " WHERE id = ? "
                    + ";";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, monthly_salary);
            pstmt.setDouble(2, monthly_salary/30);
            pstmt.setInt(3, type_id);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    public void update_employee(String name, int id, String phone, String birth_date){
        try{
            
            String sql = "UPDATE employee "
                    +"SET Name= ?, phone= ?, Birth_date = ? "
                    + " WHERE id = ?"
                    + ";";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3,birth_date);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void update_work(int id, String start_date, int job_id){
        try{
            
            String sql = "UPDATE work  "
                    +"SET Start_day = ?, job_id = ?"
                    + " WHERE id = ?"
                    + ";";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, start_date);
            pstmt.setInt(2, job_id);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
        
            
    
    
    
    
    
    
    
    
    public void add_work(String start_day, int job_id){
        try{
            String sql = "INSERT INTO Work(start_day, job_id)"
                    + "VALUES('"+start_day+"',"+job_id+");";
                   
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    public void select_lookup(javax.swing.JComboBox<String> combo,String table){
        try{
            
            String sql = "SELECT * FROM "+table+";";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
               combo.addItem(r.getString("Name"));
            }
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
    }
        
    public int select_lastid(String table){
        ResultSet r;
        try{
            String sql = "SELECT id FROM  "+table
                    + " ORDER BY id DESC "
                    + "LIMIT 1;";
                   
                    
            Statement s = conn.createStatement();
            r = s.executeQuery(sql);
            while(r.next()){
                return r.getInt("id");
            }
            
            }catch(SQLException ex){
            ex.printStackTrace();
           
        }
        return 0;
    }
    
    public DefaultTableModel search_employee(String name,DefaultTableModel model){
        try{
            String sql = "SELECT e.id, e.Name, e.Phone, e.Birth_date, s.Monthly_salary, "
                    + "s.Daily_salary, s.Debts, s.Offered, t.Name, j.Name, w.Start_day "
                    + "From Employee AS e "
                    + "JOIN Salary AS s ON e.Salary_id = s.id "
                    + "JOIN Work AS w ON e.Work_id = w.id "
                    + "JOIN Type_lookup AS t ON s.Type_id = t.id "
                    + "JOIN Job_lookup AS j ON w.Job_id = j.id "
                    + "WHERE e.Name LIKE '%"+name+"%'"
                    + "ORDER BY e.id;";
            
                   
                    
            Statement s = conn.createStatement();
            
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("e.id")),r.getString("e.Name"),r.getString("e.Phone"),r.getString("e.Birth_date"),r.getString("w.Start_day"),r.getString("t.Name"),r.getString("j.Name"),String.valueOf(r.getDouble("s.Monthly_salary")),String.valueOf(r.getDouble("s.Daily_salary")),String.valueOf(r.getDouble("s.Debts")),String.valueOf(r.getDouble("s.Offered")),String.valueOf(r.getDouble("s.Monthly_salary")-(r.getDouble("s.Debts")+r.getDouble("s.Offered")))});
            }
            }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public String[] search_employee_name(String name){
       
        int i= 0;
        try{
            String sql = "SELECT name FROM employee "
                    + "WHERE name LIKE '%"+name+"%' ;";
            
                   
                    
            Statement s = conn.createStatement();
            
            ResultSet r = s.executeQuery(sql);
            String[] result = new String[this.resultset_size(r)];
            while(r.next()) result[i++] = r.getString("name");
            return result;
            }catch(SQLException ex){
            ex.printStackTrace();
        }
      return new String[0];
    }
    
    
    private  void create_archive_table(){
        try{
            
            String sql = "CREATE TABLE Archive("
                    + "id INT AUTO_INCREMENT,"
                    + "Name VARCHAR(50) NOT NULL,"
                    + "Phone VARCHAR(10) NOT NULL,"
                    + "Birth_date DATE NOT NULL,"
                    + "Start_date DATE NOT NULL,"
                    + "End_date DATE NOT NULL,"
                    + "Monthly_salary DOUBLE NOT NULL,"
                    + "Reason_id INT NOT NULL,"
                    + "PRIMARY KEY(id),"
                    + "CONSTRAINT FK_Archive_reasons_lookup FOREIGN KEY(Reason_id)"
                    + "REFERENCES Reasons_Lookup(id)"
                    + ");";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
 
    private void create_reasons_lookup(){
        try{
            
            String sql = "CREATE TABLE Reasons_Lookup("
                    + "id INT AUTO_INCREMENT,"
                    + "Name VARCHAR(50) NOT NULL,"
                    + "PRIMARY KEY(id)"
                    + ");";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            sql = "INSERT INTO Reasons_Lookup(Name) "
                    + "VALUES('Fired');";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            sql = "INSERT INTO Reasons_Lookup(Name) "
                    + "VALUES('resignation');";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
    public void add_reasons_lookup(String name){
        try{
            
            String sql = "INSERT INTO Reasons_Lookup(Name) "
                    + "VALUES(?);";
                
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void add_archive(int id, int reason){
        String name = this.get_employee_with_id_archive(id)[0];
        String phone = this.get_employee_with_id_archive(id)[1];
        String birth_date = this.get_employee_with_id_archive(id)[2];
        String start_date = this.get_employee_with_id_archive(id)[3];
        String monthly_salary = this.get_employee_with_id_archive(id)[4];
        String end_date = date.current_date();
        try{
            
            String sql = "INSERT INTO Archive(Name, Phone, Birth_date, Start_date, End_date, Monthly_salary, Reason_id) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, birth_date);
            pstmt.setString(4, start_date);
            pstmt.setString(5, end_date);
            pstmt.setString(6, monthly_salary);
            pstmt.setInt(7, reason);
            pstmt.execute();
            this.delete_employee(id);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public void delete_employee(int id){
        try{
            
            String sql = "DELETE FROM employee "
                    + "WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            sql = "DELETE FROM salary "
                    + "WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public DefaultTableModel display_archive(DefaultTableModel model){
        try{
            String sql = 
                      "SELECT * FROM Archive AS a "
                    + "JOIN Reasons_Lookup AS r "
                    + "ON a.Reason_id = r.id "
                    + "ORDER BY a.id ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("a.id")),r.getString("a.Name"),r.getString("a.phone"),r.getString("a.Birth_date"),r.getString("a.Monthly_salary"),r.getString("a.Start_date"),r.getString("a.End_date"),r.getString("r.Name")});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    public DefaultTableModel display_history(DefaultTableModel model){
        try{
            String sql = 
                      "SELECT h.id, h.employee_name, h.employee_phone, o.name , h.value, h.date  FROM history AS h "
                    + "JOIN operation_lookup AS o "
                    + "ON h.operation_id = o.id "
                    + "ORDER BY h.id ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("h.id")),r.getString("h.employee_name"),r.getString("h.employee_phone"),r.getString("o.name"),r.getString("h.date"),String.valueOf(r.getDouble("h.value"))});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public DefaultTableModel search_archive_name(DefaultTableModel model, String name){
        try{
            String sql = 
                      "SELECT * FROM Archive AS a "
                    + "JOIN Reasons_Lookup AS r "
                    + "ON a.Reason_id = r.id "
                    + "WHERE a.Name LIKE '%"+name+"%' ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("a.id")),r.getString("a.Name"),r.getString("a.phone"),r.getString("a.Birth_date"),r.getString("a.Monthly_salary"),r.getString("a.Start_date"),r.getString("a.End_date"),r.getString("r.Name")});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    public DefaultTableModel search_history_name( String name, DefaultTableModel model){
        try{
            String sql = 
                      "SELECT h.id, e.name, o.name, h.value, h.date  FROM history AS h "
                    + "JOIN operation_lookup AS o "
                    + "ON h.operation_id = o.id "
                    + "JOIN employee AS e "
                    + "ON h.employee_id = e.id "
                    + "WHERE e.name LIKE '%"+name+"%' ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("h.id")),r.getString("e.name"),r.getString("o.name"),r.getString("h.date"),String.valueOf(r.getDouble("h.value"))});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public DefaultTableModel search_archive_end_date(DefaultTableModel model, String end_date){
        try{
            String sql = 
                      "SELECT * FROM Archive AS a "
                    + "JOIN Reasons_Lookup AS r "
                    + "ON a.Reason_id = r.id "
                    + "WHERE a.End_date = '%"+end_date+"%' ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("a.id")),r.getString("a.Name"),r.getString("a.phone"),r.getString("a.Birth_date"),r.getString("a.Monthly_salary"),r.getString("a.Start_date"),r.getString("a.End_date"),r.getString("r.Name")});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public DefaultTableModel search_archive_start_date(DefaultTableModel model, String start_date){
        try{
            String sql = 
                      "SELECT * FROM Archive AS a "
                    + "JOIN Reasons_Lookup AS r "
                    + "ON a.Reason_id = r.id "
                    + "WHERE a.Start_date like '%"+start_date+"%' ;";
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                model.addRow(new String[]{String.valueOf(r.getInt("a.id")),r.getString("a.Name"),r.getString("a.phone"),r.getString("a.Birth_date"),r.getString("a.Monthly_salary"),r.getString("a.Start_date"),r.getString("a.End_date"),r.getString("r.Name")});
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return model;
    }
    
    public void add_timer(String type){
        int monthly = 86400 * date.get_month_days();
        int daily = 86400;
        try{
            String sql;
            if(type.equals("monthly")){
                sql = "INSERT INTO Timer(constant_time,time)"
                        + "VALUES( "+monthly+", "+monthly+" ) ;";
            }else{
                sql = "INSERT INTO Timer(constant_time,time)"
                        + "VALUES( "+daily+", "+daily+" ) ;";
            }
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
          }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
    
    public String select_lookup_name(String table,int id){
        try{
            
            String sql = "SELECT Name FROM "+table+" "
                    + "WHERE id = "+id+" ;";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getString("Name");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return new String();
    }
    
    public void pay_event(int id){
        Double salary = this.select_type(id).equals("monthly")?this.select_monthly_salary(id):this.select_daily_salary(id);
        
        String close_time = this.select_close_time(id);
        long constant_time = this.select_constant_time(id);
        db database = new db(dbname,username,password);
        if(close_time.equals("first")){
            long time = this.select_time(id);
            
            date.event_schedule(new Runnable(){
                @Override
                public void run(){
                    database.update_total(id, salary);
                    database.add_history(database.get_employee_name_phone_with_id(id)[0], database.get_employee_name_phone_with_id(id)[1], 3, salary,date.current_date_time());
                    pay_event(id);
                }
            }, time);
        }else{
            long duration = date.duration_two_date(close_time);
            if(duration>0){
                date.event_schedule(new Runnable(){
                @Override
                public void run(){
                    database.update_total(id, salary);
                    database.add_history(database.get_employee_name_phone_with_id(id)[0], database.get_employee_name_phone_with_id(id)[1], 3, salary,date.current_date_time());
                    pay_event(id);
                }
            }, duration);
            }else{
                long time = database.select_constant_time(id)+duration;
                date.event_schedule(new Runnable(){
                @Override
                public void run(){
                    database.update_total(id, salary);
                    database.add_history(database.get_employee_name_phone_with_id(id)[0], database.get_employee_name_phone_with_id(id)[1], 3, salary,date.current_date_time());
                    pay_event(id);
                }
            }, time);
            }
        }
    }
    
    public int select_time(int id){

        try{
            
            String sql = "SELECT t.time FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "JOIN Timer AS t "
                    + "ON s.timer_id = t.id "
                    + "WHERE e.id = "+id+" ;";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getInt("t.time");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0;
    }
    
    public String select_close_time(int id){

        try{
            
            String sql = "SELECT t.close_time FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "JOIN Timer AS t "
                    + "ON s.timer_id = t.id "
                    + "WHERE e.id = "+id+" ;";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getString("t.close_time");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return new String();
    }
    
    public int select_constant_time(int id){

        try{
            
            String sql = "SELECT t.constant_time FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "JOIN Timer AS t "
                    + "ON s.timer_id = t.id "
                    + "WHERE e.id = "+id+" ;";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getInt("t.constant_time");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0;
    }
    
    public void update_total(int id, Double value){
        Double total = this.select_total(id)+value;
        try{
            
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.total = "+total+" "
                    + "WHERE e.id = "+id+" ;";
              
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
    }
     public void update_total_with_name(String name, Double value){
        Double total = this.select_total_with_name(name)+value;
        try{
            
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.total = "+total+" "
                    + "WHERE e.name = '"+name+"' ;";
              
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
    }
    
    public Double select_total(int id){

        try{
            
            String sql = "SELECT s.total FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = "+id+";";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getDouble("s.total");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0.0;
    }
    
    public Double select_total_with_name(String name){

        try{
            
            String sql = "SELECT s.total FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = '"+name+"' ;";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getDouble("s.total");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0.0;
    }
    
    public Double select_monthly_salary(int id){

        try{
            
            String sql = "SELECT s.monthly_salary FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = "+id+";";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getDouble("s.monthly_salary");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0.0;
    }
    
    public Double select_daily_salary(int id){

        try{
            
            String sql = "SELECT s.daily_salary FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = "+id+";";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getDouble("s.daily_salary");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return 0.0;
    }
    
    public String select_type(int id){
        try{
            
            String sql = "SELECT t.name FROM employee AS e "
                    + "JOIN Salary AS s "
                    + "ON e.salary_id = s.id "
                    + "JOIN Type_lookup AS t "
                    + "ON  t.id = s.type_id "
                    + "WHERE e.id = "+id+";";
              
                    
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()) return r.getString("t.name");
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        return new String();
    }
    
    public void update_close_time(String date_time, int id){
        String time = date.current_date_time();
        try{
            
            String sql = "UPDATE timer AS t "
                    + "JOIN salary AS s "
                    + "ON s.timer_id = t.id "
                    + "SET t.close_time = '"+date_time+"' "
                    + "WHERE s.id = ( "
                    + "SELECT e.id FROM employee AS e "
                    + "JOIN salary AS s "
                    + "ON s.id = e.salary_id "
                    + "WHERE e.id = "+id+" "
                    + "); ";
            
              
                    
            Statement s = conn.createStatement();
            s.executeUpdate(sql);
           
           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
    }
    
    public List<Integer> select_employee(){
        try{
            String sql = "SELECT id FROM employee ;";
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            List<Integer> result = new ArrayList<>();
            while(r.next()) result.add(r.getInt("id"));
            return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public List<Integer> select_employee_with_name(String name){
        try{
            String sql = "SELECT id FROM employee "
                    + "WHERE name =  '"+name+"' ;";
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            List<Integer> result = new ArrayList<>();
            while(r.next()) result.add(r.getInt("id"));
            return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    public List<Integer> select_employee_with_id(int id){
        try{
            String sql = "SELECT id FROM employee "
                    + "WHERE id = "+id+" ;";
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery(sql);
            List<Integer> result = new ArrayList<>();
            while(r.next()) result.add(r.getInt("id"));
            return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public void update_debts_with_id(int id, Double new_debts){
        try{
            Double old_debts = this.select_debts_with_id(id).get(0);
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.debts = ? "
                    + "WHERE e.id = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, old_debts+new_debts);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
    }
    
    public void update_debts_with_name(String name, Double new_debts){
        try{
            Double old_debts = this.select_debts_with_name(name).get(0);
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.debts = ? "
                    + "WHERE e.name = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, old_debts+new_debts);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
    }
    
    public void update_offered_with_id(int id, Double new_offered){
        try{
            Double old_debts = this.select_debts_with_id(id).get(0);
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.offered = ? "
                    + "WHERE e.id = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, old_debts+new_offered);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
    }
    
    public void update_offered_with_name(String name, Double new_offered){
        try{
            Double old_debts = this.select_debts_with_name(name).get(0);
            String sql = "UPDATE salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "SET s.offered = ? "
                    + "WHERE e.name = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, old_debts+new_offered);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
    }
    
    public List<Double> select_debts_with_id(int id){
        try{
            
            String sql = "SELECT s.debts FROM salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = "+id+" ;";
           Statement s = conn.createStatement();
           ResultSet r = s.executeQuery(sql);
           List<Double> result = new ArrayList<>();
           while(r.next()) result.add(r.getDouble("s.debts"));
           return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public List<Double> select_debts_with_name(String name){
        try{
            
            String sql = "SELECT s.debts FROM salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.name = '"+name+"' ;";
           Statement s = conn.createStatement();
           ResultSet r = s.executeQuery(sql);
           List<Double> result = new ArrayList<>();
           while(r.next()) result.add(r.getDouble("s.debts"));
           return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public List<Double> select_offered_with_id(int id){
        try{
            
            String sql = "SELECT s.offered FROM salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.id = "+id+" ;";
           Statement s = conn.createStatement();
           ResultSet r = s.executeQuery(sql);
           List<Double> result = new ArrayList<>();
           while(r.next()) result.add(r.getDouble("s.debts"));
           return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public List<Double> select_offered_with_name(String name){
        try{
            
            String sql = "SELECT s.offered FROM salary AS s "
                    + "JOIN  employee AS e "
                    + "ON e.salary_id = s.id "
                    + "WHERE e.name = '"+name+"' ;";
           Statement s = conn.createStatement();
           ResultSet r = s.executeQuery(sql);
           List<Double> result = new ArrayList<>();
           while(r.next()) result.add(r.getDouble("s.debts"));
           return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList();
    }
    
    public String[] get_employee_name_phone_with_id(int id){
        try{
            
            String sql = "SELECT name , phone FROM Employee "
                    + "WHERE id = "+id+";";
           Statement s = conn.createStatement();
           ResultSet r = s.executeQuery(sql);
           String[] result = new String[2];
           while(r.next()){
               result[0] = r.getString("name");
               result[1] = r.getString("phone");
                       }
           return result;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return new String[0];
    }
}


