/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-16 13:28
 **/
public class PrintThreadFieldsChild {
    static class SubThread extends Thread {
        @Override
        public void run() {
            printFields();
        }
    }
    public static void main(String[] args) {
        Thread thread = new SubThread();
        thread.start();
        printFields();
    }

    private static void  printFields(){
        Thread t = Thread.currentThread();
        long id = t.getId();


        System.out.println("线程的名字"+id + ":" + t.getName());
        System.out.println("线程的优先级"+id + ":" + t.getPriority());
        System.out.println("线程的状态"+id + ":" + t.getState());
        System.out.println("线程是否存活"+id + ":" + t.isAlive());
        System.out.println("线程是否后台线程"+id + ":" + t.isDaemon());

    }
}
