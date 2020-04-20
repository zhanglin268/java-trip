import java.util.Arrays;

/**
 * @program:20200419
 * @description
 * @author: 张林
 * @creat:2020-04-19 22:16
 **/
import java.util.*;
public class MyArrayList {
    public int [] elem;//定义一个数组
    public int usedSize;//数组的有效数据个数
    public static final int capacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }


    //public int size() { return this.usedSize; }


    //判断是否是满了
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
        //return this.usedSize == this.elem.length;
    }
    //在pos位置新增个数
    public void add(int pos,int data) {
        //如果满了进行扩容
        if(isFull()) {
            this.elem =
                   Arrays.copyOf(this.elem,2*this.elem.length);

        }

        //判断pos合法性
        check(pos);
        //if(pos < 0 || pos > this.usedSize) {
         //   return ;
       // }
        for(int i = this.usedSize-1 ;i >= pos;i--) {
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
        //System.out.println(Arrays.toString(this.elem));
    }

    //查看是否包含某个元素
    public boolean contains (int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素
    public int search(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //判断pos是否合法
    private void check(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
}

    //判断是否为空
    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    //获取某个元素
    public int getPos(int pos) {
        //判断是否合法
    if(isEmpty()) {
        //return -1;
        throw new RuntimeException("顺序表为空");//手动抛出异常
    }
        if(pos < 0 || pos >=this.usedSize) {
           // System.out.println("pos位置不合法");
            throw new RuntimeException("pos位置不合法");
        }
        return this.elem[pos];
    }

    public void remove(int key) {
        int n = search(key);
        if(n == -1) {
            System.out.println("没有你找的数字！");
        }
        for(int i = n;i < this.usedSize;i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    //获取元素个数
    public int getSize() {
        return this.usedSize;
    }


    public void clear() {
        this.usedSize = 0;
    }

}
