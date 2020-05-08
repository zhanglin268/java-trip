package cmo.lin.demo2;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 12:54
 **/
//抽象类主要就是被用来继承的

 abstract class Shape {
    /* public int age;
     private int a;
     public void func() {

     }*/

    public abstract void draw() ;
}
class Cycle extends Shape {
    /*@Override//注解
    public void draw() {
        System.out.println("画一个○");
    }*/

    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}

public class TestDemo {
     public static void drawMap(Shape shape) {
         shape.draw();
     }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        shape1.draw();
        shape2.draw();
        drawMap(shape1);
        drawMap(shape2);
    }
}
