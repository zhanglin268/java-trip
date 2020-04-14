/**
 * @program:20200414
 * @description
 * @author: 张林
 * @creat:2020-04-14 10:24
 **/
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class TestDemo {
    public static void printArrayy(int [] arr) {
        for(int x:arr) {
            System.out.println(x + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,43,56,23,67,24,34};
        printArray(arr);
    }


    public static void printTranForm(int [] arr) {
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void transform(int [] arr) {
        for(int i = 0;i < arr.length;i++) {
            arr[i] *= 2;
        }
    }
    public static void main26(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        transform(arr);
        printTranForm(arr);
    }


    public static void sumArr(int [] arr) {
        int ret = 0;
        for(int i = 0;i < arr.length;i++) {
            ret += arr[i];
        }
        System.out.println(ret);
    }
    public static void main25(String[] args) {
        int [] arr = {1,3,5,67,43,56,34,78};
        sumArr(arr);
    }



    public static double avg(int [] arr) {
        double ret = 0;

        for(int i = 0;i < arr.length;i++) {
           ret += arr[i];
        }
        return ret / arr.length;
    }

    public static void main24(String[] args) {
        int [] arr = {1,3,4,7,4,8,9,15,17};

        System.out.println( avg(arr));

    }


    public static int funF(int n) {
        if(n == 1) {
            return 1;
        }
        return n * funF(n - 1);
    }

    public static void main23(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt();
        int ret = funF(n);
        System.out.println(ret);
    }


    public static int sumn(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sumn( n - 1);
    }
    public static void main22(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = sumn(n);
        System.out.println(ret);
    }

    public static void printNum(int n) {
        if(n > 9 ) {
            printNum(n / 10);
        }
            System.out.print(n%10);
    }

    public static void main21(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printNum(n);
    }


    public static int backNum(int n) {
        if(n < 10) {
            return n;
        } else
        return n % 10 + backNum(n / 10);
    }

    public static void main20(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt();
       int ret =  backNum(n);
        System.out.println(ret);
    }


//递归求法
    public static int feibo(int n) {
        if(n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 1;
        }else {
            return feibo(n - 1) + feibo(n - 2);
        }
    }
    public static void main19(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(feibo(n));
    }



    public static int twoNum(int n1,int n2) {
        return n1 + n2;
    }
    public static double ThreeNum(double n1,double n2,double n3) {
        return n1 + n2 + n3;
    }


    public static void main18(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n1 = scan.nextInt();
       int n2 = scan.nextInt();
       double n3 = scan.nextDouble();
       double n4 = scan.nextDouble();
       double n5 = scan.nextDouble();


        System.out.println(twoNum(n1 , n2));
        System.out.println(ThreeNum(n3,n4,n5));

    }


    public static int JumpFloor(int n) {
        if(n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }else {
            return JumpFloor(n - 1) + JumpFloor(n - 2);
        }
    }
    public static void main17(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(JumpFloor(n));
    }



    public static void maxThree(double n1,double n2,int n) {
       double tmp = n1 > n2? n1:n2;//求N1和N2的最大值
        double max = tmp > n ? tmp : n;//求最大值
        double tmp1 = n1 < n2 ? n1 : n2;//求n1和n2之间的最小值
        double min = tmp < n ? tmp : n;//求最小值
        double mid = (n1+n2+n) - max - min;
        System.out.println("max" + max + " " +"mid" + mid +" " + "min" + min);
    }

    public static double maxTwoa(double n3,double n4) {

        return n3 > n4 ? n3 :n4;
    }
    public static int maxTwo(int n1,int n2) {
        return n1 > n2 ? n1:n2;
    }
    public static void main15(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        int ret1 =  maxTwo(n1,n2);
        double ret2 = maxTwoa(n3,n4);
        maxThree(n3,n4,n1);
        System.out.println(ret1);
        System.out.println(ret2);

    }


    public static int maxTwoNum(int n,int n2) {
        return n > n2 ? n:n2;
    }
    public static int maxThreeNum(int n,int n2,int n3) {
        return n3 > maxTwoNum(n,n2) ? n3:maxTwoNum(n,n2);
    }
    public static void main16(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int ret = maxThreeNum(n,n2,n3);
        System.out.println(ret);
    }

    public static void adjust(int [] arr) {
        //int i = 0;
        int j = arr.length - 1;
        for(int i = 0 ; i <= j;i++) {
            if((arr[i] % 2) != 0) {
                continue;
            }
            else{
            int tmp = 0;
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            i--;
            j--;
            }
        }
    }
    public static void printarr(int [] arr){
        for(int x:arr) {
            System.out.print(x + " ");
        }
    }


    public static void main14(String[] args) {
        int [] arr = {1,2,3,4,5,6,8,3,11,26};
        adjust(arr);
        printarr(arr);
    }


    public static int sum3(int n) {
        int ret = 1;

        for(int i = 1;i <= n;i++) {
            ret *= i;
        }
        return ret;

    }
    public static void main13(String[] args) {


       Scanner scan = new Scanner(System.in) ;
       int n = scan.nextInt();

        System.out.println(sum3(n));
    }


    public static int sum1(int i){
        int ret = 1;
        for(int m = 1;m <= i;m++) {
            ret *= m;
        }
        return ret;
    }


    public static int sum(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++) {
           sum += sum1(i);
        }
        return sum;
    }
    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(   sum(n));
    }


    public static int funcD(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        int i = 0;
        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        } else {
           for( i = 3;i <= n;i++) {
              c = a+b;
              a = b;
              b = c;
            }
        }
        return c;
    }


    public static void main11(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println( funcD(n));
    }


    public static void fund(int [] arr) {
        int i = 0;
        int j = 0;

        for(i = 0;i < arr.length;i++) {
            int count = 0;
            for(j = 0;j <arr.length;j++){
                if(arr[i] == arr [j]) {
                    count++;
                }

            }
            if(count == 1) {
                System.out.println(arr[i]);
                break;
            }

        }

    }

    public static void main10(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,5,4,6,6};
        fund(arr);

    }
    public static String myToString(int[] arr) {
        String ret = "[";
        for(int i = 0;i < arr.length;i++) {
            ret += arr[i];
            if(i != arr.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main9(String[] args) {
        int [] arr = {2,3,5,4,5,6,7};
        System.out.println(myToString(arr));
    }

    public static int [] func(int[] arr) {
        int [] tmp = new int [arr.length];
        for(int i = 0;i < arr.length;i++) {
            tmp[i] = arr[i]*2;
        }
        return tmp;
    }

    public static void main7(String[] args) {
        int [] arr = {1,3,4,5,6,7,8};
        int [] ret = func(arr);
        System.out.println(Arrays.toString(ret));
    }

    public static void main5(String[] args) {
        int[] arr = {1,2,65,32,45,67};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }




    public static void printArray(int [] arr) {
        for(int x:arr) {
            System.out.print(x + " ");
        }
    }

    public static void swap(int [] arr2) {
        int tmp = arr2[0];
        arr2[0] = arr2[1];
        arr2[1] = tmp;
    }
    public static void main4(String[] args) {
        /*int [] array = {1,2,3,4};
        printArray(array);*/
        int [] arr2 = {20,10};
        System.out.println(arr2 [0] + " " +arr2[1]);
        swap(arr2);
        System.out.println(arr2 [0] + " " +arr2[1]);


    }



    public static void main3(String[] args) {
        int [] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);

        for(int i = 0; i < array.length;i++) {
            System.out.print(array[i] + " ");
        }
        for(int x:array) {
            System.out.print(x + " ");
        }
    }


    public static void main2(String[] args) {
        int [] array = {1,2,3,4};
        int [] array2 = new int[] {1,2,3,4,5,6};
        int[] array3 = new int[4];
        array3[0] = 1;
         array3[1] = 2;
         array3[2] = 3;
         array3[3] = 4;

    }




    public static void move(char pos1,char pos2) {
        System.out.print(pos1 + "->" + pos2 + " ");
    }
    public static void hanno(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else{
            hanno(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanno(n-1,pos2,pos1,pos3);
        }
    }


    public static void main1 (String[] args) {
        hanno(3,'A','B','C');
    }
}
