package com.stackroute.jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {

    public void rowSetDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //Creating and Executing RowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

            rowSet.setUrl("jdbc:mysql://localhost:3306/tables");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from employee");
            rowSet.execute();

            while (rowSet.next()) {

                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("age: " + rowSet.getInt(3));
                System.out.println("gender: " + rowSet.getString(4));
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cachedSetDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

            //Creating and Executing RowSet
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowSet = factory.createCachedRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/tables");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from employee");
            rowSet.execute();

            while (rowSet.next()) {

                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("age: " + rowSet.getInt(3));
                System.out.println("gender: " + rowSet.getString(4));
            }

        }
        catch ( SQLException e) {
            e.printStackTrace();
        }
    }
}
