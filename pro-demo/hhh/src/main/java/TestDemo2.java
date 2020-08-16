package com.lin.demo;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;

/**
 * @program:20200531
 * @description
 * @author: 张林
 * @creat:2020-06-01 16:35
 **/
 @FunctionalInterface
interface  NoParameterNoreturn {
    void test();
}
//无返回值一个参数
 @FunctionalInterface interface OneParameterNoReturn {
void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}



  public class TestDemo2 {




     public static void main1(String[] args) {
         NoParameterNoreturn noParameterNoreturn = () -> {
             System.out.println("无参数无返回值");
         };
         noParameterNoreturn.test();
     }
 }
