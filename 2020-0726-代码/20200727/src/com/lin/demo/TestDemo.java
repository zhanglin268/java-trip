package com.lin.demo;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-27 16:55
 **/

import java.util.function.DoubleToIntFunction;

/**
 *
 *
 * 实例内部类
 */
class OuterClass {
    public int data1 = 1;
    public static int data2 = 2;
    private int data4 = 4;

    /**
     * 静态内部类当中，不能访问外部类的非静态的数据成员
     */
    static class InnerClass {
        public int data3 = 3;
        public OuterClass out;
        //public int data1 = 10;如果非要访问data1

        public InnerClass(OuterClass out) {
            this.out = out;
        }
        public void func() {
            System.out.println(this.out.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(this.out.data4);

            /*System.out.println(data2);
            System.out.println(data3);
            System.out.println(OuterClass.this.data1);
            System.out.println(data4);*/
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(outerClass);
        innerClass.func();

    }
    /*public static void main1(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();

    }*/
}
