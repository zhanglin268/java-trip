import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @program:20200413
 * @description
 * @author: 张林
 * @creat:2020-04-13 10:03
 **/
public class TestDemo {
    public  static int Find(int target,int [][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int i = rows - 1;
        int j = 0;
        while (i >=0 && j < cols) {
            if(target < arr[i][j]) {
                i--;
            }
            else if(target > arr[i][j]) {
                j++;

            } else
                return 1;

        }
        return 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = scan.nextInt();
         int ret  = Find(target,arr);
        System.out.println(ret);
    }


    //汉诺塔问题
    public static int funcD(int n) {
        if(n == 1) {
            return 1;
        }
        return 2*funcD(n-1) + 1;
    }
    public static void main13(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(funcD(n));
    }




    //  1  2  3  4  5  6  7
    //  1  2  3

    public static int feibona(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 3;i <= n;i++) {
            c = a + b;

            a = b;
            b = c;
        }
        return c;
    }

    public static int feibo(int n) {
        if( n == 1 || n == 2 ) {
            return 1;
        }
            return feibo(n-1) + feibo(n-2);

    }
//菲波那切数列
    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(feibo(n));
    }


    public static int sumTwo(int n) {
        if(n < 10) {
            return 1;
        }
        return n%10 + sumTwo(n/10);
    }

    public static void main11(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumTwo(n));
    }



    public static int sumOne(int n) {
        if(n == 1) {
            return 1;
        }
        return n * sumOne(n-1);
    }

    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
        System.out.println(sumOne(n));

    }

    public static void func(int n) {
        if(n > 9) {
            func(n/10);
        }
        System.out.println(n%10);
    }

    public static int facOne(int n) {
        if(n == 1) {
           return 1;
        }
        return n*facOne(n-1);
    }

    public static void main9(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        func(n);
        System.out.println(facOne(n));
    }




    public static int sum(int A,int B){
        return A + B;
    }
    public static int sum(int A,int B,int C) {
        return A + B + C;
    }
    public static double sum(double A,double B) {
        return A + B;

    }
    public static double sum(double A,double B,double C) {
        return A + B + C;
    }
    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double  A = 20.9;
        double  B = 32.9;
        double  C = 32.2;
        System.out.println(a+b);
        System.out.println(a+b+c);
        System.out.println(A+B);
        System.out.println(A+B+C);

    }



    public static void main6(String[] args) {
       int a = 10;
       int b = 20;
       //swap(a,b);
        System.out.println(a + " " + b );
    }





    public static int fac(int num) {
       int ret = 1;
       for(int i= 1;i <= num;i++) {
           ret *= i;
       }
       return ret;
    }
    public static int factor(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++) {
            int ret = 1;
            //for(int j = 1;j <= i;j++) {
           // //    ret *= j;
          //  }

            sum += fac(i);
        }
        return sum;
    }


    public static void main5(String[] args) {
        int n = 0;
        System.out.println(factor(n=5));

    }



    public static int sum1(int a,int b ) {
        return a + b;
    }

    public static void main4(String[] args) {
      int a = 10;
      int b = 20;
      int ret = sum1(a ,b );
        System.out.println(ret);
      int ret2 = sum1(a=41,b=49);
        System.out.println(ret2);
    }



    public static int maxThreeNum(int num1,int num2,int num3) {
        return maxNum(maxNum(num1,num2),num3);

    }


    public static int maxNum(int num1,int num2) {
        return num1 > num2 ? num1 : num2;

    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int ret = maxThreeNum(n1,n2,n3);
        System.out.println(ret);

    }



    public static void main2(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int i = 0;
        System.out.println("请输入你的数字：");
        //00000000 00000000 00000000 00001010
        System.out.println("这是偶数序列：");
        for(i = 31;i >= 1;i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        System.out.println("这是奇数序列：");
        for(i = 30;i >= 0;i -= 2) {
            System.out.print(((n >> i) & 1) + " ");
        }
    }



    public static void main1(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int count = 0;
     for(int i = 0;i < 32;i++) {
         if(((n >> i) & 1) == 1) {
             count++;
         }
     }
        System.out.println(count);


    }

}
