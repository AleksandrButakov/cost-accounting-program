package com.anbngm.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    MysqlDataSource ds;

    public DataSource getDataSource() {
        if (ds == null) {
            ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPortNumber(3306);
            ds.setDatabaseName("some-mysql");
            ds.setUser("root");
            ds.setPassword("pass");

        }
        return ds;
    }

}
