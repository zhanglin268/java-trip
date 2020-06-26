package com.lin.demo;

/**
 * @program:20200511
 * @description
 * @author: 张林
 * @creat:2020-05-11 15:20
 **/
public class TestDemo1 {


    public static int divide (int x,int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try {
            int ret = divide(20,0);
            System.out.println(ret);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("hhhhhh");
        }
        System.out.println("继续执行");

    }
    public static void main3(String[] args) {
        int x = 0;
        if(x == 0) {
            throw new UnsupportedOperationException("x == 0");
            //System.out.println(124);
        }
    }
    public static void main2(String[] args) {

        System.out.println(func1());
    }
    public static int func1() {
        int [] array = {1,2,3};
        try {
            System.out.println(array[4]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

            System.out.println("我们抓获倒了空指针异常");
            return 3;
        }finally {
            return 2;
        }
    }
    public static void main1(String[] args) {
        int [] array = {1,2,3};
        try {
            System.out.println(array[4]);
        }catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了空指针异常");
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }finally {
            System.out.println("finally块的代码肯定会执行");
        }
        System.out.println("hello");
    }

}
