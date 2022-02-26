
package posant.databases;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Loggingdb extends maindb{
    
    
    
    public Loggingdb(String username, String password){
        super();
        this.logging_connect(username, password);
        
        
    }
        public boolean checkName(String name){
        try{
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery("SELECT name FROM users WHERE name='"+name+"';");
            if(r.next()) return true;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
    public boolean chekPass(String name,int pass){
     try{
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery("select * from users  where name = '"+name+"' and password='"+pass+"';");
            if(r.next()) return true;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;   
    }
    

    
    public void insert(String name,int pass){
        if(this.checkName(name)){
            System.out.println("this name is already used");
        }else{
          try{
            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO users(name,password) values('"+name+"','"+pass+"');");
          }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
   }
    
   
    
}