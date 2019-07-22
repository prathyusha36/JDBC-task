package com.stackroute.jdbc;


public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println("----------");
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println("----------");
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println("----------");
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("meghana","M");
        System.out.println("----------");
        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        databaseMetadataDemo.databaseMetadataDemo();
        System.out.println("----------");
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        jdbcBatchDemo.jdbcBatchDemo();
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.jdbcTransactionDemo(); System.out.println("----------");
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSetMetadataDemo();
        System.out.println("----------");
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.rowSetDemo();
        rowSetDemo.cachedSetDemo();
    }
}
