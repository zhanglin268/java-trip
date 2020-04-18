/**
 * @program:20200418
 * @description
 * @author: 张林
 * @creat:2020-04-18 08:53
 **/
class Person{

    public Person(String name) {
      //  this.name = name;
    }

    public Person() {
        //this("zhangsan", 10);
        System.out.println("Perosn<init>");

    }

    {
        System.out.println("实例代码块");
    }

    //public static void func() {
       // count = 99;
       // this.name = "lisi"

   // }


    public Person(String name, int age) {
       // this.name = name;
       // this.age = age;
        System.out.println("Person<intit>hh");
    }

    /*public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person<intit>hh");
    }*/


    private String name;
    private int age;
    public static int count = 0;
    static {
        //count = 99;
        System.out.println("静态代码块");
        count = 99;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "我叫'" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {

    public static void main(String[] args) {
        System.out.println(Person.count);
       // Person person = new Person();

    }
    public static void main1(String[] args) {
        //Person person  = new Person();
       // person.setName("zhanglin");
        //String str = person.getName();
       // System.out.println(person.getName());
       // person.setAge(19);
        //person.getAge();
        //System.out.println(person.getAge());
        //person.toString();
       // System.out.println(person.toString());



        Person person = new Person();
        System.out.println(person);
        //Person person1 = new Person("nihao",18);
        //System.out.println(person1);
    }



}
