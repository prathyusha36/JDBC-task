package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void resultSetMetadataDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "Root@123");
            PreparedStatement ps = connection.prepareStatement("select * from employee");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total columns: "+rsmd.getColumnCount());
            for(int i=1;i<=rsmd.getColumnCount();i++) {
                System.out.println("Column Name of 1st column: " + rsmd.getColumnName(i));
                System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(i));
            }
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
