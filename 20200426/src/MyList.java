/**
 * @program:20200426
 * @description
 * @author: 张林
 * @creat:2020-04-26 10:07
 **/
class Node {
    public int data;
    public Node next;
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class MyList {
    private Node head = null;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;

        }
        node.next = head;
        head = node;
    }
    //尾插法
    public void addlast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //打印链表
    public void display(){
        Node cur = this.head;
        if(cur == null) {
            System.out.println("链表为空");
        }
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
    public Node isCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while(fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast;
    }

   /* public Node  isCycle1() {
        Node fast = this.head;
        Node slow = this.head;
        if(fast == null || fast.next == null) {
            return null;
        }
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            break;
        }
        slow = this.head;
        while(slow != fast) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
*/
    public Node gerIntersextionNode(Node headA,Node headB) {
        //求链表的长度
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //此时pl一定指向最长的
        for(int i = 0;i < len ;i++) {
            pl = pl.next;
        }
        //此时pl和ps在同一个气跑线上
        while(pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        if(ps != null) {
            return ps;
        }
        return null;

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


//表的回文结构
   /* public boolean chpalindrome() {
        //如果为空就直接返回false
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        //找到单链表的中间节点
        while(fast != null || fast.next != null) {
            fast  = fast.next.next;
            slow = slow.next;

        }
        //反转后半部分
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        slow = this.head;
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;

    }*/

    //表的回文结构
    public boolean chpalindrome1() {

        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null || fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半部分
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;

        }
        //一个往前走一个往后走
        while(this.head != slow){
            if(this.head.data != slow.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
    public Node del(){
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tmp = newHead;

        while(cur != null ) {
            if(cur.next != null && cur.data == cur.next.data) {
                while(cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;

            }
        }
        tmp.next = null;
        return newHead.next;
    }
    //删除重复的数字
    public Node partiton(Node phead,int x) {
        Node small = new Node(-1);
        Node big = new Node(-1);
        Node cur = phead;
        if(cur == null) {
            return null;
        }
        while(cur != null) {
            if (cur.data < x) {
                small.next = cur;
                cur = cur.next;
                cur = cur.next;
            } else {
                big.next = cur;
                big = big.next;
                cur = cur.next;

            }
        }
        small.next = big.next;
        big.next = null;
        return small.next;
    }
    public Node twoList(Node headA,Node headB) {
        Node newHead = new Node(-1);
        Node cur = headA;
        Node tmp = headB;
        while(cur != null && tmp != null) {
            if (cur.data <= tmp.data) {
                newHead.next = cur;
                newHead = newHead.next;
                cur = cur.next;
            } else {
                newHead.next = tmp;
                newHead = newHead.next;
                tmp = tmp.next;
            }
        }
        newHead.next = cur == null ? tmp : cur;
        return newHead.next;
    }
    public Node findkthToTail (int k) {
        Node cur = this.head;
        Node fast = this.head;
        Node slow = this.head;
        if(this.head == null) {
            return null;
        }
        if( k <= 0 || k > listSize()) {
            System.out.println("k不合法");
        }

        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
            }
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
//返回中间节点
    public Node middleNode() {
        if(this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //反转整个链表
    public Node turnBackList() {
        Node cur = this.head;
        Node tmp = null;
        Node newHead = null;
        Node curNext = null;
        while(cur != null) {
            curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }else {
                cur.next = tmp;
                tmp = cur;
                cur = curNext;
            }
        }
        return newHead;


    }
//删除所有值等于val的节点
    public void removeAllKey(int val) {
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == val) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == val) {
            this.head = this.head.next;
        }
    }



}
