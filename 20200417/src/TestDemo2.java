import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @program:20200417
 * @description
 * @author: 张林
 * @creat:2020-04-17 15:12
 **/

class Person {
    //字段-成员变量 定义在方法之外在类里面的叫成员变量


    //publci 访问修饰限定符 公有的
    //private私有的
    public String name = "zhanglin";
    public int age = 18;
    public boolean flg;
    public static int size = 10;
    public void eat() {
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }
    public static void func1() {
        System.out.println("static :: func1!");
    }
    public void show() {
        System.out.println("我叫"+ name+",今年"+ age+"岁");
    }

    //方法-行为

}
class Test {
    public int a;
    public static int count;
    public void func2() {

    }

}

public class TestDemo2 {
    public static void main(String[] args) {
       //func2();
        //Test test = new Test();
       // test.func2();
       // Person.func1();


    }




    public static void main6(String[] args) {
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);
        System.out.println(Test.count);
        System.out.println("#########");
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
    public static void main5(String[] args) {
        Person per = new Person();
        per.eat();
        per.sleep();
        Person.func1();
        per.show();
    }
    public static void main4(String[] args) {
        Person per = new Person();
        System.out.println(per.name);
        per.name = "zhangsan";
        System.out.println(per.name);
        System.out.println(per.age);
        System.out.println(per.flg);
        System.out.println(Person.size);

    }
    public static void main1(String[] args) {
        //实例化哦一个对象
        Person person = new Person();
        //Person person1 = new Person();
        //Person person2 = new Person();
        //Person person3 = new Person();
        //person.name();
    }
}
