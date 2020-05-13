/**
 * @program:20200513
 * @description
 * @author: 张林
 * @creat:2020-05-13 19:34
 **/
class Node {
    public int data;
    public Node next;
    public int size;

    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public Node fornt;//头
    public Node rear;//尾巴

    public boolean offer(int val) {

        Node node = new Node(val);
        if(this.rear == null) {
            this.fornt = node;
            this.rear = node;

        }else {
            this.rear.next = node;
            this.rear = this.rear.next;
        }
        return true;
    }
    public int poll() {

    }
    public boolean isEmpty() {

    }

}
