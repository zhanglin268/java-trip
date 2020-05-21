package com.lin.demo1;

/**
 * @program:20200521
 * @description
 * @author: 张林
 * @creat:2020-05-21 23:36
 **/
public class TestDemo {
    public static void main(String[] args) {
        LianxiTestHeap lianxi = new LianxiTestHeap();
        int[] arr = {27,15,19,18,34,65,49,25,37};
        lianxi.createHeap(arr);
        lianxi.show();

    }
}
