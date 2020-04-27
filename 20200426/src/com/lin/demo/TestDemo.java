package com.lin.demo;

//import java.util.Arrays;

import java.util.Arrays;
import java.util.Date;
import static java.lang.Math.*;
/**
 * @program:20200426
 * @description
 * @author: 张林
 * @creat:2020-04-27 11:48
 **/
public class TestDemo {
    int val = 10;
    public static void main(String[] args) {
        int [] arr = {1,3,3,4,5,5};
        System.out.println(Arrays.toString(arr));


        //java.util.Date date = new java.util.Date();
        Date date = new Date();
        System.out.println(date.getTime());
        double x = 30;
        double y = 40;
        double result = sqrt(pow(x,2) + pow(y,2));
        System.out.println(result);
    }
}
