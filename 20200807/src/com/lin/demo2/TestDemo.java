package com.lin.demo2;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-26 18:15
 **/
class MyStack {
    public int[] elem;
    public int top;
    public MyStack() {
        this.elem = new int[10];
    }
    public void push(int val) {
        this.elem[this.top] = val;
        this.top++;
    }
    public int peek() {
        return this.elem[this.top--];
    }
}
public class TestDemo {

}
