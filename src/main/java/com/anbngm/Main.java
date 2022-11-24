package com.anbngm;

import com.anbngm.db.AccountRepository;
import com.anbngm.db.DataSourceProvider;
import com.anbngm.db.InsertDataAccount;
import com.anbngm.db.impl.MysqlAccountRepository;
import com.anbngm.entity.AccountEntity;

import javax.swing.*;
import java.sql.*;

public class Main {

    static AccountRepository accountRepository = new MysqlAccountRepository();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection dbConn;
//        dbConn = DataSourceProvider.INSTANCE.getDataSource().getConnection();

        String accountName = JOptionPane.showInputDialog("Enter your name:");
        int balance = Integer.parseInt(JOptionPane.showInputDialog("Enter your balance"));

        AccountEntity account = new AccountEntity()
                .setName(accountName)
                .setValue(balance);

        accountRepository.addAccount(account);


//        try {
//            String sql = "INSERT INTO account (name, value) VALUES (?, ?)";
//            // PreparedStatement preparedStmt = dbConn.prepareStatement(sql);
//            PreparedStatement preparedStmt = dbConn.prepareStatement(sql);
//            preparedStmt.setString(1, "name");
//            preparedStmt.setDouble(2, 155.21);
//            preparedStmt.execute();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //close connection ,stmt and resultset here
//        try {
//            dbConn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }





        /*
        String accountName = JOptionPane.showInputDialog("Enter your name:");
        int balance = Integer.parseInt(JOptionPane.showInputDialog("Enter your balance"));

        AccountEntity account = new AccountEntity()
                .setName(accountName)
                .setValue(balance);

        accountRepository.addAccount(account);
        //InsertDataAccount.insertDataAccount(account.getName(), account.getValue());

        //close connection ,stmt and resultset here
        InsertDataAccount.closeConnectionBd();
*/
    //}

}