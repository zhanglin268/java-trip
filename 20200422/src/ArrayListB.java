/**
 * @program:20200422
 * @description
 * @author: 张林
 * @creat:2020-04-22 20:00
 **/


class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next  = null;
    }
}
public class ArrayListB {
    public Node head;//保存单链表的头
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return ;
        }
        node.next = this.head;  //把当前头节点的地址给要插入的节点的next里面
        this.head = node;//把当前节点的头给node
    }
    public void display() {
        Node cur = this.head;

        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;//next里面放的是下一个节点的地址，走完一个之后 ，找到next地址里面对应的node赋值为新的cur
        }
    }
    public void addList(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return ;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    public  boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int listSize() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void addIndex(int index,int data) {
        if(index == 0) {
            addList( data);
        }
        if(index == listSize()) {
            addList( data);
        }
        Node cur = search(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;


    }
    public Node search( int index) {
        if(index < 0 || index > this.listSize()) {
            //System.out.println("没有这个位置");
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        for(int i = 0;i < index - 1;i++) {
            cur = cur.next;
        }
    return cur;
    }





}
