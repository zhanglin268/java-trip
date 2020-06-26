package com.lin.demo;

import java.util.Comparator;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 15:57
 **/
public class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
