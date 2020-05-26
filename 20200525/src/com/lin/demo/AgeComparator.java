package com.lin.demo;

import java.util.Comparator;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 15:04
 **/
public class AgeComparator implements Comparator<Person> {



    @Override
    public int compare(Person o1, Person o2) {
        return o1.age-o2.age;
    }


}
