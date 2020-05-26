package com.lin.demo;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 15:39
 **/

class Animal {
    public void func(){
        System.out.println("匿名内部类");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        new Animal() {
            @Override
            public void func() {
                super.func();
                System.out.println("我重写了这方法");
            }
        }.func();
    }
}
