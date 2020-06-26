import java.io.File;

/**
 * @program:20200622-i0模块
 * @description
 * @author: 张林
 * @creat:2020-06-25 22:47
 **/
public class FileDemo1 {
    public static void main(String[] args) {

        File file = new File("F:\\作业\\io学习\\i0基本知识");
        File file1 = new File("F:\\作业\\io学习\\i0基本知识\\空目录");

        File[] files = file1.listFiles();
        for(File f:files) {
            System.out.println(f.getAbsolutePath());
        }


        String[] list = file1.list();
        for(String s : list) {
            System.out.println(s);
        }


       /* String path = "F:\\作业\\io学习\\i0基本知识\\aaa\\a.txt";
        String path1 = "F:\\作业\\io学习\\i0基本知识\\aaa\\b.txt";
        File file = new File(path);
        File file1 = new File(path1);
        boolean ret = file.renameTo(file1);
        System.out.println(ret);*/

       // boolean flg = file.mkdir();
        //System.out.println(flg);
    }
}
