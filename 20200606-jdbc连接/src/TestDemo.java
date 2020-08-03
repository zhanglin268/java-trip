/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-06 18:03
 **/

import java.sql.*;
public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class <?> cls = Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());
    }
}
