/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CreatingTable {
    
    private static final Connection con=MysqlConnection.getConnection();
    
    public static void createTableCa(){
    
    String sql="create table category(id int(10) primary key, name varchar(20))";
    
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.execute();
            System.out.println("Create Success category Table");
            
        } catch (SQLException ex) {
            Logger.getLogger(CreatingTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    /////////////product table/////////////////
    
    public static void createTablePro() {
        String sql="create table product(id int(10) auto_increment primary key, name varchar(20), qty int(11), unitPrice double, totalPrice double, parchaseDate Date, catId int(10), foreign key(catId) references category(id))";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.execute();
            System.out.println("Create Success Product Table");
        } catch (SQLException ex) {
            Logger.getLogger(CreatingTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        //createTableCa();
        createTablePro();
        
    }
    
}
