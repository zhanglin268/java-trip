package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 10:59
 **/
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        for(int i = 0;i < bookList.getUsedSize();i++ ) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
            book.setBorrowed(true);
                System.out.println("借阅成功");
                return ;
            }

        }
        System.out.println("没有借阅的那本书");
    }
}
