/**
 * @program:20200419
 * @description
 * @author: 张林
 * @creat:2020-04-19 22:17
 **/

public class TestDemoThree {
    public static void main(String[] args) {
        MyArrayList shuzu = new MyArrayList();
        /*list.add(0,23);
        list.add(1,1);
        list.add(2,3);
        list.add(3,5);*/

        for (int i = 0;i < 10;i++) {
            shuzu.add(i,i);
        }
        shuzu.display();
        System.out.println("#############");
        shuzu.add(6,11);
        shuzu.display();
        System.out.println("#############");
        boolean flg = shuzu.contains(7);
        System.out.println(flg);
        System.out.println("#############");
        System.out.println(shuzu.search(5));
        System.out.println("#############");
        System.out.println(shuzu.getPos(2));
        System.out.println("#############");
        shuzu.remove(9);
        shuzu.display();
        shuzu.remove(0);
        shuzu.display();
        shuzu.clear();
        shuzu.display();
        //System.out.println();
    }
}
