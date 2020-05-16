package com.lin.demo1;

import java.util.Stack;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 17:38
 **/
public class Test1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i <s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '['|| ch == '{') {
                stack.push(ch);
            }else {
                //判断栈是否为空
                if(stack.empty()) {
                    System.out.println("右括号多!");
                    return false;
                }
                //拿到栈顶元素
                char ch2 = stack.peek();
                if(ch2 == '('&& ch == ')' || ch2 == '[' && ch == ']' ||
                ch2 == '{' && ch == '}') {
                    stack.pop();
                }else {
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if(!stack.empty()) {
            System.out.println("左括号多");
            return false;
        }
        return true;
    }
}
