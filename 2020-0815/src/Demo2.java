import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: 张林
 * @Date :Created in 11:39 pm 15/08/2020
 */
public class Demo2 {
    public static void main(String[] args) {

            public int [] elem;//public T[] elem;
            public int top;
            public Demo2() {
                this.elem = new int[10];//this.elem = (T[]) new Object[10];
                this.top = 0;
            }
            public void push(int val) {
                if(full()) {
                    this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
                    //进行扩容
                }
                this.elem[top++] = val;
            }
            public boolean empty () {
                return this.top == 0;
            }
            public boolean full() {
                return this.top == this.elem.length;
            }
            public int  pop() {//返回值 T
                if(empty()) {
                    throw new RuntimeException("栈空");
                }
                int data = this.elem[this.top-1];//T data
                //int data = this.elem[--this.top];
                this.top--;//拿到栈顶元素并删除
                return data;

            }
            public int peek() {// T
                if(empty()) {
                    throw new RuntimeException("栈空");

                }//拿到栈顶元素不删除
                return this.elem[this.top-1];
            }
            public int size() { //T
                return this.top;
            }
            Queue<Integer> q = new LinkedList<>();
        public class MyCircularQueue {
            public int[] elem;
            //public int usedsize;
            public int front;
            public int rear;
            public MyCircularQueue(int k) {
                this.elem = new int [k+1];
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
                this.front = (this.front+1)%this.elem.length;
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



//
/*class MyCircularDeque {
    public int [] elem;
    public int front;
    public int rear;



public MyCircularDeque(int k) {
    this.elem = new int[k+1];
}

    *//** Adds an item at the front of Deque. Return true if the operation is successful. *//*
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        this.front = (this.front - 1 + this.elem.length) % this.elem.length;
        this.elem[this.front] = value;
        return true;


    }

    *//** Adds an item at the rear of Deque. Return true if the operation is successful. *//*
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        this.elem[rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        return true;
    }

    *//** Deletes an item from the front of Deque. Return true if the operation is successful. *//*
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        this.front = (this.front + 1) % this.elem.length;
        return true;
    }

    *//** Deletes an item from the rear of Deque. Return true if the operation is successful. *//*
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        if(this.rear == 0) {
            this.rear = this.elem.length-1;
        }else {
            this.rear = this.rear -1;
        }
        return true;
    }

    *//** Get the front item from the deque. *//*
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    *//** Get the last item from the deque. *//*
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        int index = this.rear == 0 ? this.elem.length -1 : this.rear-1;
        return this.elem[index];
    }

    *//** Checks whether the circular deque is empty or not. *//*
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    *//** Checks whether the circular deque is full or not. *//*
    public boolean isFull() {
        if((rear+1)%this.elem.length == front) {
            return true;
        }
        return false;
    }
}*/



    }
}
