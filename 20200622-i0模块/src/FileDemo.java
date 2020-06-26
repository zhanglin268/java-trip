import java.io.File;
import java.io.IOException;
import java.util.Collections;

/**
 * @program:20200622-i0模块
 * @description
 * @author: 张林
 * @creat:2020-06-22 20:30
 **/
public class FileDemo {
    public static void main(String[] args) throws IOException {
      // String path = "F:\\作业\\io学习\\i0基本知识\\demo.txt";
       // String path = "io学习\\aa.txt";
        String path = "F:\\作业\\io学习\\i0基本知识\\rr.txt";
        File file = new File("F:\\作业\\io学习\\i0基本知识\\rr.txt");
        boolean ret = file.delete();
        System.out.println(ret);


        //String path1 = "D:\\daimalianxi\\20200622-i0模块\\io学习\\ccc.txt";
        //String path2 = "没有的目录\\ddd.txt";
       // F:\作业\io学习\i0基本知识
        //构建文件对象
        //File file = new File(path);
        ////////System.out.println( file.createNewFile());
        //文件是否是普通文件
       // System.out.println(file.isFile());
        //是否是文件夹
       // System.out.println(file.isDirectory());
        //是否隐藏
       // System.out.println(file.isHidden());

       //System.out.println(file.exists());


       // System.out.println(file.getAbsolutePath());
       // System.out.println(file.getPath());
       // File file2 = new File(path2);
       // System.out.println(file2.mkdirs());
       // System.out.println(file.getName());
       // System.out.println(file.getParent());
      // System.out.println(file.canRead());
        //System.out.println(file.canWrite());



    }



}
