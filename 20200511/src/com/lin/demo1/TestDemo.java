package com.lin.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program:20200511
 * @description
 * @author: 张林
 * @creat:2020-05-11 18:30
 **/

class Card {

}
public class TestDemo {

    public static void func(String str1,String str2) {

    }
    public static void main(String[] args) {
        String str1 = "welcom to bit";
        String str2 = "come";

        func(str1,str2);


    }
    public static void main1(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1,3);
        list.add(2,6);
        list.add(3,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
