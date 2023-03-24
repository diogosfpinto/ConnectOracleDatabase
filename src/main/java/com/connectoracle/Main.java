package com.connectoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "Adm1n45");

            System.out.println("Fechando conexão");
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}