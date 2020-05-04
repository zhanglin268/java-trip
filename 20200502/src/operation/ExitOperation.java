package operation;

import book.BookList;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 12:52
 **/
public class ExitOperation  implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
