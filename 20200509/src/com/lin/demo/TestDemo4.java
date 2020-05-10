package com.lin.demo;

/**
 * @program:20200509
 * @description
 * @author: 张林
 * @creat:2020-05-10 09:00
 **/


//import java.util.Collection;

//import java.util.Collection;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
//import java.util.Map;

/**
 * 异常
 */
public class TestDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            StringBuffer ret = new StringBuffer();
            for(int i = 0;i < str.length();i++) {
                char ch = str.charAt(i);
                String tmp = ret.toString();
                if(!tmp.contains(ch+"")) {
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }




    }
    public static void main1(String[] args) {
        //double a = 10 / 0;
       // System.out.println(a);
    }
}
