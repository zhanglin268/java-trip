package com.lin.demo1;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @program:20200506
 * @description
 * @author: 张林
 * @creat:2020-05-07 12:44
 **/
class Person {
    private int age;
}
public class TestDemo1 {
    public static void main12(String[] args) {

    }
    public static void main11(String[] args) throws NoSuchFieldException {
       String str = "hello";
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        //char[] val = (char[])field.get(str);
        //val[0] = 'g';

    }
    public static void main10(String[] args) {
        String str = "Hello";
        str = "h" + str.substring(1);
        System.out.println(str);
    }
    public static void main8(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);

    }
    public static void main7(String[] args) {
        String str1 = "hello";
        String str2 = new String ("hello");
        System.out.println(str2.equals("hello"));
        System.out.println("hello".equals(str1));
    }
    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用
        System.out.println(str1.equals(str2));//比较的是内容

        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


    }
    public static void func(String str,char[] arr) {
        str = "abcdef";
        arr[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char [] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));

    }
    public static void main4(String[] args) {
         String str1 = "hello";
         String str2 = str1 ;
        System.out.println(str1);
        System.out.println(str2);

        str1 = "abc";
        System.out.println(str1);
        System.out.println(str2);

    }
    public static void main3(String[] args) {
        String str1 ="hello";
        String str2 ="hel"+"lo";
        System.out.println(str1 == str2);
        String str3 = new String("hel")+"lo";
        System.out.println(str1 == str3);
    }
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
    public static void main1(String[] args) {
        String str = "hell0";
        System.out.println(str);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char [] val = {'a','b','c','d','f'};
        System.out.println(val);
        System.out.println(Arrays.toString(val));

    }
}
