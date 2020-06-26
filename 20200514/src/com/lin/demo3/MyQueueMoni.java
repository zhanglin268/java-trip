package com.lin.demo3;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 19:56
 **/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * 用两个栈模拟队列
 * 思想： 队列是先进先出  在两个栈中始终保持一个栈是空的 添加元素时哪个非空就添加到哪个栈里
 * 都是空的的话就随便添加到一个栈里 出队的时候保证后进后出，把非空栈的N-1个转移到空栈里
 *
 */
public class MyQueueMoni {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueueMoni() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() { //从队列首部移除元素
        if(empty()) {
            return -1;
        }

        if(stack2.empty()) {
            //导入第一个栈的元素
            while(!stack1.empty()) {
                stack2.push(stack1.pop()) ;
            }
        }
        //stack2.empty()
        return stack2.pop();
    }
    public int peek() {//返回队列首部元素
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            //导入第一个栈的元素
            while(!stack1.empty()) {
                stack2.push(stack1.pop());

            }
        }
        //stack2.empty()
        return stack2.peek();
    }
    public boolean empty() {
        if(stack1.empty() && stack2.empty()) {
            return true;
        }
        return false;
    }

}
