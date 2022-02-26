
package posant.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import posant.mainapp.Home;


public abstract class maindb {
    public Connection conn = null;
    public String dbname;
    private String username;
    private String password;
    public  maindb(String db,String username, String password){
        dbname = db;
        this.password = password;
        this.username = username;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+db,username, password);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public maindb(){
        
    }
    
    public  maindb(String username, String password){
        this.password = password;
        this.username = username;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost",username, password);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void createdb(String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost",username, password);
            Statement s = conn.createStatement();
            s.executeUpdate("CREATE DATABASE "+name+";");
          }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void create_logging_db(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost",username, password);
            Statement s = conn.createStatement();
            s.executeUpdate("CREATE DATABASE logging;");
          }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void usedb(String name){
        try{
            Statement s = conn.createStatement();
            s.executeUpdate("use "+name+";");
          }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
   protected void logging_connect(String username, String password){
       try{
           this.username = username;
           this.password = password;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/logging",username, password);
        }catch(Exception e){
            this.create_logging_db();
            this.logging_connect(username, password);
            this.create_logging_table();
        }
   }
   
   protected void close_connection(){
       try{
           conn.close();
       }catch(SQLException ex){
           ex.printStackTrace();
       }
   }
   
    private void create_logging_table(){
       try{
           Statement s = conn.createStatement();
           String sql = "CREATE TABLE users("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "Name VARCHAR(50) NOT NULL,"
                    + "Password INT NOT NULL,"
                    + "PRIMARY KEY(id)"
                    + ");";
            s.executeUpdate(sql);
       }catch(SQLException ex){
           ex.printStackTrace();
       }catch(Exception e){
           e.addSuppressed(e);
       }
   }

}
