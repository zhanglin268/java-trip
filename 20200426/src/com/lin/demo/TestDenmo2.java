package com.lin.demo;

/**
 * @program:20200426
 * @description
 * @author: 张林
 * @creat:2020-04-27 14:23
 **/
class  Animal {
    public String name;
    public void eat(){
        System.out.println("Animal :: eat()");
        }
    public void sleep() {
        System.out.println("sleep()");
    }
}
class Cat{

            public void eat() {
                System.out.println("Cat ::eat()");
            }
        }
class Bird {
    public String name;
    public void eat() {
        System.out.println("Cat ::eat()");
    }
        }
public class TestDenmo2 {
    public static void main(String[] args) {
        TestDemo tmp = new TestDemo();
        System.out.println(tmp.val);
    }
}
