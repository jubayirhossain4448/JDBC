
package com.jubayir.service;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Sales;
import com.jubayir.domain.Summary;
import static com.jubayir.service.PurchaseService.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {
    
    public static void create() {
        String sql = "create table sales(id int (11) primary key, name varchar (45), code varchar(45), qty int (11), uprice double, tprice double)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table has been created!");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public static void insert(Sales sales){
         String sql = "create table sales(id, name, code, qty, uprice, tprice) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sales.getId());
            ps.setString(2, sales.getName());
            ps.setString(3, sales.getCode());
            ps.setInt(4, sales.getQty());
            ps.setDouble(5, sales.getUprice());
            ps.setDouble(6, sales.getTprice());
            ps.executeUpdate();
            System.out.println("Data has been inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void insertForSales(Sales sales){
        if(sales != null){
        Summary summary = SummaryService.getSummaryByProductCode(sales.getCode());
        if(summary.getAvailQty() >= sales.getQty()){
            insert(sales);
            int soldQrt = summary.getSoldQty() + sales.getQty();
            int availQty = summary.getAvailQty() - sales.getQty();
            summary.setSoldQty(soldQrt);
            summary.setAvailQty(availQty);
        SummaryService.update(summary);
        }else{
            System.out.println("You do not have sufficient Product");
        }
        }
    
    }
    
    public static List<Sales>getProductList(){
    List<Sales> list = new ArrayList<>();
    String sql = "select * from sales";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Sales sales = new Sales();
            sales.setId(rs.getInt(1));
            sales.setName(rs.getString(2));
            sales.setCode(rs.getString(3));
            sales.setQty(rs.getInt(4));
            sales.setUprice(rs.getDouble(5));
            sales.setTprice(rs.getDouble(6));
            list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return list;
    }
    
}
