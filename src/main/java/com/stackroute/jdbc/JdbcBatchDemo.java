package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
    public void jdbcBatchDemo() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement stmt=connection.createStatement();
            stmt.addBatch("insert into employee values(5,'sowmya',21,'F')");
            stmt.addBatch("insert into employee values(6,'lavanya',20,'M')");
            stmt.executeBatch();//executing the batch

            connection.commit();
            connection.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}