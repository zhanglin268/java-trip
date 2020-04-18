/**
 * @program:20200418
 * @description
 * @author: 张林
 * @creat:2020-04-18 19:48
 **/
public class TestDemoOne {
    //static int cnt = 6;
    //static{
    //    cnt += 9;
  //  }
    public String toString() {

        System.out.print("aaa");

        return "bbb";
    }
    public static void main(String[] args){

        System.out.println(new TestDemoOne());


        //System.out.println("cnt="+ cnt);
    }
  //  static{
 //       cnt /=3;
 //   };


}



/*
public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args）{
        System.out.println（“cnt =” + cnt);
    }
    static{
        cnt /=3;
    };
}*/

/*
class Test{

    public String toString() {

        System.out.print("aaa");

        return "bbb";
   }

}
    public static void main(String[] args) {

        System.out.println(new Test());
    }

*/
