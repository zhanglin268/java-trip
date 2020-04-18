/**
 * @program:20200418
 * @description
 * @author: 张林
 * @creat:2020-04-18 19:58
 **/
import java.util.*;
public class TestDemoTwo {
    public static void getBack(int [] arr) {
      int left = 0 ;
      int right = arr.length -1;
      while(left < right) {
          while (left < right && arr[left] % 2 == 0) {
              left++;
          }
          while (left < right && arr[right] % 2 != 0) {
              right--;
          }
          int tmp = arr[left];
          arr[left] = arr[right];
          arr[right] = tmp;
      }


    }

    public static void swap(int [] arr,int [] arr1) {
       int tmp = 0;
       for(int i = 0;i < arr.length;i++) {
           tmp = arr[i];
           arr[i] = arr1[i];
           arr1[i] = tmp;
       }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr1 = {6,7,8,9,10};
        swap(arr,arr1);
        System.out.print("arr=");
        System.out.println(Arrays.toString(arr));
        System.out.print("arr1");
        System.out.println(Arrays.toString(arr1));
    }

    public static void main1(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        getBack(arr);
        System.out.println(Arrays.toString(arr));
    }
}
    /*long factorial(int N) {
        return N < 2 ? N : factorial(N-1) * N;
    }
*/