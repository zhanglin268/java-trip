package com.lin.demo2;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Arrays;

/**
 * @program:20200506
 * @description
 * @author: 张林
 * @creat:2020-05-07 16:26
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String str1 = "   abc   bcabcd";
        String ret = str1.trim();
        System.out.println(ret);
    }
    public static void main7(String[] args) {
        String str1 = "ababcabcd";//提取字符串
        String ret = str1.substring(1);
        System.out.println(ret);
        String ret2 = str1.substring(1,4);
        System.out.println(ret2);


    }
    public static void main6(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.replace("abc","pp");
        System.out.println(ret);
        System.out.println(str1.contains("a"));
        String tem = str1.replaceFirst("a","ydd");
        System.out.println(tem);
    }
    public static void main5(String[] args) {
        String str1 = "ABCDef";
        String str2 = "abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));

    }
    public static void main4(String[] args) {
        byte [] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcde";
        byte [] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));

    }
    public static boolean func(String str) {
        char [] val = str.toCharArray();
        for(int i = 0; i < val.length;i++) {
            if(val[i] < '0' || val[i] > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "123456a7";
        boolean flg = func(str);
        System.out.println(flg);
    }
    public static void main1(String[] args) {
        char [] val = {'a','b','c','d','e','f'};
        String str = new String (val,1,3);
        System.out.println(str);
        String str2 = "hello";
        char ch = str2.charAt(2);
        System.out.println(ch);
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
        String st = "helloword";
        //将字符串变成字符数组
        char [] data = st.toCharArray();
        for(int i = 0;i < data.length;i++) {
            System.out.print(data[i] + " ");
        }


    }
}
