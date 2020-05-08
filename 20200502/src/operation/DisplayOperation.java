package operation;

import book.Book;
import book.BookList;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 11:00
 **/
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for(int i = 0;i < bookList.getUsedSize();i ++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }

}
