
package com.jubayir.service;

import com.jubayir.domain.Summary;
import static com.jubayir.service.PurchaseService.conn;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SummaryService {
    
    public static void create() {
        String sql = "create table summary(id int (11) primary key, name varchar (45), code varchar(45), tQty int (11), availQty int, soldQty int, product_id int (11))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void insert(Summary summary){
         String sql = "create table summary(id, name, code, tQty, availQty, soldQty, product_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getId());
            ps.setString(2, summary.getName());
            ps.setString(3, summary.getCode());
            ps.setInt(4, summary.gettQty());
            ps.setDouble(5, summary.getAvailQty());
            ps.setDouble(6, summary.getSoldQty());
           // ps.setInt(7, summary.getProductCode);
            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void update(Summary summary){
    
    }
    
    public static Summary getSummaryByProductCode(String code){
    
        return null;
    }
    
}
