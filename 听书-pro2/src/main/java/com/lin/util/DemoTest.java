package com.lin.util;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: 张林
 * @Date :Created in 2:06 pm 24/08/2020
 */
public class DemoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('H');
        set.add('I');
        set.add('M');
        set.add('O');
        set.add('T');
        set.add('U');
        set.add('V');
        set.add('W');
        set.add('X');
        set.add('Y');

        while(scan.hasNext()) {
            int flg = 0;
            StringBuffer sb = new StringBuffer();
            String str = scan.nextLine();
            char[] arr = str.toCharArray();
            for(int i = 0;i < arr.length;i++) {
                char ch = arr[i];
                if(!set.contains(ch)) {
                    System.out.println("NO");
                    flg = 1;
                    break;
                }
            }
           if(flg == 0) {
               for(int i =arr.length-1;i>=0;i--) {
                   char ch = arr[i];
                   sb.append(ch);
               }
               if(sb.toString().equals(str)) {
                   System.out.println("YES");
               }else {
                   System.out.println("NO");
               }
           }

        }
    }
}
