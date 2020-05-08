package user;

import operation.*;

import java.util.Scanner;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-04 13:09
 **/
public class Normal extends User {

    public Normal(String name) {
        super(name);
        this.operations = new IOperation[] {
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int  menu() {
        System.out.println("=====================");
        System.out.println("hello  "  +this.name +  "  欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=====================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;


    }
}
