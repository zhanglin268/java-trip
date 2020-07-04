import java.util.PriorityQueue;

/**
 * @program:JDBC学习
 * @description
 * @author: 张林
 * @creat:2020-06-28 00:46
 **/
public class demo1 {

    public static int a = 19;

    public static void main(String[] args) {
        demo1 d = new demo1();
        System.out.println(d.a);
        System.out.println(demo1.a);

    }


    public static void main1(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(8);
        queue.offer(9);
        queue.offer(5);
        queue.offer(6);
        queue.offer(3);

        for(int i = 0;i < 6;i++) {
            System.out.println(queue.poll());
        }




    }
}
