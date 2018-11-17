
package com.jubayir.connection.domain.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.connection.domain.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryService {
    static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createTable(){
    String sql = "create table category(id int (11) auto_increment primary key, name varchar(50))";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table has been created Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    public static void insert(Category categirt){
    String sql = "insert into category (name) values(?))";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
         
            ps.executeUpdate();
            System.out.println("Data inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}