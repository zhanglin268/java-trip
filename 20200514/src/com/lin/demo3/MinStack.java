package com.lin.demo3;

import java.util.Stack;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-15 00:38
 **/
public class MinStack {
     private Stack<Integer>  stack;
     private Stack<Integer>  minStack;
     public MinStack() {
         this.stack = new Stack<>();
         this.minStack = new Stack<>();
     }
     public void push(int x) {
        stack.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }else {
            int mintop = minStack.peek();
            if(x <= mintop) {
                minStack.push(x);
            }
        }

     }
     public void pop() {
        if(!stack.empty()) {
            int tmp = stack.pop();
            if(tmp == minStack.peek()) {
                minStack.pop();
            }
        }
     }
     public int top() {
        if(stack.empty()) {
            return -1;
        }
        return stack.peek();
     }
     public int getMin() {
        if(minStack.empty()) {
            return -1;
        }
        return minStack.peek();
     }



}
