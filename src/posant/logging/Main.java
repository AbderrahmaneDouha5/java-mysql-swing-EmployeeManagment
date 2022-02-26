
package posant.logging;
import java.awt.Color;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import posant.databases.*;
import posant.mainapp.*;
import posant.mainapp.Employee_frames.*;
import posant.mainapp.Home;

public class Main {
    
    public static void main(String[] args){
       new LoggingPage("root","f56bsh15vuy").setVisible(true);
    }
}
