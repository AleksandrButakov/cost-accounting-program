package com.anbngm.db.impl;

import com.anbngm.db.AccountRepository;
import com.anbngm.db.InsertDataAccount;
import com.anbngm.entity.AccountEntity;

import java.sql.SQLException;
import java.util.List;

public class MysqlAccountRepository implements AccountRepository {
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
        InsertDataAccount.insertDataAccount(account.getName(), account.getValue());
    }
}
