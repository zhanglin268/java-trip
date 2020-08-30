package com.lin.DAO;

import com.lin.model.Book;
import com.lin.model.User;
import com.lin.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 11:51 pm 22/08/2020
 */
public class BookDao {
    public Book insert(User user, String title) throws SQLException {
        String sql = "insert into books (uid,title) values (?,?)";

        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)) {
                s.setInt(1,user.uid);
                s.setString(2,title);

                s.executeUpdate();
                try(ResultSet r = s.getGeneratedKeys()) {
                    if(!r.next()) {
                        return null;
                    }
                    return new Book(r.getInt(1),user,title);
                }
            }
        }
    }
    public List<Book> selectAll() throws SQLException {
        //连表查询
        String sql = "select bid,title,users.uid,users.username from " +
                "books,users where books.uid = users.uid order by bid desc";

        List<Book> books = new ArrayList<>();
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                try(ResultSet r = s.executeQuery()) {
                    while(r.next()) {
                        User user = new User(r.getInt("uid"),r.getString("username"));
                        Book book = new Book(r.getInt("bid"),user,r.getString("title"));
                        books.add(book);
                    }
                }
            }
        }
        return books;
    }

    public Book selectByBid(int bid) throws SQLException {
        String sql = "select bid,title,users.uid,users.username " +
                "from books,users " +
                "where books.uid = users.uid and bid = ?";
        try(Connection c = DButil.getConnection()) {
            try(PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1,bid);

                try(ResultSet r = s.executeQuery()) {
                    if(!r.next()) {
                        return null;
                    }
                    User user = new User(r.getInt("uid"),r.getString("username"));
                    return new Book(r.getInt("bid"),user,r.getString("title"));
                }
            }
        }
    }
}
