package com.zhanglin;

/**
 * @author: 张林
 * @Date :Created in 6:00 pm 10/07/2020
 */
public class boke {



    public static void printArray(int[] arr) {
        for(int i=0;i < arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        printArray(arr);
    }

    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};//动态初始化

        int[] arr1 = {1,2,3,4,5};//静态初始化

        int[] arr2 = new int[5];//需要先指定数据的个数

        for(int i = 0;i < 5;i++) {
            arr[i] = i;
        }


        int result = arr[4];
        System.out.println(result);//获取下标为四即第五个元素


        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }

        for(int  num : arr) {
            System.out.println(num);
        }
    }
}
