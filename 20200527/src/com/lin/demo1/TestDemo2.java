package com.lin.demo1;

import java.util.ArrayList;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-27 23:31
 **/

/**
 * 打印集合当中的所有元素
 */
class GenericList {
    public static <T> void printList(ArrayList<T> list) {
        for(T val:list) {
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static  void printList1(ArrayList<?> list) {
        for(Object val:list) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.add("gjk");


    }
}
