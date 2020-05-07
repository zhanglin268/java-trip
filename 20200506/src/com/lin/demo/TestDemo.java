package com.lin.demo;

/**
 * @program:20200506
 * @description
 * @author: 张林
 * @creat:2020-05-06 19:09
 **/
public class TestDemo {
    public static boolean func(String str) {
        for(int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }
}
