package com.anbngm;

import com.anbngm.db.AccountRepository;
import com.anbngm.db.InsertDataAccount;
import com.anbngm.db.impl.MysqlAccountRepository;
import com.anbngm.entity.AccountEntity;

import javax.swing.*;
import java.sql.*;

public class Main {

    static AccountRepository accountRepository = new MysqlAccountRepository();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        for (int i = 1; i < 11; i++) {
//            InsertDataAccount.insertDataAccount("Petro" + i, 155.55 + i);
//        }

        String accountName = JOptionPane.showInputDialog("Enter your name:");
        int balance = Integer.parseInt(JOptionPane.showInputDialog("Enter your balance"));

        AccountEntity account = new AccountEntity()
                .setName(accountName)
                .setValue(balance);

        accountRepository.addAccount(account);
        //InsertDataAccount.insertDataAccount(account.getName(), account.getValue());

        //close connection ,stmt and resultset here
        InsertDataAccount.closeConnectionBd();

    }

}