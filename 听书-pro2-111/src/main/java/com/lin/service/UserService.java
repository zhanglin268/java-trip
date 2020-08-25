package com.lin.service;

import com.lin.DAO.UserDao;
import com.lin.model.User;

import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 4:50 pm 22/08/2020
 */

/**
 *
 * 提供偏向业务角度的方法
 */
public class UserService {
    private UserDao userDao;
    public UserService() {
        userDao = new UserDao();
    }
    public User register(String username,String password) throws SQLException {
        return userDao.insert(username,password);
    }
    public User login(String username,String password) throws SQLException {
        return userDao.select(username,password);
    }
}
