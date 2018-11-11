
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertCatagoryTableData {
    private static Connection conn = MysqlConnection.getConnection();
    
    public static void insertCatagoryData(Category c){
    String sql="insert into catagory(name) values(?)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, c.getName());
            ps.executeUpdate();
            System.out.println("Insert Table");
        } catch (SQLException ex) {
            Logger.getLogger(InsertCatagoryTableData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
