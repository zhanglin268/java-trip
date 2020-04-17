/**
 * @program:20200417
 * @description
 * @author: 张林
 * @creat:2020-04-17 22:47
 **/
import java.util.*;


public class TestDemo4 {
    public static int Fiboncci(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 3;i <= n;i++) {
            c = a + b ;
            a = b ;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int n = scan.nextInt();
        Fiboncci(n);
    }
}
