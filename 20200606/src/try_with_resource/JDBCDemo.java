package try_with_resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-08 17:43
 **/
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopes?useSSL=false&characterEncoding";
        String user = "root";
        String password = "zhl19990207803";
        //不使用try_with_resource的写法
        Connection connection = DriverManager.getConnection(url,user,password);
        //执行具体的操作
        connection.close();
       /* {
            try (Connection connection = DriverManager(url, user, password)) {
                 //具体的操作
            }//会自动调用connection.close(),编译器会帮你加上相应的代码

        }*/

    }

}
