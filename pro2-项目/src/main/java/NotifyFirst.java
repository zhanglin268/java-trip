/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-21 17:31
 **/
public class NotifyFirst {
    static class SubThread extends Thread {
        @Override
        public void run() {
            try {
                synchronized (this) {
                    wait();
                    System.out.println("子线程能被唤醒嘛");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        SubThread s = new SubThread();
        //先调用notify 然后在让子线程运行，调用wait
        //s指向的对象，就是子线程代码中的this指向的对象
        synchronized (s) {
            s.notify();
        }
        s.start();
    }
}
