/**
 * @author: 张林
 * @Date :Created in 1:59 am 14/07/2020
 */
public class chongrulianxi {
    public static void indexSort(int[] arr) {
        int tmp = arr[0];
        for(int i = 1;i < arr.length;i++) {//第一个已经有序，故从第二个开始
            tmp = arr[i];
            int j;
            for(j = i-1;j >= 0;j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }

    public static void BsInsertSort(int[] arr) {
        for(int i = 1; i< arr.length;i++) {
            int ret = arr[i];
            int left = 0;
            int right = i;
            while(left < right) {
                int mid = (left + right)/2;
                if(ret >= arr[mid]) {
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }

            for(int j = i;j > left;j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = ret;
        }
    }

    public static void heapSort(int[] array) {
        create(array);
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end--);
        }
    }

    public static void create(int[] array) {
         int len = array.length;
         for(int i =(array.length-1-1)/2;i >= 0;i--) {
             adjustDown(array,i,len);
         }
    }

    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len) {
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }



    public static void quickSort(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        quick(arr,left,right);
    }
    public static void quick(int[] arr,int left,int right) {
        if(left >= right) {
            return ;
        }
        int index = partition(arr,left,right);
        quick(arr,left,index-1);
        quick(arr,index+1,right);
    }

    public static int partition(int[] arr,int low ,int high) {
        int tmp = arr[low];
        while(low < high) {
            while( low < high && arr[high] > tmp) {
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] < tmp)  {
                low++;

            }
            arr[high] = arr[low];
        }

        arr[low] = tmp;
        return low;
    }
}
