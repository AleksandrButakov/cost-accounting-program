package com.anbngm.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataAccount {
    private static Connection dbConn = null;
    public static void insertDataAccount(String name, double value) throws SQLException, ClassNotFoundException {
        if (dbConn == null) {
            dbConn = DataSourceProvider.INSTANCE.getDbConnection(dbConn);
        }


        try {
            String sql = "INSERT INTO account (name, value) VALUES (?, ?)";
            // PreparedStatement preparedStmt = dbConn.prepareStatement(sql);
            PreparedStatement preparedStmt = dbConn.prepareStatement(sql);
            preparedStmt.setString(1, name);
            preparedStmt.setDouble(2, value);
            preparedStmt.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void closeConnectionBd() {
        //close connection ,stmt and resultset here
        try {
            dbConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
