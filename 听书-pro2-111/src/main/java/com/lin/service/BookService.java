package com.lin.service;

import com.lin.DAO.BookDao;
import com.lin.DAO.SectionDao;
import com.lin.model.Book;
import com.lin.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 11:52 pm 22/08/2020
 */
public class BookService {
    private BookDao bookDao;
    private SectionDao sectionDao;
    public BookService() {
        bookDao = new BookDao();
        sectionDao = new SectionDao();
    }
    public List<Book> list() throws SQLException {
        return bookDao.selectAll();
    }

    public Book post(String title, User user) throws SQLException {
       return  bookDao.insert(user,title);
    }
    public Book get(int bid) throws SQLException{
        Book book = bookDao.selectByBid(bid);
        if(book == null) {
            return null;
        }
        book.sections = sectionDao.selectByBid(bid);


        return book;

    }

    public void addSection(int bid, String name) throws SQLException {
        sectionDao.insert(bid,name);

    }
}
