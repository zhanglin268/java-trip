package com.lin.demo1;

import java.util.Arrays;

/**
 * @program:20200521
 * @description
 * @author: 张林
 * @creat:2020-05-21 22:18
 **/
public class LianxiTestHeap {

    public int [] elem;
    public int usedSize;
    public LianxiTestHeap() {
        this.elem = new int[10];
    }


    public void adjustDown(int root, int len) {
        int parent = root;
        int child = 2*root+1;
        while(child  < len) {
            //判断是否有左右孩子
            if(child + 1 < len && this.elem[child] < this.elem[child+1]) {
                child++;
            }
            if(this.elem[child] > this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
               break;
            }

        }
    }

    public void createHeap(int[] array) {
        for(int i = 0;i < array.length;i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for(int j = (this.usedSize - 1 - 1)/2;j >= 0;j--) {
            adjustDown(j,usedSize);
        }
    }


       //添加一个元素
    public void push(int val) {
        if(isEmpty()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize++] = val;
        adjustUp(usedSize);
    }

    public void adjustUp(int child) {
        int parent = (usedSize-1-1)/2;
        while(child > 0) {
            if(this.elem[child] > this.elem[parent] ) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }

        }

    }

    public boolean isFull() {
        return this.elem.length == this.usedSize;
    }
    public void pop() {
        if(isEmpty()) {
            return;
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[usedSize-1];
        this.elem[usedSize-1] = tmp;

    }
    public boolean isEmpty() {
        return this.usedSize == 0;

    }
    public void heapSort() {

    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }
    public void show() {
        for(int i = 0;i < this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


}