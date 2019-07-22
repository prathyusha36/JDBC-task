package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public void jdbcTransactionDemo() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement stmt=connection.createStatement();
            stmt.executeUpdate("insert into employee values(7,'vinay',21,'M')");
            stmt.executeUpdate("insert into employee values(8,'keerthi',20,'F')");

            connection.commit();
            connection.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
