package com.lin.demo;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 14:35
 **/
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public int usedsize;
    public Node front;//头
    public Node rear;//尾
    public boolean offer(int val) {
    Node node = new Node(val);
    if(this.rear == null) {
        this.front = node;
        this.rear = node;
    }else {
        this.rear.next = node;//插入到队尾
        this.rear = node;
    }
    this.usedsize++;
    return true;
    }

    public int poll() {//出队且删除对头元素
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }

    public int peek() {  //拿到对头元素不删除
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return   this.front.data;


    }
    public boolean isEmpty() {
        return this.usedsize == 0;
    }
    public int size() {
        return this.usedsize;
    }


}
