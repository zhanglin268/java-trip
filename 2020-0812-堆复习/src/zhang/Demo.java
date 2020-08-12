package zhang;

/**
 * @author: 张林
 * @Date :Created in 11:26 am 12/08/2020
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {78,34,55,26,87,65,36,17,68,88};
        maxHeap max = new maxHeap();
        max.createHeap(arr);

        max.push(100);
        max.show();
    }
}
