import java.util.Arrays;

/**
 * @program:20200502
 * @description
 * @author: 张林
 * @creat:2020-05-03 12:40
 **/
class Student implements Comparable<Student> {
    public String name ;
    public int age;
    public int score ;
   /* public Student (String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }*/

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.age) {
            return 1;
        }else if(this.score == o.age) {
            return 0;
        }else {
            return -1;
        }
    }
}


class Money implements Cloneable {
   double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public int age;
    Money m = new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //克隆person
        Person p = (Person)super.clone();
        //克隆当前对象的money对象
        p.m = (Money)this.m.clone();
        return p;
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("######修改后#####");
        person2.m.money = 88;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("######修改后#####");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);

    }
    public static void main1(String[] args) {
        /*int [] array = {1,2,3,4,5,6,7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
        Student student1 = new Student("zhanglin",12,78);
        Student student2 = new Student("zhang",14,71);
        Student student3 = new Student("zhangsn",15,79);
        Student [] student = new Student[3];
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        /*if(student1.compareTo(student2) < 0) {
            System.out.println("student1的年龄 < studnet2 的年龄");
        }*/
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

    }

}
