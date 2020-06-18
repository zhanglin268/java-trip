/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-17 20:38
 **/
public class YieldDemo {
    static class A extends Thread {
        @Override
        public void run() {
           while(true) {
               System.out.println("A");
           }
        }
    }
    static class B extends Thread {
        @Override
        public void run() {
            while(true) {
                System.out.println("B");
                Thread.yield();//放弃抢占cpu
            }
        }
    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }

}
