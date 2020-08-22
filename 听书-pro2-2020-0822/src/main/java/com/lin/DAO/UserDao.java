package com.lin.DAO;

import com.lin.model.User;
import com.lin.util.DButil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 11:17 am 22/08/2020
 */

/**
 * 用户密码不要保存明文密码
 * 如果数据从你这泄露了 ，则所有的用户密码都泄露了
 * 一般都是保存做完hash密码，
 */
public class UserDao {
    public User insert (String username,String plainPassword) throws SQLException {
        String password = encrypt(plainPassword);
        String sql = "insert into users(username,password) values(?,?)";
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){

                s.setString(1,username);
                s.setString(2,password);
                s.executeUpdate();

                try(ResultSet r = s.getGeneratedKeys()) {
                    if(!r.next()) {
                        return null;
                    }
                    return new User(r.getInt(1),username);
                }
            }
        }

    }
    public User select(String username,String password) throws SQLException {
        String sql = "select uid from users where username = ? and password = ?";
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setString(1,username);
                s.setString(2,password);
                try(ResultSet r = s.executeQuery()) {
                    if(!r.next()) {
                        return null;
                    }
                    return new User(r.getInt(1),username);
                }
            }
        }

    }
    private String encrypt(String plain) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = plain.getBytes();
            byte[] digest = messageDigest.digest(bytes);
            StringBuilder sb = new StringBuilder();
            for(byte b : digest) {
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw  new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String a = "123";
        UserDao userDao = new UserDao();
        String encrypt = userDao.encrypt(a);
        System.out.println(encrypt);
    }
}
