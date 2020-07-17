package cmo.lin.demo3;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 14:20
 **/
class Animal {
    protected String name;
    public Animal (String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();

}
interface IRuning {
    void run();
}
interface ISwimming {
    void swim();
}
class Cat extends Animal implements IRuning {
    public Cat(String name) {
        super(name);
    }
    public void run() {
        System.out.println( this.name + "正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRuning,ISwimming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "她正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "她正在游泳");
    }
}
class Robot implements IRuning {
    @Override
    public void run() {
        System.out.println("我是机器人我在用腿跑");
    }
}
public class TestMoreExtends {
    public static void walk (IRuning runing) {
        System.out.println("我带着伙伴去散步");
        runing.run();
    }
    public static void main(String[] args) {
        IRuning iRuning = new Robot();
        iRuning.run();
        walk(iRuning);
        IRuning iRuning2 = new Frog("qingqing");
        iRuning2.run();
        walk(iRuning2);
    }
}
