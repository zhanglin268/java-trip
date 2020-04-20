/**
 * @program:20200420
 * @description
 * @author: 张林
 * @creat:2020-04-20 18:29
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        MylinkedList MylinkedList1 = new MylinkedList();
        MylinkedList1.addFirst(14);
        MylinkedList1.addFirst(13);
        MylinkedList1.addFirst(12);
         MylinkedList1.addFirst(127);
        MylinkedList1.display();
        MylinkedList1.addLast(19);
        System.out.println();
        MylinkedList1.display();
        System.out.println();
        System.out.println(MylinkedList1.contains(12));
        System.out.println(MylinkedList1.listSize());
        MylinkedList1.addIndex(3,32);
        MylinkedList1.display();


    }
}
