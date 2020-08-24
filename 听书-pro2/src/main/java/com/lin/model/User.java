package com.lin.model;

import java.util.Objects;

/**
 * @author: 张林
 * @Date :Created in 10:46 am 22/08/2020
 */
public class User {
    /**
     * 一般来说，model这类对象，都需要复写
     * toString（）；
     * equals
     * hash等
     */
    public int uid;
    public String username;
    public User(){

    }
    public User(int uid,String username) {
        this.uid = uid;
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return uid == user.uid &&
                username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username);
    }
}
