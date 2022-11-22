package com.anbngm;

import com.anbngm.db.InsertDataAccount;

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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        for (int i = 1; i < 11; i++) {
            InsertDataAccount.insertDataAccount("Petro" + i, 155.55 + i);
        }

        InsertDataAccount.closeConnectionBd();

    }

}