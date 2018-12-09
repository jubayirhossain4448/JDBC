package com.jubayir.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.domain.Purchase;
import com.jubayir.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection conn = MySqlDbConnection.getConnection();

//    private int id;
//    private String productName;
//    private String productCode;
//    private int quantity;
//    private double unitprice;
//    private double totalPrice;
//    private Date purchasedate;
    
    public static void createTable() {
        String sql = "create table purchase(id int auto_increment primary key, productName varchar(30) "
                + "not null, productCode varchar(30) not null, quantity int(11) not null, unitprice double not null,"
                + " totalPrice double not null, purchasedate Date not null, cat_id int (11) not null,"
                + " foreign key (cat_id) references category(id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(Purchase purchase) {
        String sql = "insert into purchase(productName, productCode,  quantity, unitprice, totalPrice, "
                + "purchasedate, cat_id) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getProductName());
            ps.setString(2, purchase.getProductCode());
            ps.setInt(3, purchase.getQuantity());
            ps.setDouble(4, purchase.getUnitprice());
            ps.setDouble(5, purchase.getTotalPrice());
            ps.setDate(6, new java.sql.Date(purchase.getPurchasedate().getTime()));
            ps.setInt(7, purchase.getProductCatagory().getId());

            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
