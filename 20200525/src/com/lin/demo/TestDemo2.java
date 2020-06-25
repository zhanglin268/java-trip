package com.lin.demo;

import java.util.Arrays;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 11:29
 **/
class Student implements  Comparable<Student>{
    public int age;
    public int score;
    public String name;
    /*public Student(String name,int age,int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }*/

    public Student(String name,int age, int score) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;//当前年龄大不大于传进来的参数

        //return this.score - o.score;//从小到大
        return o.score-this.score;//从大到小
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo2 {
    public static void main5(String[] args) {
        Student student1 = new Student("zhangsan",17,27);
        Student student2 = new Student("zhangsan",33,67);
        Student student3 = new Student("zhangsan",44,89);
        Person[] persons = new Person[3];



    }
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",17,27);
        Student student2 = new Student("zhangsan",33,67);
        Student student3 = new Student("zhangsan",44,89);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));



    }
    public static void main1(String[] args) {
        Student student1 = new Student("zhnglin",16,89);
        Student student2 = new Student("ling",26,66);
        if(student1.compareTo(student2) > 0) {
            System.out.println("student1大于student2");
            //student1表示当前对象  student2表示传进去的参数
        }
        //缺点是每次业务不同需要修改类本身
    }
}
