package com.lin.demo;

/**
 * @program:20200511
 * @description
 * @author: 张林
 * @creat:2020-05-11 16:21
 **/

/**
 * 自定义异常
 */

class MyException extends RuntimeException {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
public class TestDemo3 {
    public static void func(int x) throws MyException{
        if(x == 10) {
            throw new MyException("x == 10");
        }
    }
    public static void main(String[] args) {
    try {
        func(10);
    }catch (MyException e){


        }
    }
}
