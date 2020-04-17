import java.util.Arrays;

/**
 * @program:20200417
 * @description
 * @author: 张林
 * @creat:2020-04-17 14:17
 **/
public class TestDemo
{

    //不规则的二维数组
    public static void main(String[] args) {
        int [][] arr4 = new int [2][];
        arr4[0] = new int []{1,3,4,5,6};

        arr4[1] = new int []{2,3,4,5,3,6};
        for(int i = 0;i < arr4.length;i++) {
            for(int j = 0;j < arr4[i].length;j++) {
                System.out.print(arr4[i][j] + " ");
            }
        }
        System.out.println();
        for(int [] tmp :arr4) {
            for(int x:tmp) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr4));


    }
    public static void main3(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6}};
        //System.out.println(Arrays.deepToString(arr));
        for(int[] tmp:arr) {
            for(int x :tmp) {
                System.out.print(x + " ");
            }
        }
    }



    public static void main2(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6}};
        for(int i = 0;i < arr.length;i ++) {
            for(int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
    public static void main1(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6}};
        int [][] arr1 = new int [][]{{7,8,9},{10,11,12}};
        int [][] arr2 = new int [2][3];
       // arr2[0][] = {2,4,6};

    }

}
