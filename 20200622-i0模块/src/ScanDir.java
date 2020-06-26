import java.io.File;

/**
 * @program:20200622-i0模块
 * @description
 * @author: 张林
 * @creat:2020-06-24 19:54
 **/
public class ScanDir {
    public static void main(String[] args) {
        int count = 0;
        File root = new File("F:\\作业\\io学习\\i0基本知识");
        scanDir(root,count);

    }

    /**
     *
     * 保证node 代表的一定是目录
     *
     * @param node
     */
    private static void scanDir(File node,int count) {
        //缩进单位
        count++;
        for(int i = 0;i < count;i++) {
            System.out.print("    ");
        }
        //1.先打印节点的绝对路径
        System.out.println(node.getAbsolutePath()+ "\\\\\\");
        //2.获取节点的孩子节点
        File[] children = node.listFiles();
        if(children == null) {
            //防御式编程
            return ;
        }

        //3.孩子中的普通文件
        //孩子中的目录
        for(File child : children) {
            if(child.isDirectory()) {
                scanDir(child,count);
            }else if(child.isFile()){
                for(int i =0;i <= count;i++) {
                    System.out.print("    ");
                }
                System.out.println(child.getAbsolutePath());
            }
        }

        
    }

}
