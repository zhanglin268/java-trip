/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-21 18:03
 **/
public class MyBlockintQueue {
    //private int[] array = new int[16];//存放数据的数组
    private int[] array = new int[1];//存放数据的数组

    private volatile int size = 0;               //当前已有元素个数
    private int frontIndex = 0;       //指向队首元素下标
    private int rearIndex = 0;

    public synchronized void push(int element) throws InterruptedException {
        //判断队列是否满
        while(size >= array.length) {
           // throw new RuntimeException("队列已满");
            wait();//等着pop的线程唤醒，所以在pop中实现notity
        }
        array[rearIndex] = element;
        size++;//破坏了原子性
       /* rearIndex = rearIndex + 1;

        if(rearIndex >= array.length) {
            rearIndex -= array.length;
        }*/

       rearIndex = (rearIndex+1) % array.length;
       notify();


    }

    public synchronized int pop() throws InterruptedException {
        while(size == 0) {
           // throw new RuntimeException("队列已空");
            wait();//等待调用push的线程唤醒
        }
        int element = array[frontIndex];
        frontIndex = (frontIndex+1) % array.length;
        size--;

        notify();
        return element;

    }
    public int size() {
        return size;//内存有可见性问题
    }


}
