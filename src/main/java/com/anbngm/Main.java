package com.anbngm;

import java.sql.*;

public class Main {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/qa_guru_keeper?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "pass";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {

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


            String sql = "INSERT INTO account (name, value) VALUES ('Maik', 8000)";
            /*
              String sql = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
                + " values (?, ?, ?, ?, ?)";
             PreparedStatement preparedStmt = conn.prepareStatement(sql);
              preparedStmt.setString (1, s.first_name);
              preparedStmt.setString (2, s.last_name);
              preparedStmt.setDate   (3, s.date_created);
              preparedStmt.setBoolean(4, s.is_admin);
              preparedStmt.setInt    (5, s.num_points);


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

            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.execute();


            /*
            while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Total number of books in the table : " + count);
            }
             */

        } catch (SQLException | ClassNotFoundException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            // try { rs.close(); } catch(SQLException se) { /*can't do anything */ }

        }







        // JdbcTemplate template = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

        /*
            implementation(
            'org.postgresql:postgresql:42.3.5',
            'org.springframework:spring-jdbc:5.3.20',
            group: 'mysql', name: 'mysql-connector-java', version: '5.1.13'
    )
         */

        //String accountName = JOptionPane.showInputDialog("Enter your name: ");
        //int balance = Integer.parseInt(JOptionPane.showInputDialog("Input balance: "));

        // AccountEntity account = new AccountEntity()
        //        .setName(accountName)
        //        .setValue(balance);

        // template.update("INSERT INTO account VALUES (1, 5, 60)");



    }

}
