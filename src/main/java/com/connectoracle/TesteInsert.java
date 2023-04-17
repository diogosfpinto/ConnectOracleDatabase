package com.connectoracle;

import java.sql.*;

public class TesteInsert {

    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();

        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Chevrolet Corcel', 'Corcel 73')", Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = statement.getGeneratedKeys();

        while(rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println("o ID criado foi: " + id);
        }
    }
}
