import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

/**
 * @author: 张林
 * @Date :Created in 11:28 pm 9/08/2020
 */
public class Demo {

    //快速排序 （重要）

    /**
     *
     * 时间复杂度 ：
     * nlogn
     * 空间复杂度
     * 最好情况：logn    最坏情况：On
     * 稳定性： 不稳定
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static int partition(int[] array,int low,int high) {
        int tmp = array[low];
        while(low < high) {
            while(low < high && array[high] >= tmp) {//一定取等
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;//相遇的地方赋值tmp
        return low;
    }
    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return ;
        }
        int mid = partition(array,left,right);
        quick(array,left,mid-1);
        quick(array,mid+1,right);

    }
    public static void quickSort(int[] array) {

        quick(array,0,array.length-1);
    }
    ////////////////////////
    //快速排序的优化
    public static int partition1(int[] array,int low,int high) {
        int tmp = array[low];
        while(low < high) {
            while(low < high && array[high] >= tmp ) {
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low] <= tmp ) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;//相遇的地方赋值tmp
        return low;



    }
    public static void insert_sor(int[] array,int start,int end) {
        int tmp = 0;
        for(int i = 0;i <= end;i++) {
            tmp = array[i];
            int j;
            for(j= i-1;j >= start;j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }



    //方法二：三数取中法
    public static void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    public static void three_num_mid(int[] array,int left,int right) {
        //array[mid] <= array[left] <= array[right]
        int mid = (left+right)/2;
        int tmp = 0;
        if(array[mid] > array[left]) {
           /* tmp = array[mid];
            array[mid] = array[left];
            array[right] = tmp;*/
            swap(array[mid],array[left]);
        }
        if(array[mid] > array[right]) {

            swap(array[mid],array[right]);

        }
        if(array[left] > array[right]) {
           /* tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;*/
            swap(array[left],array[right]);
        }
    }
    public static void quick1(int[] array,int left,int right) {
        if(left >= right) {
            return ;
        }
        //   优化方法一：当元素个数小于一定的个数时 用直接排序
        if(right-left+1 <= 100) {
            insert_sor(array,left,right);
            return ;
        }
        three_num_mid(array,left,right);

        int mid =  partition1(array,left,right);
        quick1(array,left,mid-1);
        quick1(array,mid+1,right);

    }
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);

    }
    //////////////////////////////////

    //非递归实现快速排序
    public static void quickStack(int[] array) {
        Stack<Integer> stack = stack = new Stack<>();
        int left = 0;
        int right = array.length-1;
        int par = partition(array,left,right);
        if(par > left +1) {
            stack.push(left);
            stack.push(par-1);

        }
        if(par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }
        while(!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = partition(array,left,right);
            if(par > left +1) {
                stack.push(left);
                stack.push(par-1);

            }
            if(par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }
        }
    }

    //归并排序

    /**
     * 时间复杂度 nlogn
     * 空间复杂度On
     * 稳定性:稳定

     * @param array
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] array,int low,int mid,int high) {
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] ret = new int[len];
        int i = 0;//用来表示ret数组的下标
        while(s1 <= mid && s2 <= high) {
            if(array[s1] <= array[s2]) {
                ret[i++] = array[s1++];

            }else {
                ret[i++] = array[s2++];
            }
        }
        while(s1 <= mid) {
            ret[i++] = array[s1++];

        }
        while(s2 <= high) {
            ret[i++] = array[s2++];
        }
        for(int j = 0;j < ret.length;j++) {
            array[j+low] = ret[j];
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) {
            return ;
        }
        int mid = (low + high)/2;
        //mid = (low + high) >>> 1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }
    //归并排序的非递归实现
    public static void mergeSort1(int[] array) {
        for(int gap = 1;gap < array.length;gap*=2) {
            mergeNor(array,gap);
        }
    }
    public static void mergeNor(int[] array,int gap) {
        int[] ret = new int[array.length];
        int k = 0;//ret的下标
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < array.length ? s2+gap-1 :  array.length-1;

        //1、肯定是有两个归并段的
        while (s2 < array.length) {
            //2、对应的s1位置和s2位置进行比较
            while(s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    ret[k++] = array[s1];
                    s1++;
                }else{
                    ret[k++] = array[s2];
                    s2++;
                }
            }


            //3、上述第2步在比较的过程当中，肯定会有一个下标先走完一个归并段
            //4、判断是谁没走完，把剩下的数据拷贝到结果数组当中
            while(s1 <= e1) {
                ret[k++] = array[s1++];

            }
            while(s2 <= e2) {
                ret[k++] = array[s2++];

            }
            //5、接着确定新的s1,e1,s2,e2
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 < array.length ? s2+gap-1 :  array.length-1;
        }
        while(s1 <= array.length-1) {
            ret[k++] = array[s1++];
        }
        for(int i = 0;i < ret.length;i++) {
            array[i] = ret[i];
        }

    }





    //冒泡排序
    public static void  bubbleSort(int[] array) {
        for(int i = 0;i < array.length-1;i++) {
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    //优化冒泡排序
    public static void  bubbleSort1(int[] array) {

        for(int i = 0;i < array.length-1;i++) {
            boolean flg = true;
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = false;
                }
            }
            if(flg) {
                return;
            }
        }
    }
    //堆排序
    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*root+1;
        while(child < len) {
            //判断是否有左右孩子
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*child+1;

            }else {
                break;
            }
        }
    }
    public static void creatHeap(int[] array) {
        int len = array.length;
        for(int i = (len-1-1) / 2;i >= 0;i--) {
            adjustDown(array,i,len);
        }
    }
    public static void heapSort(int[] array) {
        creatHeap(array);
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end--);
        }

    }
    //希尔排序
    public static void shell(int[] array,int gap) {
        int tmp = 0;
        for(int i = gap;i < array.length;i++){
            tmp = array[i];
            int j ;
            for( j = i-gap;j >= 0;j-=gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static  void  shellSort(int[] array) {

        //int[] drr = {3,2,1};
        int[] drr = {5};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }
    //选择排序  (老师写法)每次选择一个最小的放在前面或者最大的放在后面
    public static void selectSort(int[] array) {

        for(int i = 0;i < array.length;i++) {

            for(int j = i+1;j < array.length;j++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }
    }
    //自己的想法；
    public static void selectSort1(int[] array) {
        int min = 0;
        for(int i = 0;i < array.length;i++) {
            min = i;
            int j;
            for(j = i + 1;j < array.length;j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;

        }
    }



    //直接排序下的折半排序
    public static void BsInserSort(int[] array) {
        for(int i = 1;i < array.length;i++) {
            int ret = array[i];
            int left = 0;
            int right = i;
            while(left < right) {
                int mid = (left + right)/2;
                if(ret >= array[mid]) {
                    left = mid+1 ;
                }else {
                    right = mid ;
                }

            }
            for(int j = i;j > left;j--) {
                array[j] = array[j-1];
            }
            array[left] = ret;
        }
    }

    //直接插入排序
    public static void inserSort(int [] array) {
        int tmp = array[0];
        for(int i = 1;i < array.length;i++) {
            tmp = array[i];
            int j;
            for(j = i-1;j >= 0;j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;

        }
    }

    public static void main2(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for(int i = 0;i < array.length;i++) {
            array[i]= random.nextInt(100000);
        }
        long start = System.currentTimeMillis();
        quickSort1(array);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>()
        int [] array = {10,20,8,25,35,6,18,30,5,15,28};

        System.out.println(Arrays.toString(array));
        //shellSort(array);
        //bubbleSort1(array);
        //selectSort(array);
        //selectSort1(array);
        //BsInserSort(array);
        //quickSort(array);
        //shellSort(array);
        // quickStack(array);
        mergeSort1(array);
        System.out.println(Arrays.toString(array));

        /*System.out.println("############");
        selectSort1(array);
        System.out.println(Arrays.toString(array));
        BsInserSort(array);
        System.out.println(Arrays.toString(array));*/


        //inserSort(array);
        //System.out.println(Arrays.toString(array));
        //inserSort(array);
        //System.out.println("############");
        //System.out.println(Arrays.toString(array));
    }



}
