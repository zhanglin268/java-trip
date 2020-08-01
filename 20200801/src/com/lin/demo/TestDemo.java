package com.lin.demo;

/**
 * @program:20200531
 * @description
 * @author: 张林
 * @creat:2020-06-01 00:02
 **/

class Student {
    //私有属性name
    private String name = "bit";
    //私有属性age
    public int age = 18;
    //无参数构造方法
    public Student() {
        System.out.println("Student()");
    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String ,name)");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //第一中方式
        Class c1 = null;
        try{
            //注意有包需要加包的路劲
           c1 =  Class.forName("com.lin.demo.Student");

        }catch(ClassNotFoundException e) {
            e.printStackTrace();

        }
        //第二种方式
        Class c2 = Student.class;

        //拿到对象的三种方式
        Student s1 = new Student();
        Class c3 = s1.getClass();
        System.out.println(c1 == c2);
        System.out.println(c1 ==c3);
        System.out.println(c3 == c2);

        //Student student = new Student("zhanlin",23); 私有的不可以new

    }
}
