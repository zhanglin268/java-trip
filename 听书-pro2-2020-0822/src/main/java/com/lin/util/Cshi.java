package com.lin.util;

import java.util.Scanner;

/**
 * @author: 张林
 * @Date :Created in 7:27 pm 22/08/2020
 */
public class Cshi {

    public static void func1(int[] arr) {
        int len = arr.length;
        int tmp = arr[0];
        for(int i = 1;i < len;i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = tmp;
    }
    public static void func2(int[] arr) {
        int len = arr.length;
        for(int i = 0;i < len;i = i+2) {
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            String[] in1 = str1.split(" ");
            String[] in2 = str2.split(" ");
            int N = Integer.parseInt(in1[0]);
            int M = Integer.parseInt(in1[1]);
            if(N%2 == 1 || N < 2) {
                return ;
            }
            int[] arr = new int[N];
            for(int i = 0;i < N;i++) {
                arr[i] = i+1;
            }
            //int[] chg = new int[M];
            for(int i = 0;i < M;i++) {
                if(Integer.parseInt(in2[i]) == 1) {
                    func1(arr);
                }else {
                    func2(arr);
                }

            }
           // System.out.println(Arrays.toString(arr));
            for(int i = 0; i< arr.length;i++) {
                System.out.print(arr[i] + " ");
            }

        }
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int count = 0;
            for(int i = 0; i < num;i++) {
                int flg = 0;
                String str = scan.next();
                char[] arr = str.toCharArray();
                for(int j = 0;j < arr.length;j++) {
                    char ch = arr[j];
                    if((ch >= 'A' && ch<= 'Z') || (ch >= 'a' && ch <= 'z')) {
                        flg++;
                    }

                }
                if((flg == arr.length) && (flg >0 && flg <= 10) ) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
