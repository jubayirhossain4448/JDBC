package com.jubayir.service;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection conn = null;

    public static void createTable() {

    }

    public static void insert(Purchase purchase) {
        String sql = "insert into purchase(id, productName, productCode, qty, unitPrice, totalPrice) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, purchase.getId());
            ps.setString(2, purchase.getProductName());
            ps.setString(3, purchase.getProductCode());
            ps.setInt(4, purchase.getQty());
            ps.setDouble(5, purchase.getUnitPrice());
            ps.setDouble(6, purchase.getTotalPrice());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Purchase getByPurchaseByProductCode(String productCode) {
        Purchase purchase = new Purchase();
        String sql = "select * from purchase where productCode = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setProductName(rs.getString(2));
                purchase.setProductCode(rs.getString(3));
                purchase.setQty(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotalPrice(rs.getDouble(6));

            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return purchase;
    }

//    public static void insertMain(Purchase purchase) {
//        if (purchase != null) {
//            insert(purchase);
//
//            try {
//                Purchase p = getByPurchaseByProductCode(purchase.getProductCode());
//               // Summary summary = SummaryService.getByPurchaseByProductCode(purchase.getProductCode());
//                if (purchase.getProductCode().equalsIgnoreCase(summary.getProductCode())) {
//                    int totalQty = summary.getTotalQty() + purchase.getQty();
//                    int availQty = summary.getAvailableQty() + purchase.getQty();
//                    summary.setTotalQty(totalQty);
//                    summary.setAvailableQty(availQty);
//
//                }
//            } catch (Exception e) {
//              //  Summary summary3 = new Summary(purchase.getId(), purchase.getProductName(), purchase.getProductCode(), purchase.getQty(), purchase.getUnitPrice(), purchase.getTotalPrice());
//                SummaryService.insert(summary3);
//            }
//
//        }
//    }

}
