package zhang;

import java.util.Arrays;

/**
 * @author: 张林
 * @Date :Created in 10:51 am 12/08/2020
 */
public class maxHeap {
    public int[] heap;
    public int size = 0;
    public maxHeap() {
        heap = new int[10];
    }

    public void createHeap(int[] arr) {
        for(int i = 0;i < arr.length;i++) {
            this.heap[i] = arr[i];
            size++;
        }
        for(int i = (this.size-1-1)/2;i >= 0;i--) {
            adjustDown(i,size);
        }

    }
    public void adjustDown(int root ,int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len) {
            if((child+1) < len && this.heap[child] < this.heap[child+1]) {
                child++;
            }
            if(heap[child] > heap[parent]) {
                int tmp = heap[child];
                heap[child] = heap[parent];
                heap[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }

        }
    }
    public void show() {
        for(int i = 0; i< size;i++) {
            System.out.print(heap[i] +" ");
        }
    }
    public void push(int val) {
        if(isFull()){
            this.heap = Arrays.copyOf(this.heap,2*this.heap.length);
        }
        this.heap[this.size] = val;
        this.size++;
        adjustUp(this.size-1);
    }
    public boolean isFull() {
        return size == this.heap.length;
    }
    public void adjustUp(int child){
        int parent = (child-1)/2;
        while(child > 0) {
            if(this.heap[child] > this.heap[parent]) {
                int tmp = this.heap[child];
                this.heap[child]=this.heap[parent];
                this.heap[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
}
