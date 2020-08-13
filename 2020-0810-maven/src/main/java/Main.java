import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhanglin.Duck;
import zhanglin.Duck3;
import zhanglin.DuckShop;

/**
 * @author: 张林
 * @Date :Created in 7:50 pm 10/08/2020
 */
public class Main {
    public static void main(String[] args) {
        //Spring开启容器的方式：application
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applications.xml");
        //String str = (String) context.getBean("hhh");
       // String str2 = (String) context.getBean("java.lang.String");
        //System.out.println(str);
       // System.out.println(str2);
        //String str2 = (String)context.getBean(String.class);
       // System.out.println(str2);

       // Duck duc = (Duck) context.getBean("d1");
      //  System.out.println(duc);


        Duck3 d1 = (Duck3)context.getBean("dd1");
        System.out.println(d1);

        DuckShop shop = (DuckShop) context.getBean("shop");
        System.out.println(shop);

    }
}
