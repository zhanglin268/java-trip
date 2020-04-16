import java.util.Arrays;

/**
 * @program:20200415
 * @description
 * @author: 张林
 * @creat:2020-04-16 13:45
 **/

/*class Person {
    public String name;
    public int age;
}
class Test{


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }*/
public class TestDemo2 {


    public static void main(String[] args) {
        int [][] arr = {{1,3,4,5},{6,7,8,9}};
        for(int i = 0;i < arr.length;i++) {
            for(int j =0; j < arr[0].length;j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*class TestDemo {
        public static int count;

    }
    public class Main{
        public static void main (String[] args) {
            TestDemo t1 = new TestDemo();
            t1.a++;
            TestDemo.count++;
            System.out.println(t1.a);
            System.out.println(TestDemo.count);
            System.out.println("###############");
            TestDemo t2 = new TestDemo();
            t2.a++;
            TestDemo.count++;
            System.out.println(t2.a);
            System.out.println(TestDemo.count);
        }
    }
    class TestDemo {
        public int a;
        public static int count;
        publid static void change() {
            count= 100;
            //a = 10;error不可以访问非静态数据
        }
    }
    public class Main {
        public static void main(String[] args) {
            TestDemo.change();
            System.out.printlng(TestDemo.count);
        }
    }
    class Perosng {
        public int age;
        public String name;//实例变量
        public String sex;
        public final int SIZE = 10;
        public static final int COUNT = 99;
        public void eat() {
            int a = 10;
            System.out.println("eat()!");

        }
        publci void Sleep() {
            System.out.println("sleep()!");

        }
        public static void staticTest() {
            System.out.println("StaticTest()");

        }
    }
    public class Main {
        public static void main(String[] args) {
            Person person = new Person();
            Systme.out.println(person.age);
            System.out.println(perosn.name);
            System.out.println(Person.count);
            System.out.println(Person.COUNT);
            perosn.eat();
            perosn.sleep();

        }
    }*/











    /*public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);



    }*/
    public static String transform(int [] arr) {
        String ret = "[";
        for(int i = 0;i < arr.length;i++) {
            ret = ret + arr[i];
            if(i != arr.length -1) {
                ret = ret + ",";
            }


        }
        ret = ret + "]";
        return ret;
    }

    public static void main4(String[] args) {
        int [] arr = {1,3,4,5,6};

        System.out.println( transform(arr));
    }

    // 方法一
    public static void copyNum(int [] arr) {
        int [] ret = new int [arr.length];
        for(int i = 0;i < arr.length;i++) {
            ret[i] = arr[i];
        }
        System.out.println(Arrays.toString( ret));
    }

    //方法二
    public static void copyNumOne(int [] arr) {
        int [] ret1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret1));
    }

    //方法三

    public static void copyNumTwo(int [] arr) {
        int [] ret2 = new int[arr.length];
        System.arraycopy(arr,0,ret2,0,arr.length);
        System.out.println(Arrays.toString(ret2));
    }
    public static void main7(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        copyNum(arr);
        copyNumOne(arr);
        copyNumTwo(arr);
        copyNumThree(arr);
    }
    // 方法四

    public static void copyNumThree(int [] arr) {
        int [] ret3 = arr.clone();
        System.out.println(Arrays.toString(ret3));
    }
    public static int binarySearch(int [] arr,int key) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            int mid = (left + right) / 2;

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

    public static void main6(String[] args) {
        int [] arr = {1,3,5,6,7,8,9,10,11,24,67};

        System.out.println(  binarySearch(arr,8));
    }
    public static boolean isUp(int [] arr) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }

        }
        return true;
    }
    public static void main3(String[] args) {
        int [] arr = {1,3,4,2,5,6,2,7,5} ;
        boolean ret = isUp(arr);
        System.out.println(ret);
    }


    public static void bubble(int [] arr) {

        for(int i = 0 ;i < arr.length-1;i++) {
            boolean flag = true;
            for(int j = 0;j < arr.length- 1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }

            }
            if(flag == true) {
                break;
            }

        }
    }

    public static void main1(String[] args) {
        int [] arr = {1,6,2,4,7,5,3,8,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
