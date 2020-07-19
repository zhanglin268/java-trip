package com.zhang;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 4:28 pm 11/07/2020
 */

public class User {
    String username;
    String password;
    public User(String username,String password) {
        this.username = username;
        this.password = password;
    }
    //整备提交一些系统中的用户
    public  static final List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("zhang","123"));
        userList.add(new User("lin","456"));
    }
    public static User login(String username,String password) {
        //本质上就是查找
        for(User user:userList) {
            if(user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

}
