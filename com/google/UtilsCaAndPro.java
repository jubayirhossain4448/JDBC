/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UtilsCaAndPro {

    private static final Connection con = MysqlConnection.getConnection();

    public static void insertCategory(Category c) {
        String sql = "insert into category(id, name) values(?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            ps.executeUpdate();

            System.out.println("Data Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(UtilsCaAndPro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insertProduct(Product p) {
        String sql = "insert into product(name, qty, unitPrice, totalPrice, parchaseDate, catId) values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setDouble(3, p.getUnitPrice());
            ps.setDouble(4, p.getTotalPrice());
            ps.setDate(5, new java.sql.Date(p.getParchaseDate().getTime()));
            ps.setInt(6, p.getCategory().getId());
            ps.executeUpdate();

            System.out.println("Data Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(UtilsCaAndPro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    

}
