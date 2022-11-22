package com.anbngm;

import com.anbngm.db.InsertDataAccount;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        for (int i = 1; i < 11; i++) {
            InsertDataAccount.insertDataAccount("Petro" + i, 155.55 + i);
        }

        //close connection ,stmt and resultset here
        InsertDataAccount.closeConnectionBd();

    }

}