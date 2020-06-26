/**
 * @program:20200509
 * @description
 * @author: 张林
 * @creat:2020-05-09 17:43
 **/
public class TestDemo {
    public static void main(String[] args) {
        int n = 5;
        int jie = 1;
        int sum = 0;
        int i = 1;
        while(i <= n) {
            jie  *= i;
            sum += jie;
            i++;
        }
        System.out.println(sum);
    }
}
