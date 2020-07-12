/**
 * @program:20200417
 * @description
 * @author: 张林
 * @creat:2020-04-17 17:30
 **/


class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private String name;
    public int age;


/*public String getMyname() {
        return Myname;
    }
    public void setMyname(String Myname) {
       this. Myname = Myname;
    }
*/

//生成方法的快捷键 alt+insert
    //@Override
    public String toString() {
        return "Student{" +
                "我叫'" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void func1() {
        System.out.println("func1()");
    }
    public void show() {
        System.out.println("我叫"+ this.name+",今年"+ this.age+"岁");
    }

}
public class TestDemo3 {
    public static void main(String[] args) {
    Student  student = new Student();
    student.setName("zhanglin");
    String str = student.getName();
        System.out.println(str);
        student.show();
        System.out.println();
        System.out.println(student);
        String str2 = student.toString();
        System.out.println(str2);
    }
}
