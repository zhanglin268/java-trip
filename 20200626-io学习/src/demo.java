import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @program:20200626-io学习
 * @description
 * @author: 张林
 * @creat:2020-07-02 00:11
 **/
public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "......";
        PrintWriter write = new PrintWriter("aaa.txt");
        write.write("jfajfskjf");
        write.println("aaaaaaaa");
        write.println(s);

        write.flush();
        write.close();
    }
}
