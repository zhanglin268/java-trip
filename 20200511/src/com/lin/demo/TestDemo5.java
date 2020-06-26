package com.lin.demo;

/**
 * @program:20200511
 * @description
 * @author: 张林
 * @creat:2020-05-11 17:59
 **/
class UserException1 extends Exception {
    public UserException1(String message) {
        super(message);
    }
}
class PasswordException1 extends Exception {
    public PasswordException1(String message) {
        super(message);
    }
}
public class TestDemo5 {
    private static String username = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try{
            login1("zhngaling","123456");
        }catch (UserException1 | PasswordException1 e){
            e.printStackTrace();
        }/*catch(PasswordException1 e) {
            e.printStackTrace();
        }*/
    }

    public static void login1(String name,String password)throws UserException1,
    PasswordException1 {
        if(!TestDemo5.username.equals(name)) {
            throw new UserException1("名字错误");
        }
        if(!TestDemo5.password.equals(password)) {
            throw new PasswordException1("密码错误");
        }
        System.out.println("登录成功");
    }
}
