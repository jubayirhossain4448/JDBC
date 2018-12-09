
package com.jubayir.service;

import com.jubayir.domain.Purchase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {
    
    static Connection conn = null;
    
    public static void createTable(){
    
    }
    
    public static void insert(Purchase purchase){
    String sql = "insert into summary(id, productName, productCode, qty, unitPrice, totalPrice) values(?,?,?,?,?,?,?)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Purchase getByPurchaseByProductCode(String productCode){
        Purchase purchase = new Purchase();
    String sql = "select * from purchase where productCode = ?";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            purchase.setId(rs.getInt(1));
            purchase.setProductName(rs.getString(2));
            purchase.setProductCode(rs.getString(3));
            purchase.setQty(rs.getInt(4));
            purchase.setUnitPrice(rs.getDouble(5));
            purchase.setTotalPrice(rs.getDouble(6));
            
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return purchase;
    }
    
    public static void insertMain(Purchase purchase){
    if(purchase !=null){
    insert(purchase);
     
    Purchase p = getByPurchaseByProductCode(purchase.getProductCode());
    
    
    }
    }
    
}
