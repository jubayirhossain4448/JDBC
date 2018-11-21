/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.ok;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MAHBUB
 */
public class InsertIntoTable {

    private static Connection con = MysqlConnection.getConnection();

    public static void insertData(Student s) {

        String indata = "insert into employee(id, name, email) value(?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(indata);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();

            System.out.println("Insert Data Success");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateData(Student s) {

        String indata = "update employee set name=?, email=? where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(indata);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getId());
            ps.executeUpdate();

            System.out.println("Update Data Success");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(Student s) {

        String indata = "delete from employee where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(indata);
            ps.setInt(1, s.getId());

            ps.executeUpdate();

            System.out.println("Delete Data Success");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ResultSet getDataById(int id) {
        ResultSet rs = null;
        String sql = "select * from employee where id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

}
