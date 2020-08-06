package blog;

/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-11 09:35
 **/
public class User {
    int id;
    String username;
    String nickname;

    // 当前的登录用户信息
    // 没有登录 user == null
    // 否则，指向具体的用户对象
    private static User currentUser = null;

    public static void login(User user) {
        currentUser = user;
        System.out.println("刚刚登录的用户信息是：" + currentUser);
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static boolean isLogined() {
        return currentUser != null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
