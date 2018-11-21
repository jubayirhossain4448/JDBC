
package com.jubayir.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {
    static Connection conn = MySqlDbConnection.getConnection();
    
    public void createTable(){
    String sql = "create table user(id int auto_increment primary key, "
            + "username varchar(30) not null, password varchar(30) not null, userType varchar(30)"
            + " not null, firstName varchar(30), lastName varchar(30), email varchar(30) not null,"
            + " mobile varchar(30) not null, regiDate Date, status bit)";
    
    }
    
    public void insert(User user){
        String sql = "";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
