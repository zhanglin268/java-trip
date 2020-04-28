package com.lin.demo;

/**
 * @program:20200428
 * @description
 * @author: 张林
 * @creat:2020-04-28 11:44
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
    public Cat(String name) {
        super(name);
        System.out.println(this.name + "这是猫");
    }
   /* public String name;
    public void eat() {
        System.out.println(this.name + "这是一个猫吃饭方法");
    }*/
}
class ChineseGardenCat extends Cat {
    public ChineseGardenCat(String name) {
        super(name);
        System.out.println(this.name + "这是中华田园猫");
    }
}
class Bird extends Animal{
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

public class TestDemo {
    public static void main(String[] args) {
        ChineseGardenCat ChineseGardenCat1 = new ChineseGardenCat("hellocat");
        ChineseGardenCat1.eat();
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
        System.out.println(cat.name);
        Bird bird = new Bird("八个");
        System.out.println(bird.name);
        bird.eat();
        ChineseGardenCat   ChineseGardenCat1 = new ChineseGardenCat("hellocat");

    }
}