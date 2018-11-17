package com.jubayir.example.connection;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection con = MySqlConnection.getConnection();
    }

}
