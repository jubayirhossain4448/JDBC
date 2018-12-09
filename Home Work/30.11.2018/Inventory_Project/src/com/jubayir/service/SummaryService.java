package com.jubayir.service;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.domain.Purchase;
import com.jubayir.domain.Summary;
import com.jubayir.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {

    static Connection conn = MySqlDbConnection.getConnection();

//private int id;
 //   private String productName;
   // private String productCode;
//    private int totalQuantity;
//    private double soldQuantity;
//    private double availableQuentity;
//    private Date lastUpdate;
//    
//    // For Foreign key
//    Purchase purchase;
    
    public static void createTable() {
        String sql = "create table summary(id int auto_increment primary key, productName varchar(50) not null, productCode varchar(30) not null, totalQuantity int(11) "
                + "not null, soldQuantity int(11) not null, availableQuentity int(11) not null, lastUpdate Date, product_id int (11) not null,"
                + " foreign key (product_id) references purchase(id))";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created into Summary Table");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insert(Summary summary) {
        String sql = "insert into summary(productName, productCode, totalQuantity"
                + ", soldQuantity, availableQuentity, lastUpdate Date, product_id,"
                + ") values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getProductName());
            ps.setString(2, summary.getProductCode());
            ps.setInt(3, summary.getTotalQuantity());
            ps.setDouble(4, summary.getSoldQuantity());
            ps.setDouble(5, summary.getAvailableQuentity());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(7, summary.getPurchase().getId());

            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void update(Summary summary) {
        String sql = "update summary set totalQuantity = ?,"
                + "soldQuantity = ?, availableQuentity = ?, lastUpdate Date = ? where productCode = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getTotalQuantity());
            ps.setInt(2, summary.getSoldQuantity());
            ps.setInt(3, summary.getAvailableQuentity());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(5, summary.getPurchase().getId());

            ps.executeUpdate();
            System.out.println("Data has been updated");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
