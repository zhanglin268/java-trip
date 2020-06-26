package com.lin.demo1;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-27 19:56
 **/

/**
 *
 * 1.<T> T表示一个占位符  当前类是泛型
 *2.放数据的时候可以做到自动进行类型的检查
 * 3.取数据的时候，可以进行自动类型转换
 * 4.泛型到底是怎么编译的：
 * 泛型是在编译时期的一种机制->>擦除机制。
 * 不是替换成object
 * 坑：
 * 1.不能new泛型累得额数组
 * 2.简单类型不能作为泛型类的参数 MyStack<int>mystack3 = new MyStack<>();
 * @param <T>
 */
class Person {

}
class Mystack<T> {
    public T[] elem;
    public int top;
    public Mystack() {
        //this.elem = new int[10];
        this.elem = (T[]) new Object[10];
    }
    public void push(T val) {
        this.elem[this.top] = val;
        this.top++;
    }
    public T peek() {
        return this.elem[this.top-1];

    }

}
public class TestDemo {
    public static void main(String[] args) {
        Person person =new Person();
        System.out.println(person);
        Mystack<Integer> myStack = new Mystack<>();
        System.out.println(myStack);



    }
    public static void main2(String[] args) {
        Mystack<Integer> mystack = new Mystack<>();
        mystack.push(1);
        //mystack.push("hello");
        Integer ret = mystack.peek();
        System.out.println(ret);

    }
}
