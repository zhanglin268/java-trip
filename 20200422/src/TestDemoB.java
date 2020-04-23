/**
 * @program:20200422
 * @description
 * @author: 张林
 * @creat:2020-04-22 20:00
 **/
public class TestDemoB {
    public static void main(String[] args) {
        ArrayListB ArrayListB1 = new ArrayListB();
        ArrayListB1.addFirst(1);
        ArrayListB1.addFirst(2);
        ArrayListB1.addFirst(2);
        ArrayListB1.addFirst(4);
        ArrayListB1.addFirst(2);
        ArrayListB1.addFirst(6);
        ArrayListB1.addFirst(2);
        ArrayListB1.addFirst(8);
        ArrayListB1.addFirst(9);
        ArrayListB1.addFirst(10);
        ArrayListB1.display();
        System.out.println();
        ArrayListB1.addList(12);
        ArrayListB1.display();
        System.out.println();
        System.out.println( ArrayListB1.contains(5));
        System.out.println();
        System.out.println(ArrayListB1.listSize());
        System.out.println();
        ArrayListB1.addIndex(4,45);
        ArrayListB1.display();
        System.out.println("开始删除");
        System.out.println();
        ArrayListB1.remove(10);
        ArrayListB1.display();
        System.out.println();
        ArrayListB1.removeAllKey(2);
        ArrayListB1.display();
        System.out.println();
        //ArrayListB1.backList();
        ArrayListB1.display2(ArrayListB1.backList());



    }

}
