/**
 * @program:20200422
 * @description
 * @author: 张林
 * @creat:2020-04-25 10:37
 **/
public class TestDemoD {
    public static void creat(Node headA,Node headB) {
        headA.next = headB.next.next;
    }
    public static Node getIntersectionNode(Node headA,Node headB) {
        //1，求长度,走差值步；
        int lenA = 0;
        int lenB = 0;
        Node  pl = headA;
        Node ps = headB;
        while(pl != null) {
            lenA ++ ;
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
        //pl一定是指向最长的
        for(int i = 0;i < len;i++) {
            pl = pl.next;
        }
        //此时pl和ps在同一个起跑线上了
        while(ps != pl ) {
         ps = ps.next;
         pl = pl.next;
        }
        if( pl  != null) {
            return pl;
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayListB ArrayListB2 = new ArrayListB();

        ArrayListB2.addFirst(11);
        ArrayListB2.addFirst(23);

        ArrayListB2.addFirst(1);
        ArrayListB2.addFirst(2);
        ArrayListB2.addFirst(3);
        ArrayListB2.addFirst(4);
        ArrayListB2.addFirst(5);
        ArrayListB2.display();
        System.out.println();
        System.out.println("#########");

        ArrayListB ArrayListB3 = new ArrayListB();
        ArrayListB3.addFirst(9);

        ArrayListB3.addFirst(1);
        ArrayListB3.addFirst(2);
        ArrayListB3.addFirst(3);
        ArrayListB3.addFirst(4);
        ArrayListB3.addFirst(5);
        ArrayListB3.display();
        System.out.println();
         creat(ArrayListB2.head,ArrayListB3.head);
       Node ret =  getIntersectionNode(ArrayListB2.head,ArrayListB3.head);

        System.out.println(ret.data);
    }
}
