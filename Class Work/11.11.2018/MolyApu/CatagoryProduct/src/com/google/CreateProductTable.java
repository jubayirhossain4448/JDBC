
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateProductTable {
    private static Connection conn = MysqlConnection.getConnection();
    
    public static void productTable(){
     String sql = "create table product(pro_id int(7) auto_increment primary key, pro_name varchar(20), quantity int(11), unit_price double,total_price double, purchase_date Date, cat_id int(11), foreign key(cat_id) references catagory(id))"; 
     
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
             System.out.println("Table create successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CreateProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
