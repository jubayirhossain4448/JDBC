
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListCategoryData {
    private static Connection conn = MysqlConnection.getConnection();
    
    public static List<Category> getCategory(){
    List<Category> list = new ArrayList<>();
    String sql = "select * from catagory";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            list.add(new Category(rs.getInt(1),rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListCategoryData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
