import book.BookList;
import user.Admin;
import user.Normal;
import user.User;

import java.util.Scanner;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 09:32
 **/
public class TestMain {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1---管理员  2---普通用户");
        int choice = scanner.nextInt();

        if(choice == 1) {
            return new Admin(name);
        }else {
            return new Normal(name);
        }

    }
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录
        User user = login();
        while(true) {
            int choice = user.menu();
            //选择是几就对应哪个方法了
            user.doOperation(bookList ,choice);
        }




    }
}
