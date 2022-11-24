package com.anbngm.db.impl;

import com.anbngm.db.AccountRepository;
import com.anbngm.db.DataSourceProvider;
import com.anbngm.db.InsertDataAccount;
import com.anbngm.entity.AccountEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MysqlAccountRepository implements AccountRepository {
    private static Connection dbConn = null;

    //dbConn = DataSourceProvider.INSTANCE.getDataSource().getConnection();

    @Override
    public List<AccountEntity> getAll() {
        return null;
    }

    @Override
    public AccountEntity getByName() {
        return null;
    }

    @Override
    public void addAccount(AccountEntity account) throws SQLException, ClassNotFoundException {
        if (dbConn == null) {
            dbConn = DataSourceProvider.INSTANCE.getDataSource().getConnection();
        }
        String sql = "INSERT INTO account (name, value) VALUES (?, ?)";
        // PreparedStatement preparedStmt = dbConn.prepareStatement(sql);
        PreparedStatement preparedStmt = dbConn.prepareStatement(sql);

        preparedStmt.setString(1, account.getName());
        preparedStmt.setDouble(2, account.getValue());
        preparedStmt.execute();

        dbConn.close();

        //InsertDataAccount.insertDataAccount(account.getName(), account.getValue());
        //InsertDataAccount.closeConnectionBd();
    }
}
