package com.lin.demo;

import java.util.Arrays;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 10:08
 **/

/**
 * 栈
 */
public class MyStack {//  泛型：MyStack<T>
    public int [] elem;//public T[] elem;
    public int top;
    public MyStack() {
        this.elem = new int[10];//this.elem = (T[]) new Object[10];
        this.top = 0;
    }
    public void push(int val) {
    if(full()) {
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
   //进行扩容
    }
    this.elem[top++] = val;
    }
    public boolean empty () {
       return this.top == 0;
    }
    public boolean full() {
        return this.top == this.elem.length;
    }
    public int  pop() {//返回值 T
        if(empty()) {
            throw new RuntimeException("栈空");
        }
        int data = this.elem[this.top-1];//T data
        //int data = this.elem[--this.top];
        this.top--;//拿到栈顶元素并删除
        return data;

    }
    public int peek() {// T
        if(empty()) {
            throw new RuntimeException("栈空");

        }//拿到栈顶元素不删除
        return this.elem[this.top-1];
    }
    public int size() { //T
        return this.top;
    }

}
