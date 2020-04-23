/**
 * @program:20200423
 * @description
 * @author: 张林
 * @creat:2020-04-23 10:25
 **/

public class TestDemo {
    public static void main(String[] args) {

        DoubleList DoubleList1 = new DoubleList();
        DoubleList1.addList(1);
        DoubleList1.addList(2);
        DoubleList1.addList(3);
        DoubleList1.addList(4);
        DoubleList1.addList(5);
        DoubleList1.addList(6);
        DoubleList1.list();
        System.out.println();
        DoubleList1.delete(6);
        DoubleList1.list();

    }
}
//创建一个类
class DoubleNode {
    public int data;
    public DoubleNode next;
    public DoubleNode pre;


    public DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.pre = null;
    }

}
class DoubleList {
    private DoubleNode head  = new DoubleNode(0);//创建对象并初始化
    //返回头结点
    public DoubleNode getHead() {
        return head;
    }
    //遍历双向链表的方法
    public void list() {
        //判断是否为空
        if(head.next == null) {
            System.out.println("链表为空");
            return ;
        }
        DoubleNode tmp = head.next;
        while(tmp != null) {
            //判断是否到链表最后

            System.out.print(tmp.data + " ");
            tmp = tmp.next;//将tmp后移
        }


    }


    public void addList(int data){//添加到尾部
        DoubleNode doubleNode = new DoubleNode(data);
        DoubleNode tmp = head;
        //如果tmp不为空的话 就不进去if语句
        while (tmp.next != null) {
            //判断是否到链表最后
            tmp = tmp.next;//将tmp后移
        }//当退出了while循环时，tmp就指向了最后一个节点

        //形成一个双向链表
        tmp.next = doubleNode;
        doubleNode.pre = tmp;


    }

    //更新某个节点
    public void updata(int key) {
        if(head.next == null) {
            throw new RuntimeException("链表为空");

        }
        DoubleNode tmp = head.next;
        boolean flg = false;
        while(true) {
            if(tmp == null) {

              break;
            }
            if(tmp.data == key) {
                flg = true;
                break;
            }//已经遍历完
            tmp = tmp.next;

        }
        if(flg) {
            tmp.data = key;
        }else {
            System.out.println("没有找到");
        }
    }
    public void delete(int data){
        if(head.next == null) {
            System.out.println("链表为空");
            return ;
        }
        DoubleNode cur = head.next;
        boolean flg = false;
        while(true) {
            if(cur == null) {
                System.out.println("遍历完了，");
                break;
            }
            if(cur.data == data) {
                flg = true;
                break;
            }
            cur = cur.next;

        }
        if(flg) {
            System.out.println("找到了");
            cur.pre.next = cur.next;
            if(cur.next != null) {
                cur.next.pre = cur.pre;
            }

        }
    }
}
