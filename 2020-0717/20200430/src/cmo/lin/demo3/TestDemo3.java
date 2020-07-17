package cmo.lin.demo3;

import java.util.*;
//import java.util.Arrays;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 16:32
 **/
class Student {
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
