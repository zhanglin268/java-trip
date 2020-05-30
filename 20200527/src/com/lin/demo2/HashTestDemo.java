package com.lin.demo2;

import java.util.HashMap;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-30 21:36
 **/

class HashBuck {
    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node (int key,int val) {
            this.key = key;
            this.val = val;
        }


    }
    public Node[] array = new Node[10];
    public int usedSize;

    public void put(int key,int val) {
        int index = key % array.length;
        for(Node cur  = array[index];cur != null;cur = cur.next) {
            if(cur.key == key) {
                //key相同更新val值
                cur.val = val;
                return ;
            }
        }
        Node node = new Node(key,val);//用头插法就包含了第一次插入
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if(loadFactor() > 0.75) {
            resize();
        }

    }

    public double loadFactor() {
        return this.usedSize *1.0 /this.array.length;
    }

    public void resize() {//重新hash
        Node[] newarray = new Node[2*this.array.length];
        for(int i = 0;i < array.length;i++) {
            Node cur = array[i];
            while(cur != null) {
                Node curNext = cur.next;
                int index = cur.key % newarray.length;

                cur.next = newarray[index];
                array[index] = cur;

                cur = curNext;
            }
        }
        array = newarray;
    }




}
public class HashTestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        for(int i = 1;i < 8;i++) {
            hashBuck.put(i,i);
        }
        hashBuck.put(11,11);

    }
}
