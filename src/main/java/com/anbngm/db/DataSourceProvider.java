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

    Connection dbConn = null;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String dbHost = "localhost";
        String dbPort = "3306";
        String dbName = "qa_guru_keeper?serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        String dbUser = "root";
        String dbPass = "pass";

        dbConn = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConn;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();

            String sql = "INSERT INTO account (name, value) VALUES (?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, "Ivan");
            preparedStmt.setDouble(2, 155.22);
            preparedStmt.execute();

        } catch (SQLException |
                 ClassNotFoundException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) { /*can't do anything */ }
            // try { rs.close(); } catch(SQLException se) { /*can't do anything */ }

        }


    }






/*
    public Connection getDbMysqlConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // for (int i = 10; i < 15; i++) {
            //    stmt.executeUpdate("INSERT INTO test.books VALUES (" + i + ", 'Java concurrency in Practice', 'Brian Goetz')");
            // }

            // executing SELECT query
            //stmt.executeUpdate("UPDATE test.books SET author='rrrrrr' WHERE author='Joshua Block'");
            // rs = stmt.executeQuery("SELECT COUNT(*) FROM qa_guru_keeper.accounts");
            //stmt.executeQuery("INSERT INTO account VALUES (2, 5, 60)");

/*
            String sql = "INSERT INTO account (name, value) VALUES ('Maik', 8000)";
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.execute();
            */

/*
              String sql = "INSERT INTO account (name, value) VALUES (?, ?)";
             PreparedStatement preparedStmt = con.prepareStatement(sql);
              preparedStmt.setString (1, "dsdsdsdsdss");
              preparedStmt.setString (2, 34);

              Catch any SQL exceptions that may come up during the process.

              catch (Exception e)
              {
              System.err.println("Got an exception!");
              // printStackTrace method
              // prints line numbers + call stack
              e.printStackTrace();
              // Prints what exception has been thrown
              System.out.println(e);
              }

*/

            /*
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            }
             */

            /*
        } catch (SQLException | ClassNotFoundException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ //}
            /*
            try {
                stmt.close();
            } catch (SQLException se) { /*can't do anything */ //}
    // try { rs.close(); } catch(SQLException se) { /*can't do anything */ //}

    //}


}