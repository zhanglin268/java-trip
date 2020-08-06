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
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1:3306/shopes?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "zhl19990207803";

        Class.forName("com.mysql.jdbc.Driver");
        //不使用try_with_resource的写法
        {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url,user,password);
                //执行具体的操作
            }finally {
                if(connection != null) {
                    //说明当时连接成功了，
                    //
                    connection.close();
                }
            }


        }
            //使用try_with_resource的写法，1.8之后支持，目的就是简化代码
      /* {
            try (Connection connection = DriverManager(url, user, password)) {
                 //具体的操作
                 try(Statement statement = connection.createStatement()) {
                    String sql = "show tables";
                    try(ResultSet resultSet = statement.executeQuery(sql)) {
                        while(resultSet.next()) {
                            System.out.println(rsultSet.getString(1));
                        }
                    }

                 }
            }//会自动调用connection.close(),编译器会帮你加上相应的代码

       }*/

    }

}
