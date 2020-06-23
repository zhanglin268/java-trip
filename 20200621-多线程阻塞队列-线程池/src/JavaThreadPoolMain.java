import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program:20200621-多线程阻塞队列-线程池
 * @description
 * @author: 张林
 * @creat:2020-06-22 11:41
 **/
public class JavaThreadPoolMain {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService threadPool = new ThreadPoolExecutor();
        //创建让线程池执行的任务
        Runnable target = new Runnable() {
            @Override
            public void run() {

            }
        };
        //等同于把任务交给线程池
        //线程池内部会选择一个空闲
        threadPool.execute(target);
    }
}
