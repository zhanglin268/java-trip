package com.lin.demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:20200531
 * @description
 * @author: 张林
 * @creat:2020-06-01 23:09
 **/
public class Person {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        String  tmp = "";
        for(int i = 0;i < arr.length;i++) {
            int j = 0;
            if(arr[i] >= '0' && arr[i] <= '9' ) {
                count = 1;
                int index = i;
                for( j = i+1;j < arr.length;j++) {
                    if(arr[j] >= '0' && arr[j] <= '9') {
                        count++;
                        index = j;

                    }else {
                        break;
                    }
                }
                if(count > tmp.length()) {
                    tmp = str.substring(i,index+1);
                }
            }
            //i = j;
        }
        System.out.println(tmp);
    }
}

