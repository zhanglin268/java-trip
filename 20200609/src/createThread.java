<<<<<<< HEAD
/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-15 18:53
 **/
public class createThread {
    static class SubThread extends  Thread {

        @Override
        public void run() {
            printFileds();
        }
    }

    public static void main(String[] args) {
        Thread thread = new SubThread();
        thread.start();

        printFileds();
    }

    private static void printFileds() {
        Thread t = Thread.currentThread();
        long id = t.getId();


        System.out.println("线程的名字：" + id + " :" + t.getName());
        System.out.println("线程的优先级：" + id + " :" + t.getPriority());
        System.out.println("线程的状态：" + id + " :" + t.getState());
        System.out.println("线程的存活：" + id + " :" + t.isAlive());
        System.out.println("线程是否是后台：" + id + " :" + t.isDaemon());


    }

}
=======
/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-15 18:53
 **/
public class createThread {
    static class SubThread extends  Thread {

        @Override
        public void run() {
            printFileds();
        }
    }

    public static void main(String[] args) {
        Thread thread = new SubThread();
        thread.start();

        printFileds();
    }

    private static void printFileds() {
        Thread t = Thread.currentThread();
        long id = t.getId();


        System.out.println("线程的名字：" + id + " :" + t.getName());
        System.out.println("线程的优先级：" + id + " :" + t.getPriority());
        System.out.println("线程的状态：" + id + " :" + t.getState());
        System.out.println("线程的存活：" + id + " :" + t.isAlive());
        System.out.println("线程是否是后台：" + id + " :" + t.isDaemon());


    }

}
>>>>>>> 2743dbaa56b622fac59a6110d433b015a39cbad7
