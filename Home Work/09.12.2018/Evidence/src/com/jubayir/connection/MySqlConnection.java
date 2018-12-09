
package com.jubayir.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {
    private static final String HOST  ="jdbc:mysql://localhost:3306";
    private static final String DBNAME = "evidencee";
    private static final String URL = HOST + "/" + DBNAME;
    static Connection con = null;
    
    public static Connection getConnection(){
        try {
            con =DriverManager.getConnection(URL, "root", "1234");
            System.out.println("You are Connected now!");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }
    
}
