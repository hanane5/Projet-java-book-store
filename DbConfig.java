package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static String DBURL = "jdbc:oracle:thin:@//localhost:1521:xe";
    private static String USERDB = "system";
    private static String USERPASS = "estsb";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(DBURL,USERDB,USERPASS);
    }


}
