package com.connectoracle;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        Connection con = ConnectionFactory.getConnection();

        System.out.println("Fechando conexao");
        con.close();

    }
}