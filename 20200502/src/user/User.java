package user;

import book.BookList;
import operation.IOperation;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 13:07
 **/
public  abstract class User {
    public String name;
    protected IOperation[] operations;
    public User(String name) {
        this.name = name;
    }
    public abstract int  menu();

    public void doOperation(BookList bookList, int choice) {
    this.operations[choice].work(bookList);
}

}
