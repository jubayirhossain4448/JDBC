package com.jubayir.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.domain.ProductCategory;
import com.jubayir.domain.Purchase;
import com.jubayir.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductCategoryService {

    static Connection conn = MySqlDbConnection.getConnection();

//    private int id;
//    private String productName;
//    private String productCode;
//    private int quantity;
//    private double unitprice;
//    private double totalPrice;
//    private Date purchasedate;
    public static void createTable() {
        String sql = "create table category(id int auto_increment primary key, Name varchar(30) not null)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(ProductCategory cat) {
        String sql = "insert into category(Name) values(?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cat.getName());
            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
