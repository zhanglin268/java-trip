package blog;

/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-11 01:26
 **/

/**
 *
 * 有意识的把每个功能的使用一个action接口抽象了
 * 无论是什么功能，最终就是实现action。run方法
 */
public interface Action {
    void run();

}
