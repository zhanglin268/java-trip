package com.lin.demo;

/**
 * @program:20200511
 * @description
 * @author: 张林
 * @creat:2020-05-11 16:30
 **/

/**
 * try catch 应用
 *
 *
 */
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
    /*public UserException() {
    }*/
    /*public UserException(String message) {
        super(message);
    }*/
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo4 {
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException UserException) {
            UserException.printStackTrace();
        } catch (PasswordException PasswordException) {
            PasswordException.printStackTrace();
        }
    }


        public static void login(String userName, String password) throws UserException,
            PasswordException{
        if (!TestDemo4.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!TestDemo4.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }

}
