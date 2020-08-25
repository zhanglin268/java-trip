package com.lin.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 11:01 am 22/08/2020
 */
public class DButil {
    private static volatile DataSource dataSource = null;
    private static DataSource initDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.01");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("zhl19990207803");
        mysqlDataSource.setDatabaseName("pro_tingshu");
        mysqlDataSource.setCharacterEncoding("utf-8");
        mysqlDataSource.setUseSSL(false);


        return (DataSource) mysqlDataSource;

    }
    public static Connection getConnection() throws SQLException {
        if(dataSource == null) {
            synchronized (DButil.class) {
                if(dataSource == null) {
                    dataSource = initDataSource();
                }
            }
        }
        return dataSource.getConnection();
    }


}
