package com.zhanglin;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 12:28 am 9/07/2020
 */
public class DBUtil {
    private static volatile DataSource dataSource = null;

    public static Connection getConnection() throws SQLException {
        if(dataSource == null) {
            synchronized ( DBUtil.class) {
                if(dataSource == null) {
                    dataSource = initDataSource();
                }
            }
        }
        return dataSource.getConnection();
    }

    private  static DataSource initDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("zhl19990207803");
        mysqlDataSource.setDatabaseName("hjb_0709");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf-8");
        return mysqlDataSource;
    }

}
