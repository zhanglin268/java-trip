package com.lin.demo;

import java.util.Arrays;

/**
 * @program:20200603
 * @description
 * @author: 张林
 * @creat:2020-06-03 01:26
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;
    public MyArrayList(){
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    //判断是否是满了
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    //判断pos的合法性
    public void isCheck(int pos) {
        if(pos < 0 || pos > this.usedSize) {
           throw new RuntimeException("pos位置不合法");
        }

    }
    //在pos位置新增个数
    public void add(int pos,int data) {
        if(isFull()) {//如果满进行扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //判断pos的合法性
        isCheck(pos);
        for(int i = this.usedSize-1;i >= pos;i--) {//不能用i++那种方法 会覆盖后面的数据
               this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    public void display() {
        for(int i = 0;i < this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
