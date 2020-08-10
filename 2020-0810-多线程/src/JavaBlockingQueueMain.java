import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-22 11:11
 **/
public class JavaBlockingQueueMain {
    static BlockingQueue<Integer> q1 = new ArrayBlockingQueue<>(10);
    static BlockingQueue<Integer> q2 = new LinkedBlockingDeque<>();
    static BlockingQueue<Integer> q3 = new PriorityBlockingQueue<>();

    static class Producer extends Thread {

        @Override
        public void run() {
            try {
                for(int i = 0;true;i++) {
                    q1.put(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i < 5;i++) {
            new Producer().start();

        }
        while(true) {
            Integer take = q1.take();
            System.out.println(take);
        }
    }
}
