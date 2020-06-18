/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-16 19:44
 **/
public class ThreadUnsafeDemo {
    private static final int N = 1000000;
    private static int v = 0;

    static class Add extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v++;
            }
        }
    }
    static class Sub extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v--;
            }
        }
    }
    public static void main(String[] args)
            throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();
        a.start();
        s.start();

        a.join();
        s.join();
        // 这里时，a 和 s 都结束了
        System.out.println(v);
    }
}
