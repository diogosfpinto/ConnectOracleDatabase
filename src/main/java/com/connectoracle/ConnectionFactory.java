package com.connectoracle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory() {
    }

    private static Connection con;
    public static Connection getConnection(){
        if(con == null){
            con = instance();
        }

        return con;
    }

    private static Connection instance() {
        try {
            String url = AppProperties.getValue("database.url");
            con = DriverManager.getConnection(
                    url,
                    AppProperties.getValue("database.user"),
                    AppProperties.getValue("database.password"));
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
