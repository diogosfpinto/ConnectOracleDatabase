package com.connectoracle;

import java.sql.*;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {
        Connection repository = ConnectionFactory.getConnection();

        PreparedStatement pst = repository.prepareStatement("SELECT * FROM produto");
        pst.execute();

        ResultSet rst = pst.getResultSet();

        while (rst.next()){
            Integer id = rst.getInt("ID");
            String nome = rst.getString("NOME");
            String descricao = rst.getString("DESCRICAO");

            System.out.println(id);
            System.out.println(nome);
            System.out.println(descricao);
        }


    }
}
