package com.lin.demo;

/**
 * @program:20200509
 * @description
 * @author: 张林
 * @creat:2020-05-09 18:09
 **/
public class Example {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("abc");
        str.append("gsgf");
        str.reverse();
        System.out.println(str);
        System.out.println(str);
    }

        String str = new String("good");
        char[ ] ch = { 'a' , 'b' , 'c' };
        public static void main1(String args[]){
            Example ex = new Example();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str + " and ");
            System.out.print(ex.ch);
        }
        public void change(String str,char ch[ ]){
            str = "test ok";
            ch[0] = 'g';
        }



}
