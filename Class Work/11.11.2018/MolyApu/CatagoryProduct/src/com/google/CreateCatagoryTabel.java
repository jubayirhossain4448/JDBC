
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateCatagoryTabel {
    private static Connection conn = MysqlConnection.getConnection();
    
    public static void catagoryTable(){
    String sql ="create table catagory(id int(11) auto_increment primary key, name varchar(30))";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create Table");
        } catch (SQLException ex) {
            Logger.getLogger(CreateCatagoryTabel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
