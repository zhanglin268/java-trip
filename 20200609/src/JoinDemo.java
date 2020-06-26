/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-16 17:13
 **/
public class JoinDemo {

    static class B extends Thread {
        @Override
        public void run() {
            long r = 0;
            for(int i = 0;i < 100000000;i++) {
                r += i;
            }
            System.out.println("B 停止运行");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        B b = new B();
        b.start();


        System.out.println("我不走了 ，什么时候吧停止了，我才继续");
        b.join();
        System.out.println("B 结束了 我就继续");
    }
}
