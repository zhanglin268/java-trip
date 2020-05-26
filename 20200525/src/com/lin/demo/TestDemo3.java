package com.lin.demo;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 14:59
 **/
class Person {
    public int age;
    public int score;
    public String name;

    public Person(String name ,int age, int score ) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        //优先级队列底层默认是个小堆
        AgeComparator ageComparator = new AgeComparator();

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);
        priorityQueue.offer(new Person("nihao",7,3));
        priorityQueue.offer(new Person("hello",87,34));
        System.out.println(priorityQueue);
    }

    public static void main3(String[] args) {
        Person person1 = new Person("zhangsan",17,34);
        Person person2 = new Person("zhangsan",27,56);
        Person person3 = new Person("zhangsan",38,54);
        Person[] persons = new Person[3];
        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;
        AgeComparator ageComparator = new AgeComparator();

        Arrays.sort(persons,ageComparator);
        System.out.println(Arrays.toString(persons));

    }
    public static void main1 (String[] args) {
        Person person1 = new Person("zhangsan",17,34);
        Person person2 = new Person("zhangsan",27,56);
        Person person3 = new Person("zhangsan",37,89);
        AgeComparator ageComparator = new AgeComparator();
        /*if(ageComparator.compare(person1,person2) > 0) {

        }*/
        System.out.println(ageComparator.compare(person1,person2));

    }
}
