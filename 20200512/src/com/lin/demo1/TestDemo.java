package com.lin.demo1;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @program:20200512
 * @description
 * @author: 张林
 * @creat:2020-05-12 16:23
 **/

class Student {
    public static List<Character> func(String str1,String str2) {
        List<Character> list = new ArrayList<>();

        for(int i = 0;i < str1.length();i++) {
            char  ch = str1.charAt(i);
            if(!str2.contains(ch+"")) {
                list.add(ch);
            }

        }
        return list;
    }
    public static void main(String[] args) {
        String str1 = "welcom to bit";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
        System.out.println(ret);


    }

    public static void main7(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }


    public String name;
    public String banji;
    public double score;

    public Student(String name, String banji, double score) {
        this.name = name;
        this.banji = banji;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {


    public static void main6(String[] args) {
        Student student1 = new Student("张三","火箭班",78.9);
        Student student2 = new Student("张三","火箭班",78.9);
        Student student3 = new Student("张三","火箭班",78.9);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
    }
    public static void main5(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("abc");
        //System.out.println(list);
        list.add(2,"nihoa");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();

        list1.addAll(list);
        System.out.println(list1);
        //list.remove(0);
        System.out.println(list);
       //String ret = list.remove(0);
        //System.out.println(ret);
        System.out.println(list);
        System.out.println("========get=======");
        String ret = list.get(0);
        System.out.println(ret);
        System.out.println("=======set=======");
        list.set(2,"李逵");
        System.out.println(list);
        System.out.println(list.contains("李逵"));
        System.out.println(list.indexOf("李逵"));
        list.add("hahaha");
        list.add("hahaha");
        System.out.println(list);
        System.out.println(list.indexOf("hahaha"));
        System.out.println(list.lastIndexOf("hahaha"));
        System.out.println("=========================");
        System.out.println("========sublist============");
        List <String> list3 = list.subList(0,2);
        System.out.println(list3);
        list3.set(1,"猪八戒");
        System.out.println(list3);




















    }
}
