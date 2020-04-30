package cmo.lin.demo3;

/**
 * @program:20200430
 * @description
 * @author: 张林
 * @creat:2020-04-30 13:24
 **/

/**接口 interface
 *  1,//接口当中的方法都是抽象方法
 *  2,可以有具体的方法  这个方法是被default来修饰的
 *  3,接口当中定义的成员变量，默认是常量
 *  4,接口当中的成员变量默认是：public static fianl
 */
 interface  Shape {
public static final  int a = 1;
        void draw();
    /*public void () {

    }*/

}
class Cycle implements Shape {
    /*@Override//注解
    public void draw() {
        System.out.println("画一个○");
    }*/

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Triangle implements  Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}
public class TestInterFace {
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
