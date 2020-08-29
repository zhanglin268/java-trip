package com.lin.demo1;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-27 23:03
 **/
class Generic<T extends Comparable<T>> {
    public T maxFind(T[] array) {
        T max = array[0];
        for(int i = 1;i < array.length;i++) {
            if(array[i].compareTo( max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

}

class Generic2 {
    public static <T extends Comparable<T>> T maxFind(T[] array) {
        T max = array[0];
        for(int i = 1;i < array.length;i++) {
            if(array[i].compareTo( max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

}
public class TestDemo1 {
    public static void main(String[] args) {
        Integer[] array = {1,3,4,6,7,8,23,45,67,78};
        System.out.println(Generic2.maxFind(array));
    }
    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,3,4,56,7,2,56};
        System.out.println( generic.maxFind(array));


        Generic<String> generic2 = new Generic<>();
        String[] str = {"nif" ,"jfjg","ggjlkjf"};
        System.out.println(generic2.maxFind(str));
    }
}
