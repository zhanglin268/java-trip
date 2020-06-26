import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-16 19:05
 **/
public class ThreadStateTransfer {
    static class SubThread extends Thread {
        @Override
        public void run() {
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.out.println("子线程即将退出");


/*
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }




    }

    public static void main(String[] args) throws InterruptedException {
        Thread p = new SubThread();
        System.out.println(p.getState());
        p.start();
        System.out.println(p.getState());
        while (p.isAlive()) {
            System.out.println(p.getState());
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(p.getState());

    }
}
