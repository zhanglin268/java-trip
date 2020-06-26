<<<<<<< HEAD
import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program:20200609
 * @description
 * @author: 张林
 * @creat:2020-06-09 23:55
 **/

 /*abstract class MyClass {
    public int con = 5;

   // public int meth();
    //public abstract  void method(int a) ;
    public void method () {

    }
}*/
 /*class bird {
     public void run() {
         System.out.println("正在跑");
     }
}*/


/* abstract class Animal {
     abstract  void say();
}*/
public class TestClass {


    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if(s1.equals(s2)) {
            System.out.println(".equals succeeded");
        }
        if(s1 == s2) {
            System.out.println("==succeeded");
        }
    }

   /* public static void main(String[] args) {
        System.out.println(switchit(4));
    }


    public static int switchit(int x) {
        int j = 1;
        switch(x) {
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            case 5:
                j++;
            default:
                j++;

        }
        return j+x;
    }*/
    /*static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for(out('A');out('B') && (i < 2) ;out('C')) {
            i++;
            out('D');
        }
    }*/



    /* public TestClass() {
         System.out.println(" I am a cat ");
     }*/

  /*  @Override
    void say() {

    }*/



  /*  @Override
    public void run() {
        System.out.println("111111");

    }
    static void dianpint() {
        System.out.println("dianping");
    }*/

   /* public static void main(String[] args) {
         Thread t = new Thread() {
             public void run() {
                 dianpint() ;
             }
         };
         t.run();
        System.out.println("dazhong");

    }
    public static void main0(String[] args) {
        TestClass t = new TestClass();
        bird t1 = new TestClass();
        t.run();
        t1.run();
    }




    public static void main22(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
    }

    public  static void add(Byte b) {
        b = b++;
    }
    public  static void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a+ " ");
        add(b);
        System.out.println(b + " ");
    }
    public static void main11(String[] args) {
       test();*/






        /*public void getCustomerInfo() {
            try {

            }catch (java.io.FileNotFoundException ex) {
                System.out.println("FileNotFoundException");
            }catch (java.io.IOException ex) {
                System.out.println("IOException");
            }catch (java.lang.Exception ex) {
                System.out.println("Exception");
            }

        }*/

   // }





  /*  public static void main8(String[] args) {
       Scanner scan = new Scanner(System.in);
       String n = scan.nextLine();
       char[] str = n.toCharArray();
       for(int i = 0;i < str.length;i++) {
           System.out.println(str[i]);
       }

    }*/

   /* public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };

        t.run();
        System.out.println("ping");
    }*/

  /*  static void pong() {
        System.out.println("pong");
    }
*/



   /* public static void main6(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name",null);
        map.put("name","jabc");
        System.out.println(map.size());
    }*/
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

   /* public static void operator(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
    }*/


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
=======
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
>>>>>>> f0418fc1d0bff6c554b357b73f3efbbb60bf46c0
