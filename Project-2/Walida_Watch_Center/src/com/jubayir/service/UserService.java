
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
    String sql = "create table user (id auto_increment primary key, "
            + "username varchar(30), password varchar(30) not null, "
            + "firstName varchar(30), lastName varchar(30), email varchar (30),"
            + " mobile varchar(30), regiDate Date, status bit)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void insert (User user){
        String sql = "insert into user()";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
