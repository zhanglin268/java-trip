/**
 * @program:20200418
 * @description
 * @author: 张林
 * @creat:2020-04-18 21:09
 **/
import java.util.*;
class Calculator {
    private  int num1;
    private  int num2;



    public Calculator(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("小型计算器");
    }
    public  void add () {
        System.out.println(num1 + "+" +num2 + "=" +(num1+num2));
    }
    public   void jian() {
        System.out.println(num1 + "-" +num2 + "=" +(num1-num2));
    }
    public void cheng() {
        System.out.println(num1 + "*" +num2 + "=" +(num1*num2));
    }
    public  void chu() {
        System.out.println(num1 + "/" +num2 + "=" +(num1/num2));
    }
}




class Student{

    public String name;
    public String id;
    public String sex ;
    public double hight;
    public Student(String name,String id,String sex,double hight) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.hight = hight;

    }
    public void show () {
        System.out.println("我是"+this.name+"，我的ID是"+this.id+",性别："+this.sex+"，身高"+this.hight);
    }

}
class Exchange{
    public int num1;
    public int num2;
    public Exchange(int num1,int num2){
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        //this.num2 = tmp;
        System.out.println("#########");
        System.out.printf("num1=%d,num2=%d",num1,num2);
    }
   /* public void show (){
        System.out.printf("num1=%d,num2=%d",num1,num2);
    }*/
}


public class TestDemoThree {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        Exchange exch = new Exchange(num1,num2);




    }


    public static void main2(String[] args) {
        Student std1 = new Student("zhangsan","一班123456","男",182);
        Student std2 = new Student("lisi","二班112233","女",178);
        std1.show();
        std2.show();
    }
    public static void main1(String[] args) {
    Scanner scan = new Scanner(System.in) ;
    int  num1 = scan.nextInt();
    int num2 = scan.nextInt();

    Calculator calculator = new Calculator(num1,num2);
    calculator.add();
    calculator.jian();
    calculator.cheng();
    calculator.chu();

        calculator.add();
        calculator.jian();
        calculator.cheng();
        calculator.chu();

    }
}

