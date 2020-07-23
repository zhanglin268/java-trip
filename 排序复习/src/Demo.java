import java.util.Arrays;

/**
 * @author: 张林
 * @Date :Created in 1:51 am 14/07/2020
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = {7,5,12,6,4};
        //insertSort(arr);
        //bubbleSort1(arr);
        //heapSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void main4(String[] args) {
        int[] arr = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr = {1,3,9,2,7,4,14,11,68,45,26};
        //indexSort(arr);
       // System.out.println(Arrays.toString(arr));

        insertSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    //直接插入排序
    public static void indexSort(int[] arr) {
        int tmp = arr[0];
        for(int i = 1;i < arr.length;i++) {
            tmp = arr[i];
            int j;
            for( j = i-1;j >= 0;j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }

            }
            arr[j+1] = tmp;
        }
    }
    //直接插入排序
    public static void insertSort(int[] arr) {
        int tmp = arr[0];
        for(int i = 1;i < arr.length;i++) {
            tmp = arr[i];
            int j;
            for( j = i-1;j >= 0;j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }


    //直接插入排序下的折半查找
    public static void BsInsertSort(int[] arr) {
        for(int i = 1;i < arr.length;i++) {
            int ret = arr[i];
            int left = 0;
            int right = i;
            while(left < right) {
                int mid = (left + right)/2;
                if(arr[mid] <= ret) {
                    left = mid+1;
                }else {
                    right = mid;//考虑到当在边界时，故不能-1；
                }
            }
            for(int j = i;j >left;j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = ret;
        }
    }


    //希尔排序
    public static void shell(int[] arr,int gap) {
        int ret = 0;
        for(int i = gap;i < arr.length;i++) {
            ret = arr[i];
            int j;
            for(j = i-gap;j >= 0;j -= gap) {
                if(arr[j] > ret) {
                    arr[j+gap] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+gap] = ret;
        }
    }

    public static void shellSort(int[] arr) {
        int[] dir = {5,3,1};
        for(int i = 0;i < dir.length;i++) {
            shell(arr,dir[i]);
        }

    }

    //选择排序
    public static void selectSort(int[]  arr) {
        for(int i = 0;i < arr.length;i++) {
            for(int j=i+1;j < arr.length;j++) {
                if(arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for(int i = 0;i < arr.length-1;i++) {
            for(int j = 0; i < arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


    //优化后的冒泡排序
    public static void bubbleSort1(int[] arr) {
        boolean flg = true;
        for(int i = 0;i < arr.length-1;i++) {

            for(int j = 0;j < arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = false;
                }
            }
            if(flg) {
                break;
            }
        }
    }


    //堆排序
    public static void heapSort(int[] arr) {
        createHeap(arr);//创建堆
        int end = arr.length-1;
        while(end>0) {
            int tmp = arr[end];
            arr[end] = arr[0];
            arr[0] = tmp;
            adjustDown(arr,0,end--);
        }

    }

    public static void createHeap(int[] arr) {
        int len = arr.length;
        for(int i = (len-1-1)/2;i >= 0;i--) {
            adjustDown(arr,i,len);

        }
    }

    public static void adjustDown(int[] arr,int root,int len) {
        int parent = root;
        int child = 2*parent +1;
        while(child < len){
            if((child +1 < len) && (arr[child] < arr[child+1]) ) {
                child++;
            }
            if(arr[parent] < arr[child]) {
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }
        //快速排序
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        int index = partition(array,left,right);
        quick(array,left,index-1);
        quick(array,index+1,right);
    }
    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while(low < high) {
            while(low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];

        }

        array[low] = tmp;
        return low;
    }


public static void mergeSort(int[] array) {
        mergesortInt(array,0,array.length-1);
}
public static void mergesortInt(int[] array,int low,int high) {
        if(low >= high) {
            return ;
        }
        int mid = (low + high)/2;
        mergesortInt(array,low,mid+1);
        mergesortInt(array,mid+1,high);

}



}


