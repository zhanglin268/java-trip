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
    //尾插法
    public void addList(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return ;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;//指向下一个节点
        }
        cur.next = node;
    }
    //是否包含某个节点
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
    //元素个数
    public int listSize() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //任意位置加一个数
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
    //查找某个数
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
    //除去某个数
    public void remove(int key) {
        if(this.head == null) {
            return ;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prve = searchPrve(key);
        if(prve == null) {
            System.out.println("没有你要删除的值");
            return ;
        }
        Node del = prve.next;
        prve.next = del.next;
    }
    //查找为prve的节点
    private Node searchPrve(int key) {
        Node prve = this.head;
        while(prve.next != null) {
            if(prve.next.data == key) {
                return prve;
            }else {
                prve = prve.next;
            }
        }
        return null;
    }
    //删除所有的为key的节点
    public void removeAllKey(int key) {
        Node prve = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prve.next = cur.next;
                cur = cur.next;
            } else {
                prve = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }


    }
    //反转整个链表
    public Node backList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        Node curNext = null;
        while(cur != null) {
            curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display2(Node newHead) {
        Node cur =newHead;

        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;//next里面放的是下一个节点的地址，走完一个之后 ，找到next地址里面对应的node赋值为新的cur
        }
    }

    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
