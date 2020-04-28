package com.lin.demo;

/**
 * @program:20200428
 * @description
 * @author: 张林
 * @creat:2020-04-28 12:14
 **/

class Base {
    public int a;
}
class Derive extends Base {
    public int b;
}
public class TestDemo2  {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;
        System.out.println(derive.a);

    }
}
