
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertProductTable {
    private static Connection conn = MysqlConnection.getConnection();
    
    public static void inserProTable(Product p){
    String sql = "insert into product(pro_name, quantity, unit_price, total_price,purchase_date,cat_id) values(?,?,?,?,?,?)";
      
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setDouble(3, p.getUnitPrice());
            ps.setDouble(4, p.getTotalPrice());
            ps.setDate(5, new java.sql.Date(p.getPurchesDate().getTime()));
            ps.setInt(6, p.getCatagory().getId());
            ps.executeUpdate();
            System.out.println("Data Insert Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}
