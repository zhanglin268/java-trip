import java.io.File;
import java.io.IOException;

/**
 * @program:20200622-i0模块
 * @description
 * @author: 张林
 * @creat:2020-06-24 17:48
 **/
public class zijilianxi {
    public static void main(String[] args) throws IOException {
        String path  = "F:\\作业\\io学习\\i0基本知识\\zhuxinyu.txt";
        String path1  = "F:\\作业\\io学习\\i0基本知识\\zz.txt";
        String path2 = "F:\\作业\\io学习\\i0基本知识\\空目录";
        String path3 = "F:\\作业\\io学习\\i0基本知识";
        File file4 = new File(path3);
        String[] ret = file4.list();
        File[] ret0 = file4.listFiles();
        for(File s1:ret0) {
            System.out.println(s1.getAbsolutePath());
        }
        for(String s : ret) {
            System.out.println(s);
        }


//        File file = new File(path1);
//        boolean ret = file.createNewFile();
//        System.out.println(ret);
//        File file2 = new File(path2);
//        boolean ret1 = file2.mkdir();
//        System.out.println(ret1);
//
//        boolean ret2 = file.delete();
//        System.out.println(ret2);
//        boolean ret3 = file2.delete();
//        System.out.println(ret3);






       /*File  file = new File(path);
        File file1 = new File(path1);
        file.renameTo(file1);
        String path2 = "F:\\作业\\io学习\\bb.txt";
        File file3 = new File(path2);
        boolean istrue = file1.renameTo(file3);
        //System.out.println(istrue);
        boolean delete = file3.delete();*/
       // System.out.println(delete);





       // boolean ret = file.createNewFile();

        //System.out.println(ret);



    }
}
