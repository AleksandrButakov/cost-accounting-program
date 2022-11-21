package com.anbngm.db;

import java.sql.*;

public enum DataSourceProvider {
    INSTANCE;

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/some-mysql?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "pass";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;







    Connection dbConn = null;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String dbHost = "localhost";
        String dbPort = "3306";
        String dbName = "some-mysql";

        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        String dbUser = "root";
        String dbPass = "pass";

        dbConn = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConn;
    }

}