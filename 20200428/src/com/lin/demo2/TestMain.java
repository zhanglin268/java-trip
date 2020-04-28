package com.lin.demo2;

/**
 * @program:20200428
 * @description
 * @author: 张林
 * @creat:2020-04-28 14:59
 **/
class Animal {
    public String name;
    public int age;
    public Animal(String name) {
        this.name = name;
        System.out.println(this.name + "这是动物的类");
    }
    public void eat() {
        System.out.println(this.name + "这是一个动物类");
        System.out.println( "heiehi");
    }
    public void sleep() {
        System.out.println("这是一个动物睡觉方法");
    }
}
class Cat extends Animal {
    public int count = 99;
    public Cat(String name) {
        super(name);
        System.out.println(this.name + "这是猫");
    }

}
class Bird extends Animal {
    public String name;
    public Bird(String name) {
        super(name);
        this.name = name;
        System.out.println("这是个八个");
    }
    public void eat() {
        System.out.println("这是一个鸟吃饭方法");
    }
    public void fly() {
        System.out.println("这还少一个鸟会飞的方法") ;
    }
}
public class TestMain {

    public static void main(String[] args) {
        //向上转型-》父类引用 引用子类对象
        Animal Animal1 = new Cat("mimi");
        //Animal1.eat();
        //向上转型之后 通过父类的引用 只能访问父类自己的方法或属性
        if(Animal1 instanceof Bird) {
            Bird bird = (Bird)Animal1;
            bird.fly();
        }else {
            System.out.println("hahahahaha");
        }

        //Bird bird = (Bird)Animal1;
        //bird.fly();

    }


    public static Animal func() {
        return new Cat("mimi");

    }
    public static void main4(String[] args) {
       Animal animal = func();
    }


    public static void func(Animal animal) {
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("mimi");
        func(cat);
    }


    public static void main2(String[] args) {
        //向上转型-》父类引用 引用子类对象
        Animal Animal1 = new Cat("mimi");
        Animal1.eat();
        //向上转型之后 通过父类的引用 只能访问父类自己的方法或属性
    }
    public static void main1(String[] args) {
        Animal Animal1 = new Animal("hhh");
        Cat cat = new Cat("嘿嘿");
    }
}
