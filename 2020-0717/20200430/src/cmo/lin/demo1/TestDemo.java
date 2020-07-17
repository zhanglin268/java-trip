package cmo.lin.demo1;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 10:34
 **/
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + " 动物 ：正在吃");
    }
}
class Cat extends Animal {
    public String huzi;
    public Cat(String name,String huzi) {
        super(name);
        this.huzi = huzi;
        System.out.println(this.name + "这是子类猫");
    }
    public void eat() {
        System.out.println(this.name + " cat ：正在吃");
    }
    public void func() {
        System.out.println("mao");
    }


}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("chuyi","bir");
        cat.func();
        Animal animal = new Cat("初二","胡子");
        animal.eat();
        //animal.func();



    }
}
