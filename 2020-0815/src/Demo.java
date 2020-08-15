/**
 * @author: 张林
 * @Date :Created in 11:39 pm 15/08/2020
 */
public class Demo {
    public static void func(int[] arr) {
        int tmp = arr[0];
        for(int i = 1;i < arr.length;i++) {
            tmp = arr[i];
            int j;
            for(j = i-1;j>=0;j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];

                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    //选择排序
    public static void func(int[] arr) {
        for(int i = 0;i < arr.length;i++) {
            for(int j = i+1;j < arr.length;j++) {
                if(arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }


    //堆排序
    public static void func(int[] arr) {
        creatHeap(arr);
        int end = arr.length-1;

        whiile(end > 0) {
            int tmp = arr[0];
            arr[0] = arr[end];
            arr[end] = tmp;
            adjustDown(arr,0,end--);

        }
    }

    public static void creatHeap(int[] arr) {
        int len = arr.length;
        for(int i = (len-1-1)/2;i >= 0;i--) {
            adjustDown(len,i,arr);
        }
    }

    public static void func(int[] arr,int len,int root) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len) {
            if(child +1 < len && arr[child] < arr[child+1]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
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

    public static void func(int[] arr) {
        for(int i = 0; i< arr.length-1;i++) {
            boolean flg = true;
            for(int j = 0;j < arr.length-1-i;j++) {
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

    //快排
    public static void quickSort(int[] arr) {
        quick(arr,0,arr.length-1);

    }

    public static void quick(int[] arr,int left,int right) {
        if(left >= right) {
            return ;
        }
        int index = paratition(arr,left,right);

        quick(arr,left,index-1);
        quick(arr,index+1,right);

    }

    public static int paratition(int[] arr,int low,high) {
        int tmp = arr[low];
        while(low < high) {
            while(low < high && arr[high] >= tmp) {
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= tmp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;

    }
    public static void func()

//归并排序
    public statci void mergeSort(int[] arr) {
        merge(arr,0,arr.length);
    }
    public static void func(int[] arr,int low ,int high) {
        if(low >= high) {
            return ;
        }
        int mid = (low + high)/2;
        func(arr,low,mid);
        func(arr,mid+1,high);
        hhh(arr,low,mid,high);

    }
    public static void hhh(int[] arr,int low ,int mid,int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] tmp = new int[len];
        int i = 0;
        while(s1 <= mid && s2 <= high) {
            if(arr[s1] < arr[s2]) {
                tmp[i++] = arr[s1++];
            }else {
                tmp[i++] = arr[s2++];
            }
        }
        while(s1 <= mid) {
            tmp[i++] = arr[s1++];
        }
        while(s2 <= high) {
            tmp[i++] = arr[s2++];
        }
        for(int i = 0;i < tmp.length;i++) {
            arr[i+low] = tmp[i];
        }
    }



}
