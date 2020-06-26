/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-19 00:08
 **/
public class TestDemo {
    private int count;
    TestDemo(int a) {
        count = a;
    }

    public static void main(String[] args) {
        TestDemo test = new TestDemo(88);
        System.out.println(test.count);


    }
}
