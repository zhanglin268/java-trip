package cmo.lin.demo1;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 10:57
 **/
class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override//注解
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


public class TestDemo1 {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        Shape shape3 = new Triangle();
        shape1.draw();
        shape2.draw();
        shape3.draw();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
}
