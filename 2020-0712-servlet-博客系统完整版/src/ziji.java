/**
 * @author: 张林
 * @Date :Created in 4:02 pm 13/07/2020
 */
public class ziji {

    public static void main(String[] args) {
        StringBuffer
        String str = "123";
        int n = Integer.parseInt(str);

        //char ch2 = 'b';
        //int num = Integer.parseInt(ch2);//错误的写法

       // String s = "b";
       // int f = Integer.valueOf(s);//错误的写法
        //System.out.println(f);

        String s = "123";
        int f = Integer.valueOf(s);
        System.out.println(f);

        char ch1 = 'b';
        int m = ch1-'0';
        System.out.println(n);
        System.out.println(m);
    }
    public static void main1(String[] args) {
        char ch = (char) 98;
        System.out.println(ch);
    }
}
