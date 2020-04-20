/**
 * @program:20200420
 * @description
 * @author: 张林
 * @creat:2020-04-20 18:56
 **/
class Node {
    public int data;//0
    public Node next;//null


    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class MylinkedList {
    public Node head;//保存单链表的头结点


    public void addFirst(int data ) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;

    }
    //打印单链表
    public void display() {

        Node cur = this.head;
        while(cur!=null) {

            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            return;
        }
        Node cur = this.head;
        while(cur.next!=null) {
             cur = cur.next;
         }
        cur.next = node;
    }
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;

    }
    public int listSize() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }


    public void addIndex(int index,int data) {

    if(index == 0) {
        addFirst( data );
    }
    if(index == listSize()) {
        addLast( data);
    }
        Node node = new Node(data);
        Node cur= searchIndex( index);
        node.next = cur.next;
        cur.next = node;

    }
    private Node searchIndex(int index) {
        if(index < 0 || index >this.listSize()) {
            throw new  RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        while(index -1 != 0) {
            cur = cur.next;
            index--;
        }

        return cur;

    }





}
