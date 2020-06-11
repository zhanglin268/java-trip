import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-09 23:55
 **/



public class TestClass {

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };

        t.run();
        System.out.println("ping");
    }

    static void pong() {
        System.out.println("pong");
    }




    public static void main6(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name",null);
        map.put("name","jabc");
        System.out.println(map.size());
    }
   /* public int add(int a,int b) {
        try {
            return a+b;
        }catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }*/

    /*public static void main4(String[] args) {
        TestClass test = new TestClass();
        System.out.println("和是:" + test.add(9,34));
    }*/

   /* public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 2;
        byte b3 ;
        byte b6 ;
        final  byte b4 = 4 ;
        final  byte b5 = 6;
        b6 = b4+b5;
        b3 = (b1+b2);

        System.out.println(b3+b6);

    }*/
   /* public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a,b);
        System.out.println(a + " ," + b);
    }*/

    public static void operator(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
    }
   /* public static void main(String[] args) {
       try {
           int i = 100/0;
           System.out.println(i);
       }catch ( Exception e) {
           System.out.println(1);
           throw new RuntimeException();
       }finally {
           System.out.println(2);
       }
        System.out.println(3);
    }*/


}
