/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-21 16:25
 **/
public class WaitReleaseLock {
    static final Object o1 = new Object();
    static final Object o2 = new Object();

    static class SubThread extends Thread {
        @Override
        public void run() {
            try {
                synchronized (o1) {
                    synchronized (o2) {
                        o2.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SubThread subThread = new SubThread();
        subThread.start();

        // 主动放弃CPU，保证让子线程运行起来
        Thread.sleep(1000);

        // 子线程已经运行起来了
        synchronized (o2) {
            System.out.println("o2 加锁成功");
        }

        synchronized (o1) {
            System.out.println("o1 加锁成功");
        }
    }
}
