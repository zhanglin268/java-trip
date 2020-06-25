import java.util.Scanner;

/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-16 15:13
 **/
public class AboutThreadStop {

    static class B  extends Thread {
        B() {
            super("B");
        }

        @Override
        public void run() {


                try {
                    while(true) {
                        System.out.println("我正在挖煤");
                        Thread.sleep(1000);
                        boolean interrupted = Thread.interrupted();
                        System.out.println("是否有人让我停止运行："+interrupted);
                    }
                }catch (InterruptedException e) {
                    System.out.println("有人让我停止运行，但因为我睡着了，所以我收到了这个异常");
                }



/*
            while(true) {
                try {
                    System.out.println("我正在挖煤");
                    Thread.sleep(1000);
                    boolean interrupted = Thread.interrupted();
                    System.out.println("是否有人让我停止运行："+interrupted);
                }catch (InterruptedException e) {
                    System.out.println("有人让我停止运行，但因为我睡着了，所以我收到了这个异常");
                }

            }*/






        }
    }


    public static void main(String[] args) {
        B b = new B();
        b.start();
        Scanner scan  = new Scanner(System.in);
        System.out.println("准备通知B线程停止运行");
        scan.nextLine();

        b.interrupt();
        System.out.println("已经通知B线程停止运行");
    }
}
