package com.lin.demo;

/**
 * @program:20200525
 * @description
 *
 *
 * @author: 张林
 * @creat:2020-05-26 17:26
 **/

/**
 *
 *内部类:
 * 1.实例内部类
 * 2.静态内部类
 * 3.匿名内部类
 *
 */

class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;
    //实例内部类： 看做是一个普通的实例数据成员

    /**
     *
     * 如何拿到实例内部类的对象
     */
    class InnerClass {
        public int data3 = 3;

        public static final int data4 = 99;
        public void func() {
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }

}
public class TestDemo5 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }


}
