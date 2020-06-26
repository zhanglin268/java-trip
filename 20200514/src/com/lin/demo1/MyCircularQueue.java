package com.lin.demo1;

/**
 * @program:20200514
 * @description
 * @author: 张林
 * @creat:2020-05-14 16:33
 **/
public class MyCircularQueue {
    public int[] elem;
    //public int usedsize;
    public int front;
    public int rear;
    public MyCircularQueue(int k) {
    this.elem = new int [k];
    }
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;
        return false;
    }
    public boolean isFull() {
        if((this.rear+1)%this.elem.length == this.front) {
            return true;
        }
        return false;
    }

    public boolean deQueue() {//出队
        if(isEmpty()) {
            return false;
        }
        this.front = (this.rear+1)%this.elem.length;
        return true;
    }
    public int Front() {
        if(isEmpty()) {
            return -1;

        }
        return this.elem[this.front];
    }
    public int rear () {
        if(isEmpty()) {
            return -1;
        }
        int index = this.rear == 0 ? this.elem.length-1:this.rear-1;
        return this.elem[index];
    }
    public boolean isEmpty() {
        return this.rear == this.front;
    }

}
