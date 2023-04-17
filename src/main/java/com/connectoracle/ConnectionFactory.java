package com.connectoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection con;
    public static Connection getConnection(){
        if(con == null){
            con = instance();
        }

        return con;
    }

    private static Connection instance() {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521/xe";
            con = DriverManager.getConnection(url, "system", "Adm1n45");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
