import java.util.Scanner;

/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-21 20:42
 **/
public class MyBlockingQueueMain2 {
    private static final MyBlockintQueue queue = new MyBlockintQueue();

    static class Producer extends Thread {

        Producer(int i) {
            super("生产者——" + i);
        }

        @Override
        public void run() {
            try {
                for(int i = 0;true;i++) {
                    queue.push(i);
                    System.out.println(getName()+ ":放入：" + i);
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 预期是：5个线程一共加起来一共存放十六个数据之后就会全部阻塞
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i < 5;i++) {
            new Producer(i).start();
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
           // System.out.println("输入回车，进行消费");
           // scanner.nextLine();
            int i = queue.pop();
            System.out.println("消费者取出了："+ i);

        }
    }

}
