import java.sql.SQLOutput;

/**
 * @program:20200415
 * @description
 * @author: 张林
 * @creat:2020-04-15 15:49
 **/
import java.util.*;

class Person {

    public static int maxFund(int [] arr) {
        int ret = 0;
        for(int i = 0;i < arr.length;i++) {
            if(ret >= arr[i]) {
                continue;
            }else {
                int tmp = arr[i];
                arr[i] = ret;
                ret = tmp;
            }

        }
        return ret;
    }
    public static void main4(String[] args) {
        int [] arr = {1,3,4,5,6,8,9};
       int ret =  maxFund(arr);
        System.out.println(ret);
    }


    public static void printRet(int [] ret) {
        for(int x:ret) {
            System.out.println(x + " ");
        }
    }
    public static void copyArr (int [] arr) {
        int [] ret = new int [6];
        for(int i = 0;i < arr.length;i++) {
            ret[i] = arr[i];
        }
        printRet(ret);

    }

    public static void main3(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        copyArr(arr);

    }


    public int age;
    public String name;
    public String sex;
    public void eat() {
        System.out.println("吃饭！");
    }
    public void sleep() {
        System.out.println("睡觉！");
    }
}




public class TestDemo {

    public static void swap(int [] arr) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                //left遇到奇数
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;

            }

           if(left < right) {
               int tmp = arr[right];
               arr[right] = arr[left];
               arr[left] = tmp;
           }
        }

    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,7};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reback(int [] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {

                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                left++;
                right--;

        }

    }
    public static void main16(String[] args) {
        int [] arr = {1,3,4,5,6,7};
        reback(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int [] arr) {

        for(int i = 0; i < arr.length-1;i++) {
            boolean flag = true;
            for(int j = 0;j < arr.length -1 -i;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag = true) {
                break;
            }
        }
    }

    public static void main15(String[] args) {
        int [] arr = {9,12,8,5,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int binarySearchOne(int [] arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while(left < right){
           int  mid = (left+right)/2;

            if(arr[mid] > key) {
                right = mid - 1;
            }
           else if(arr[mid] < key) {
                left = mid + 1;
            }else {
               return mid;
            }
        }
        return -1;
    }
    public static void main13(String[] args) {
        int [] arr= { 1,3,4,5,6,7,8,9,10,11,23,45,67,89,99};

        int ret  = binarySearchOne(arr,9);
        System.out.println(ret);
        System.out.println(Arrays.binarySearch(arr,11));
    }

    public static void main12(String[] args) {
        int [] arr = {1,4,6,7,8,9,14,15,16,24,67};

    }
    public static int find(int [] arr ,int key) {

        for(int i = 0;i < arr.length;i++) {
           if(arr[i] == key) {
               return i;
           }
        }
        return -1;
    }

    public static void main11(String[] args) {
        int [] arr = {1,3,4,34,52,42,67};

        System.out.println(    find(arr,34));
    }



    public static int fundMas(int [] arr){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main10(String[] args) {
        int [] arr = {1,3,4,5,6,34,7,8,10};
        int ret = fundMas(arr);
        System.out.println(ret);

    }
    public static void main9(String[] args) {
        int [] arr = {1,3,4,5,6,7};

        int [] ret = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));


        int [] arr2 = new int [arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));


        int [] arr3 = arr.clone();
        System.out.println(Arrays.toString(arr3));
    }



   // int [] arr = {1,3,4,5,6,6};
    //int [] arr1 = new int[]{1,3,4,5,6,7};
    //int [] arr2 = nwe int[4];
    //int arr[i] = ?



    public static int [] copyArr(int [] arr){
        int [] ret = new int [arr.length];
        for(int i = 0;i < arr.length;i++) {
            ret [i] = arr[i];
        }
        return ret;
    }
    public static void main8(String[] args) {
        int [] arr = {1,3,4,5,6,7,8};
        copyArr(arr);
        System.out.println(Arrays.toString(arr));

    }





    public static void func(int [] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }


    public static void main7(String[] args) {
        int [] arr = {1,2,3,4,5,6,77};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
    //////////
    public static boolean isUp(int [] arr) {
        for(int i = 0;i < arr.length-1;i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main6(String[] args) {
        int [] arr = {1,2,3,4,7,5,6,8};
        boolean n = isUp(arr);
        System.out.println( n);
    }


    public static int binarySearch(int [] arr,int key) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right)/2;

            if(arr[mid] < key) {
                left = mid+1;
            }else if(arr[mid] > key) {
                right = mid-1;
            }else {
                return mid;
            }



        }
        return -1;
    }

    public static void main5(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
       int ret =  binarySearch(arr, 3);
        System.out.println(ret);
    }





    public static void main1(String[] args) {
        Person person = new Person();
        person.eat();
        person.sleep();


    }

}
