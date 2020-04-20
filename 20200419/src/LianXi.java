/**
 * @program:20200419
 * @description
 * @author: 张林
 * @creat:2020-04-19 21:20
 **/
class MyValue{
    //private int Val;
    public int Val;

   /* public void setVal(int Val) {
        this.Val = Val;
    }

    public int getVal() {
        return Val;
    }*/
}



public class LianXi {
    public static void swap(MyValue myValue1,MyValue myValue2 ){
        int tmp = myValue1.Val;
        myValue1.Val = myValue2.Val;
        myValue2.Val = tmp;

    }




    /*public static void swap(MyValue myValue1,MyValue myValue2 ) {
    int tmp = myValue1.getVal();
    myValue1.setVal(myValue2.getVal());
    myValue2.setVal(tmp);
    }*/

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.Val = 10;
        myValue2.Val = 20;
        System.out.println(myValue1.Val);
        System.out.println(myValue2.Val);
        System.out.println("开始交换");
        swap(myValue1, myValue2);
        System.out.println(myValue1.Val);
        System.out.println(myValue2.Val);




        /*MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.setVal(10);
        myValue2.setVal(20);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        System.out.println("开始交换");
        swap(myValue1, myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());*/
    }
}
