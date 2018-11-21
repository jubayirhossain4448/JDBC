/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class Lists {
    private static final Connection con=MysqlConnection.getConnection();
    
    public static List<Product> getProductList(){
    List<Product> products=new ArrayList<>();
    String sql="select * from product";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) { 
                Category c=new Category();
                c.setId(rs.getInt(7));
                products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), c));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Lists.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return products;
    }
    
    
    
    public static List<Category> getCategoryList(){
    List<Category> categorys=new ArrayList<>();
        String sql="select * from category";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                categorys.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Lists.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return categorys;
    }
    
    
}
