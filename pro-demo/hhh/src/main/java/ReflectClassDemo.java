package com.lin.demo;

/**
 * @program:20200531
 * @description
 * @author: 张林
 * @creat:2020-06-01 12:46
 **/
public class ReflectClassDemo {
    public static void reflectNewInstance() {
        try {
            Class<?> classStudent = Class.forName("com.lin.demo.Student");
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            System.out.println("获得学生对象：" + student);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }





    public static void main(String[] args) {
        reflectNewInstance();
    }
}
