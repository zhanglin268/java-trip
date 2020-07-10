import java.util.Arrays;

/**
 * @program:20200422
 * @description
 * @author: 张林
 * @creat:2020-04-22 09:51
 **/
public class LinkedListA {
    //public int [] elem;//定义一个数组
   // public int usedSize;//数组元素个数；
    private int [] elem;//定义一个数组
    private int usedSize;//数组元素个数；



    public LinkedListA() {
        this.elem = new int [10];
        this.usedSize = 0;
    }
    //判断是否满了
    public boolean isFull () {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    private void check(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }


   /* private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }*/

    //判断是否合法

     //在pos位置增加一个数
    public void addList(int pos, int data) {
        //判断是否合法
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return ;
        }
        while(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);

        }
        for(int i = this.usedSize - 1;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];
        }

        this.elem[pos] = data;
        this.usedSize++;
    }
    public boolean isEmpty () {
        if(this.elem.length == 0) {
            return true;
        }
        return false;

    }
    public void diaplay() {

/*while(isEmpty()) {
            System.out.println("顺序表为空");
        }*/
            for(int i = 0;i < this.usedSize;i++) {
                System.out.print(this.elem[i] + " ");
            }
        System.out.println();
    }

    public boolean toFind(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;


    }
     public int search(int toFind) {
         for(int i = 0;i < this.usedSize;i++) {
             if(this.elem[i] == toFind) {
                 return i;
             }
         }
        return -1;
    }
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize ) {
            System.out.println("pos位置不合法");

        }
        return this.elem[pos];

    }
    public void remove(int key) {
        int tmp = search(key);
        if(tmp == -1) {
            System.out.println("没有你要找的数字");
        }

        for(int i = tmp ;i < this.usedSize;i++) {
            this.elem[i] = this.elem[i+1];

        }
        usedSize--;
    }
    public  void clear() {
        this.usedSize = 0;
    }



}

