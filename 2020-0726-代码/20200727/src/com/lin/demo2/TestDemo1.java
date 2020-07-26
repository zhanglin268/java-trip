package com.lin.demo2;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-28 11:10
 **/
public class TestDemo1 {
    public String name = "abc";




    public static void main2(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj) {

                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
    public static void main(String[] args) {
        TestDemo1 test = new TestDemo1();
        TestDemo1 testB = new TestDemo1();
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
    }
}
