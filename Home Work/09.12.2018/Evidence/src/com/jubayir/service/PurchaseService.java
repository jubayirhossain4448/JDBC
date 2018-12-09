package com.jubayir.service;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection conn = null;

    public static void create() {
        String sql = "create table purchase(id int (11) primary key, name varchar (45), code varchar(45), qty int (11), uprice double, tprice double)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void insert(Purchase purchase) {

        String sql = "create table purchase(id, name, code, qty, uprice, tprice) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, purchase.getId());
            ps.setString(2, purchase.getName());
            ps.setString(3, purchase.getCode());
            ps.setInt(4, purchase.getQty());
            ps.setDouble(5, purchase.getUprice());
            ps.setDouble(6, purchase.getTprice());
            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update() {

    }

    public static Purchase getPurchaseByProductCode(String productCode) {
        Purchase purchase = new Purchase();
        String sql = "select * from purchase where productCode =?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            purchase.setId(rs.getInt(sql));
            purchase.setName(rs.getString(2));
            purchase.setCode(rs.getString(3));
            purchase.setQty(rs.getInt(4));
            purchase.setUprice(rs.getDouble(5));
            purchase.setTprice(rs.getDouble(6));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return purchase;
    }

    public static void insertMain(Purchase purchase) {
        if (purchase != null) {
            insert(purchase);

            Purchase p = getPurchaseByProductCode(purchase.getCode());
            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getCode());
                if (purchase.getCode().equalsIgnoreCase(summary.getCode())) {
                    int totalQty = summary.gettQty() + purchase.getQty();
                    int availableQty = summary.getAvailQty() + purchase.getQty();
                    summary.settQty(totalQty);
                    summary.setAvailQty(availableQty);
                }
                SummaryService.update(summary);
            } catch (Exception e) {
                Summary summary3 = new Summary(purchase.getId(), purchase.getName(), purchase.getCode(), purchase.getQty(), 0, purchase.getQty(), p);
            }
        }
    }
    
    public static List<Purchase>getProductList(){
    List<Purchase> list = new ArrayList<>();
    String sql = "select * from purchase";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Purchase purchase = new Purchase();
            purchase.setId(rs.getInt(1));
            purchase.setName(rs.getString(2));
            purchase.setCode(rs.getString(3));
            purchase.setQty(rs.getInt(4));
            purchase.setUprice(rs.getDouble(5));
            purchase.setTprice(rs.getDouble(6));
            list.add(purchase);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return list;
    }

}
