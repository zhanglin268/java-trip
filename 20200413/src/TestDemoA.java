/**
 * @program:20200413
 * @description
 * @author: 张林
 * @creat:2020-04-13 18:28
 **/
public class TestDemoA {


    /**
     *
     * 汉诺塔问题
     * @param args
     */


    /**
     *
     * 数组 ；存放相同数据类型的集合，
     * @param args
     */


    public static void printArray(int [] arr) {
        for(int y:arr)  {
            System.out.print(y+" ");
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        printArray(array);
        int [] array2 = {10,20}
    }




    public static void main2(String[] args) {
        int [] array = {1,2,3,4} ;
        //int len = array.length;
        for(int i = 1;i <array.length;i++) {
            System.out.println(array[i] + " " );
        }


    }

    public static void main1(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        int [] array2 = new int [] {11,22,33,44};
        int [] array3 = new int[4];
        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 3;
        array3[3] = 4;

    }
}
