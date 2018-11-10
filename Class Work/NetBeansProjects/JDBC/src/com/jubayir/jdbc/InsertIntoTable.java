package com.jubayir.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoTable {

    private static Connection conn = MySqlDbConnection.getConnection();

    public static void insertData() {

        String sql = "insert into division(id, name) values(1, 'Dhaka')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertData2(int diId, String n) {

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

    public static void updateData(int diId, String n) {

        String sql = "update division set name=? where id=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, n);  // Name field will be first.
            ps.setInt(2, diId);  // DiId field will be last.
            ps.executeUpdate();
            System.out.println("Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteData() { //No need to give any parameter

        String sql = "delete from division where id =3";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();// No need to write setInt and setString method.
            System.out.println("Data Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void getDataById(int id) {
    String sql = "select * from division where id=?";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                System.out.println("id: " + rs.getInt(1) + " Name: " + rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
