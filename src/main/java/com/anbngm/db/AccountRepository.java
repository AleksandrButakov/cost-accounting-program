package com.anbngm.db;

import com.anbngm.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();
    AccountEntity getByName();

}
