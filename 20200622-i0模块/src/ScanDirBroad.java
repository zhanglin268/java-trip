import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program:20200622-i0模块
 * @description
 * @author: 张林
 * @creat:2020-06-26 01:10
 **/
public class ScanDirBroad {
    public static void main(String[] args) {
        File root = new File("F:\\作业\\io学习\\i0基本知识");
        //广度优先一定用到队列
        Queue<File> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            File node = queue.poll();
            if(node.isDirectory()) {
                System.out.println(node.getAbsolutePath()+"\\\\\\\\");
            }else if(node.isFile()) {
                System.out.println(node.getAbsolutePath());
            }

            //找到node的所有孩子

            if(node.isDirectory()) {
                File[] children = node.listFiles();
                if(children != null) {
                    for(File child : children) {
                        queue.offer(child);
                    }
                }
            }
        }
    }
}
