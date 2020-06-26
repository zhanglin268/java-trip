package com.lin.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 09:37
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

    }
    public static void main4(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
    public static void main2(String[] args) {
        MyStack myStack = new MyStack();
        //MyStack <Integer> myStack =  new MyStack<>();此时只能放Integer类型
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());//3
        System.out.println(myStack.pop());//3
        System.out.println(myStack.peek());//2

    }
    public static void main1(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(20);
        stack.push(37);
        stack.push(38);
        stack.push(39);
        System.out.println(stack.peek());//拿到栈顶元素但不删除
        System.out.println(stack.pop());//出栈并且删除栈顶元素
        System.out.println(stack.peek());
        System.out.println(stack.empty());//判断是否为空
        System.out.println(stack.search(1));
        System.out.println(stack.size());//栈的大小




    }

}
