/**
 * @program:20200423
 * @description
 * @author: 张林
 * @creat:2020-04-23 16:42
 **/
public class ArrayStack {
    public static void main(String[] args) {
    Stack stack = new Stack(10);
    stack.push(0);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.list();

    }
}
//定义一个stack表示栈
class Stack {
    public int maxsize;//栈的最大容量
    public int [] stack;//数组模拟栈
    public int top = -1;

    public Stack(int maxsize) {
    this.maxsize = maxsize;
    stack = new int [this.maxsize];
    }

    public boolean isFull() {
        return top == maxsize - 1;
    }
    //栈空
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int value) {
        //判断是否栈满
        if(isFull()) {
            System.out.println("栈满");
            return ;
        }
        top++;
        stack[top] = value;
    }
    //出栈
    public int pop() {
        //判断是否空
        if(isFull()) {
            //抛出异常
            throw new RuntimeException("栈空，没有数据");
        }
        int value = stack[top];
        top--;
        return value;
    }
    //显示栈
    public void list() {

        if(isEmpty()) {
            System.out.println("栈空，没有数据");
        }
        for(int i = top;i >= 0;i--) {
            System.out.print(stack[top] +" ");
            top--;
        }

    }

}
