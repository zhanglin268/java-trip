/**
 * @author: 张林
 * @Date :Created in 11:10 pm 11/08/2020
 */
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next  = null;
    }
}

public class Demo2 {


    public Node head;//保存单链表的头

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;  //把当前头节点的地址给要插入的节点的next里面
        this.head = node;//把当前节点的头给node
    }

    public void display() {
        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;//next里面放的是下一个节点的地址，走完一个之后 ，找到next地址里面对应的node赋值为新的cur
        }
    }

    //尾插法
    public void addList(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;//指向下一个节点
        }
        cur.next = node;
    }

    //是否包含某个节点
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
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
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //任意位置加一个数
    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
        }
        if (index == listSize()) {
            addList(data);
        }
        Node cur = search(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;


    }

    //查找某个数
    public Node search(int index) {
        if (index < 0 || index > this.listSize()) {
            //System.out.println("没有这个位置");
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //除去某个数
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prve = searchPrve(key);
        if (prve == null) {
            System.out.println("没有你要删除的值");
            return;
        }
        Node del = prve.next;
        prve.next = del.next;
    }

    //查找为prve的节点
    private Node searchPrve(int key) {
        Node prve = this.head;
        while (prve.next != null) {
            if (prve.next.data == key) {
                return prve;
            } else {
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
        while (cur != null) {
            curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(Node newHead) {
        Node cur = newHead;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;//next里面放的是下一个节点的地址，走完一个之后 ，找到next地址里面对应的node赋值为新的cur
        }
    }

    public Node middleNode1() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //找到倒数第K个值
    public Node FindKthToTail(int k) {
        if (this.head == null) {
            return null;
        }
        if (k <= 0 || k > listSize()) {
            System.out.println("k不合法");//判断是否合法
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node twoList(int x) {
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node sa = null;
        Node se = null;
        while (cur != null) {
            if (cur.data < x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (sa == null) {
                    sa = cur;
                    se = cur;
                } else {
                    se.next = cur;
                    se = se.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return sa;
        }
        be.next = sa;
        if (se != null) {
            se.next = null;
        }
        return bs;
    }

    //删除重复的节点
    public Node deletedDuplication() {

        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
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

//链表的回文结构

    public boolean chkPalindrome() {
        //如果为空就直接返回false
        if (this.head == null) {
            return false;
        }
//这是只有头结点自己肯定是回文结构
        if (this.head.next == null) {

            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        //找到单链表的中间节点
        while (fast != null || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转单链表的后半部分
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //开始一个从头走一个从后走
        while (slow != this.head) {
            if (slow.data != this.head.data) {
                return false;
            }
            if (this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }

    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //判断是否有环。有就返回环的入口
    public Node meet() {
        Node fast = this.head;
        Node slow = this.head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


    public Node getTwo(Node headA, Node headB) {
        Node newhead = new Node(-1);
        Node tmp = newhead;
        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                tmp.next = headA;
                headA = head.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
            }
            tmp = tmp.next;

        }
        tmp.next = headA == null ? headB : headA;
        return newhead.next;
    }

    public Node middleNode() {
        if (this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }





    /*
    public void remove(int key) {
    if(this.head == null) {
        return ;
    }
    if(this.head.data == key) {
     this.head = this.head.next;
     return ;
    }
    Node prve = searchKey(key) ;
    if(prve == null) {
        System.out.println("没有你要找的节点");
    }
    Node del = prve.next;
    prve.next = del.next;
    }


    //找key的前驱
    public Node searchKey (int key) {
    Node prve = this.head;
    if(prve.next.data == key) {
        return prve;
    }else {
        prve = prve.next;
    }
    return null;
    }*/
   /* public void removeKey(int key) {
        Node prve = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prve.next = cur.next;
                cur = cur.next;
            }
            else {

                prve = cur;
            }
            cur = cur.next;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
*/

//合并两个有序链表  合并之后也是有序的

    /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode pre = newHead;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;

            }else {
                pre.next = l2;
                l2 = l2.next;

            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return newHead.next;

    }*/



   /* 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

    给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
*/
   /* public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode cur = pHead;
        ListNode s = small;
        ListNode b = big;
        if(cur == null) {
            return null;
        }

        while(cur != null) {
            if(cur.val < x) {
                s.next = cur;
                s = s.next;
            } else {
                b.next = cur;
                b = b.next;
            }
            cur = cur.next;
        }
        b.next = null;
        s.next = big.next;
        return small.next;
    }
*/

}

