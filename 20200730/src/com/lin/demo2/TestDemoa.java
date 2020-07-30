package com.lin.demo2;

/**
 * @program:20200428
 * @description
 * @author: 张林
 * @creat:2020-04-28 18:57
 **/
class Shape {

}
class Cycle extends Shape {

}
public class TestDemoa {
}
class Node1 {
    public int data;//数据
    public Node1 next;//
    public Node1 prev;//前驱
    public Node1 (int data){
        this.data = data;
    }

//public class MyLinkedList {
    Node1 head = null;
    Node1 tail = null;

    public void addFirst(int data) {
        Node1 node = new Node1(data);
        //第一次插入
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }else {
            //不是第一次插入
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
            return ;
        }
    }
    public void display() {
        Node1 cur = this.head;

        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void addList (int data) {
        Node1 node = new Node1(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }


    }
    public boolean contains(int  key) {
        Node1 cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        Node1 cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    private void checkIndex(int index) {
        if(index < 0 || index >size()) {
            throw new RuntimeException("index不合法");
        }
    }
    //任意位置插入
    public Node1 searchIndex(int index) {
        Node1 cur = this.head;
        while(index != 0) {
            cur = cur.next;
            index--;
        }

        return cur;
    }
    public void addIndext(int index,int data) {
        checkIndex(index);
        if(index == 0 ) {
            addFirst(data);
            return ;
        }
        if(index == size()) {
            addList(data);
            return ;
        }
        Node1 cur = searchIndex(index);
        Node1 node = new Node1(data);
        cur.prev.next = node;
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
    }
    public int  remove(int key) {
        Node1 cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    //删除的是头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        //删除尾结点只需要移动tail
                        this.tail = cur.prev;
                        //cur.next.prev = cur.prev;
                    }


                }
                return oldData;
            }

            cur = cur.next;
        }

        return -1;
    }
    public void clear() {
        while(this.head != null) {
            Node1 cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }




}