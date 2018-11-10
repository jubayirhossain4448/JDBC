
package com.jubayir.jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoTable {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static void insertData(){
    
        String sql = "insert into division(id, name) values(1, 'Dhaka')";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertData2(int diId, String n){
    
        String sql = "insert into division(id, name) values(?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, diId);
            ps.setString(2, n);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateData(int diId, String n){
    
        String sql = "update division set name = ? where id = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n);
           ps.setInt(2, diId);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
