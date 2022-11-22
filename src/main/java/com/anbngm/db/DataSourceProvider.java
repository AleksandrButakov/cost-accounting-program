package com.anbngm.db;

import java.sql.*;

public enum DataSourceProvider {
    INSTANCE;

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/qa_guru_keeper?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "pass";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public Connection getDbConnection(Connection dbConn) throws ClassNotFoundException, SQLException {
        if (dbConn == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbHost = "localhost";
            String dbPort = "3306";
            String dbName = "qa_guru_keeper?serverTimezone=UTC";
            String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
            String dbUser = "root";
            String dbPass = "pass";
            dbConn = DriverManager.getConnection(connectionString, dbUser, dbPass);
        }
        return dbConn;
    }

}