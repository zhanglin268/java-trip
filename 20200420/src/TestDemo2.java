import com.sun.jmx.remote.internal.ArrayQueue;

/**
 * @program:20200420
 * @description
 * @author: 张林
 * @creat:2020-04-20 16:58
 **/

//使用数组编写一个模拟队列
class  MyArrayQueue {
    private int maxSize;//表示最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//该数据用于存放数据
    //创建队列构造器
    public MyArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        front  = -1;//指向队列头部分析出front是指向队列头部的前一个位置
        rear = -1;
    }
    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize -1;

    }
    public boolean isEmpty() {
        return rear == front;
    }
    public void addQueue(int n) {
        if(isFull()) {
            System.out.println("队列满不能加入数据！");
        }
        rear++;//让rear后移
        arr[rear] = n;
    }
    //获取队列
    public int getQueue() {
        //判断队列是否为空
        if(isEmpty()) {
            throw new RuntimeException("队列为空不能获取");

        }
        front++;//front后移
        return arr[front];
    }
    public void showQueue() {
        //遍历
        if(isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }
        for(int i = 0;i < arr.length;i++) {
            System.out.printf("arr[%d]=%d",i,arr[i]);
        }
    }
    //显示队列的头部，注意不是取数据
    public int headQueue() {
        if(isEmpty()) {
            //通过抛出异常
        throw new RuntimeException("队列空的，没有数据");

        }
        return arr[front +1];
    }

}

public class TestDemo2 {
    public static void main(String[] args) {

    }

}
