package com.anbngm.db;

import com.anbngm.entity.AccountEntity;

import java.sql.SQLException;
import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();
    AccountEntity getByName();
    void addAccount(AccountEntity account) throws SQLException, ClassNotFoundException;


}
