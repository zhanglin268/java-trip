package com.lin.demo;

import java.util.Arrays;

/**
 * @program:20200522
 * @description
 * @author: 张林
 * @creat:2020-05-22 18:26
 **/
//排序是五月二十一号上的课
public class TestDemo {

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
    public static void quick1(int[] array,int left,int right) {
        if(left > right) {
            return ;
        }
        int mid =  partition1(array,left,right);
        quick1(array,left,mid-1);
        quick1(array,mid+1,right);

    }
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);

    }
    //////////////////////////////////




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
        boolean flg = false;
        for(int i = 0;i < array.length-1;i++) {
            flg = false;
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
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

        int[] drr = {3,2,1};
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
    public static void main(String[] args) {
        int [] array = {10,3,7,5,1,9,11,15,54,78,24,48,59,8,77};

        System.out.println(Arrays.toString(array));
        //shellSort(array);
        //bubbleSort1(array);
        //selectSort(array);
        //selectSort1(array);
        //BsInserSort(array);
        quickSort(array);

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
