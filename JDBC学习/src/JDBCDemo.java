import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @program:JDBC学习
 * @description
 * @author: 张林
 * @creat:2020-06-23 01:30
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动--选择乙方
        Class.forName("com.mysql.jdbc.Driver");
        //System.out.println(cls.getSimpleName());
        String password = "zhl19990207803";//自己的数据库密码
         //建立数据库连接
        //写明mysql服务端所在地
        String defaultDatabaseName = "hjb";//自己之前创建的数据库
        //只需要更换数据库  下面基本不用动
        String user = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/"+defaultDatabaseName+"?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url,user,password);
        //打印connection对象是否连接成功
        System.out.println(connection);


    }

}
