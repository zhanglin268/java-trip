package com.lin.demo;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program:20200521
 * @description
 * @author: 张林
 * @creat:2020-05-21 13:38
 **/


public class TestDemo {
   /* public static void main(String[] args) {
        LianxiTestHeap lianxi = new LianxiTestHeap();

    }*/
    public static void main2(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //priorityQueue.offer(new Student());
        //priorityQueue.offer(new Student());
        priorityQueue.offer(11);
        priorityQueue.offer(10);
        priorityQueue.offer(14);
        priorityQueue.offer(12);
        System.out.println(priorityQueue.peek());


    }
    public static void main1(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);

    }
}
