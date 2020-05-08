package com.lin.demo2;

import java.util.Scanner;

/**
 * @program:20200506
 * @description
 * @author: 张林
 * @creat:2020-05-08 18:33
 **/
public class TestDemo4 {
    public static String func(String str) {
        String [] ret = str.split(" ");
        String tmp = "";
        /*for(int i = 0;i < ret.length;i++) {
             tmp = tmp + ret[i];
        }*/
        for(String s : ret) {
            tmp += s;
        }
        return tmp;
    }
    public static String reverse1(String str) {
        char [] ch = str.toCharArray();
        for(int i = 0;i < ch.length/2;i++) {
            char tmp;

            tmp = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1] = tmp;


        }
        return new String(ch);
    }


    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        //return new String(value);
        return String.copyValueOf(value);
    }
    public static String func(String str,int n) {
        String str2 = reverse(str,0,n-1);
        String str3 = reverse(str2,n,str2.length()-1);
        String str4 = reverse(str3,0,str3.length()-1);
        return str4;
        /*str = reverse(str,0,n-1);
        str = reverse(str2,n,str2.length()-1);
         str= reverse(str3,0,str3.length()-1);*/
    }


    public static void main(String[] args) {
        //StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("zhanglin");
        stringBuilder.append("haoshuai");
        System.out.println(stringBuilder);
        stringBuilder.append(" nishishuaige").append(" ni jinnianjisuile");
        System.out.println(stringBuilder);

    }
    public static void main9(String[] args) {
        String str = "";

        for(int i = 0;i < 10;i++) {
        str += 'a';
        }
        System.out.println(str);
        /*StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");*/

        //System.out.println(sb);

    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        String tmp = func(str,n);

    }



    public static void main5(String[] args) {
        String str = "abcdefg";
        String tm = reverse1(str);
        System.out.println(tm);
    }
    public static void main7(String[] args) {
        String str = "abcdeFAd";
        String ret = str.toUpperCase();
        System.out.println(ret);
        int [] arr = {1,2,3,4,5};
        System.out.println(arr.length);

    }
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //不能用next 遇到空格结束了
        String ret = func(str);
        System.out.println(ret);
    }

    public static void main4(String[] args) {
        String str = "name=zhangsan&age=18";
        String [] string1 = str.split("&");
        for(String s1 : string1) {
            String[] string2 = s1.split("=");
            for(String s2 :string2 ) {
                System.out.println(s2);
            }
        }

    }
    public static void main3(String[] args) {
        //String str = "192.168.1.1";
        String str = "192*168*1*1";

        //String [] strings = str.split("\\.");
        String [] strings = str.split("\\*");
        //为什么需要两个斜杠  在本来的情况下  \ +要转义的字符就可以了
        //但是此时在在""里面不知道\是干什么的 需要两个斜杠
        for(String s : strings) {
            System.out.println(s);
        }
    }
    public static void main2(String[] args) {
        //分割
        String str = "abc ce ed";
        String[] strings = str.split(" ");
        for(String s : strings) {
            System.out.println(s);
        }

    }
    public static void main1(String[] args) {
        //查找字符串
        String str = "abcabcabcabcde";
        boolean flg = str.contains("abc");
        System.out.println(flg);
        //查找在哪个位置
        int index = str.indexOf("abc");
        int index1 = str.indexOf("abc",4);

        System.out.println(index);
        System.out.println(index1);
        int index2 = str.lastIndexOf("abc");
        System.out.println(index2);

        boolean flg1 = str.startsWith("aba");
        System.out.println(flg1);
        boolean flg2 = str.startsWith("aba",2);
        System.out.println(flg2);


    }
}
