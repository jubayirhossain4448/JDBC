package com.jubayir.test;

import com.jubayir.form.CreateTableUsingMysql;
import com.jubayir.form.MySqlDbConnection;

public class Test {

    public static void main(String[] args) {
        MySqlDbConnection.getConnection();
        //CreateTableUsingMysql.createTable();
    }

}
