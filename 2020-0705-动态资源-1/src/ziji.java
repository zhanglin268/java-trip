import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @program:2020-0705-动态资源
 * @description
 * @author: 张林
 * @creat:2020-07-06 10:55
 **/
class A {
    int a = 10;
    public void func() {
        System.out.println("jjj");
    }
}
class B extends  A{

    @Override
    public void func() {
        System.out.println("nihao");
    }
}
public class ziji {


    public static void main2(String[] args) {
        int[] arr = {1,4,3,5,2,7,99,45,67,35};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);
        System.out.println(" =======+++++===");
        /*list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });*/

        list.sort((o1,o2) -> {
            return o1-o2;
        });
       for(int i =0;i < list.size();i++) {
           System.out.print(list.get(i));
       }
    }
    public static void mains(String[] args) {
        B b = new B();
        System.out.println(b.a);
        b.func();
        A a = new A();
        a.func();

    }
}
