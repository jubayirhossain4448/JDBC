package com.jubayir.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {

    static Connection conn = MySqlDbConnection.getConnection();

    public static void createTable() {
        String sql = "create table user(id int auto_increment primary key, username varchar(30) "
                + "not null, password varchar(30) not null, userType varchar(30) not null, firstName varchar(30),"
                + " lastName varchar (30), email varchar(30) not null, mobile varchar(30) "
                + "not null, regiDate Date, status bit)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(User user) {
        String sql = "insert into user(username, password,  userType, firstName, lastName, "
                + "email, mobile, regiDate, status) values(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getUserType());
            ps.setString(4, user.getFirstName());
            ps.setString(5, user.getLastName());
            ps.setString(6, user.getEmail());
            ps.setString(7, user.getMobile());
            ps.setDate(8, new java.sql.Date(user.getRegiDate().getTime()));
            ps.setBoolean(9, user.isStatus());

            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static User getUserbyUserName(String username, String password, boolean status) {
        User user = null;
        String sql = "select * from user where username= ? and password=? and status = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setBoolean(3, status);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();

                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setUserType(rs.getString(4));
                user.setFirstName(rs.getString(5));
                user.setLastName(rs.getString(6));
                user.setEmail(rs.getString(7));
                user.setMobile(rs.getString(8));
                user.setRegiDate(rs.getDate(9));
                user.setStatus(rs.getBoolean(10));

            }
            ps.execute();
            System.out.println("Table has been created");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;

    }

}
