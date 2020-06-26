import java.util.Arrays;

/**
 * @program:20200513
 * @description
 * @author: 张林
 * @creat:2020-05-13 18:34
 **/
public class MyStack {
    public int [] elem;
    public int top;
    public int size = 0;

    public MyStack() {
        this.elem = new int[10];
        this.top = 0;
    }
    public void push(int data){
        if(isFull()) {
            //System.out.println("满了");
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        elem[top++] = data;



    }
    public boolean isFull() {

            return top == this.elem.length;

    }

}
