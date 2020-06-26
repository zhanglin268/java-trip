/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-18 19:31
 **/

/**
 *
 * 演示synchronized关键字的语法
 */
public class SynchronizedSyntaxDemo {
    /**
     * 修饰方法
     */
    public synchronized void method() {
    }

    public static synchronized void staticMethod() {
    }

    /**
     * 修饰代码块
     */
    public void otherMethod() {
        // 括号里跟着指向对象的引用，引用不能是 null
        Object o = new Object();
        synchronized (o) {
        }

        synchronized (this) {
        }

        // 反射中，指向当前类对象
        synchronized (SynchronizedSyntaxDemo.class) {
        }
    }
}
