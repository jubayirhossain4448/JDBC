package com.jubayir.connection;

import java.sql.Connection;

/**
 *
 * @author Rajaul Islam
 */
public class TestMySqlConnection {
    public static void main(String[] args) {
        Connection conn=MySqlDbConnection.getConnection();
    }
 
}
