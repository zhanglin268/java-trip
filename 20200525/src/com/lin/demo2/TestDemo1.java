package com.lin.demo2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 19:03
 **/
/*class Generic<T> {
    public T maxFunc(T[] array) {
        int max = 0;
        for(int i = 0;i < array.length-1;i++) {
            if(array[i+1] > array[i]) {
                max = array[i+1];
            }
        }
        return max;
    }
}*/
public class TestDemo1 {

        /**
         * 1、找出10W个数据当中，第一个重复的元素。
         * @param args
         */
        public static void main1(String[] args) {
            Random random = new Random();
            ArrayList<Integer> list = new ArrayList<>();
            Set<Integer> set  = new HashSet<>();


            for (int i = 0; i < 10_0000; i++) {
                list.add(random.nextInt(6000));
            }
            for(int j = 0; j < 100000;j++) {
                if(set.contains(list.get(j))) {
                    break;
                }else {
                    set.add(list.get(j));
                }
            }

        }

        /**
         *
         *
         * 3、10万个数据，统计重复数字及出现的次数
         * @param args
         */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }


    }


}
