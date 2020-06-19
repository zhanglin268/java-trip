/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-19 17:32
 **/
public class FixUnsife {
    private static final long N = 100_0000L;
    private static long V = 0;
    static class Add extends Thread {
        @Override
        public void run() {
            for(long i = 0;i < N;i++) {
                synchronized (FixUnsife.class) {

                        V++;

                }
            }

        }
    }

    static class Sub extends Thread {
        @Override
        public void run() {
            for(long i = 0;i < N;i++) {
                synchronized (FixUnsife.class) {

                        V--;

                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();
        a.start();
        s.start();
        a.join();
        s.join();
        System.out.println(V);

    }
}
