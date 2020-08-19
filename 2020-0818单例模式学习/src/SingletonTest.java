/**
 * @author: 张林
 * @Date :Created in 10:31 am 18/08/2020
 */
public class SingletonTest {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton1 = LazySingleton.getInstance();
                System.out.println(lazySingleton1);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton2 = LazySingleton.getInstance();
                System.out.println(lazySingleton2);

            }
        }).start();

    }

}
class LazySingleton {
    private  volatile static LazySingleton instance;
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();

                }
            }
        }
        return instance;
    }
    private LazySingleton(){

    }
}
