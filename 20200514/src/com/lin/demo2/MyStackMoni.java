package com.lin.demo2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 18:57
 **/


/**
 *     用两个队列实现栈
 *     想法： 对于入栈 哪个队列有元素就把要加入的元素加入到这个队列中
 *     出栈 要遵循栈的先进后出  此时把非空栈的元素的N-1个元素转移到空栈中
 */
public class MyStackMoni {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStackMoni() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }
    public void push(int x) {
        /*if(queue1 == null && queue2 == null) {
            queue1.offer(x);

        }else {
            if(queue1==null) {
                queue2.offer(x);

            }else {
                queue1.offer(x);

            }
        }*/
       if(!queue1.isEmpty()) {

           queue1.offer(x);
       }else if(!queue2.isEmpty()) {
           queue2.offer(x);
       }else {
           queue1.offer(x);
       }
    }

    public int  top() {//获取栈顶元素
        if(empty()) {
            return -1;
        }
        int qsize1 = queue1.size();
        int qsize2 = queue2.size();

        int data = 0;
        if( !queue1.isEmpty()) {
            for(int i = 0; i <qsize1;i++) {
                data = queue1.poll();
                queue2.offer( data );
            }

        }else {
            for(int i = 0; i <qsize2;i++) {
                data = queue2.poll();
                queue1.offer( data );
            }

        }
        return data;
    }
    public int pop () {//移除栈顶元素
        if(empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();
        int data = 0;
        if(!queue1.isEmpty()) {// 0- 5-1
            for (int i = 0; i < qSize1 - 1; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else {
            for (int i = 0; i < qSize2 - 1; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;
    }

    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }


}
