import java.sql.*;

/**
 * @program:20200606
 * @description
 * @author: 张林
 * @creat:2020-06-06 11:57
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       //注册驱动 --选择乙方
        Class.forName("com.mysql.jdbc.Driver");
        /**
         * 完整的目标是执行select *from student_0604;
         */
        //建立数据库连接
        //写明mysql 服务端所在地
        //以后写项目，只需要调用默认数据库名称即可
        String defaultDatabaseName = "shopes";//等于我们在 mysql 界面上用 use 库名称，指定默认库
        //下面这里，基本不变
        String user = "root";
        String password = "zhl19990207803";



        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName
                + "?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url,user,password);
        //打印connection对象，验证是否连接成功
        System.out.println(connection);
        //queryDemo(connection);
       // updateDemo(connection);





        //关闭刚才的连接
        //connection.close();//最后执行的一步操作







    }

    private static void updateDemo(Connection connection) throws SQLException {
        //真正要执行的失去了语言并获取返回数据库的结果
        Statement statement = connection.createStatement();//statement 语句的意思
        String sql = "insert into student_0605 (sn,name,sex) values('2002','xiaoch','女')";
        int affectedRows = statement.executeUpdate(sql);

        System.out.printf("Query ok,%d row affected%n",affectedRows);

        statement.close();
    }

    private static void queryDemo(Connection connection) throws SQLException {
        //要执行真正的sql语言并获取数据库的返回的结果
        //statement代表的是语句的抽象对象

        Statement statement = connection.createStatement();

        String sql = "select *from student ";


        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;
        System.out.println("+------+-------+---------+-------------+");
        System.out.println("|+ id  +  sn   +  name   +    sex      +");
        System.out.println("+------+-------+---------+-------------+");


        while(resultSet.next()) {
            String id = resultSet.getString(1);//获得第几列的结果
            String sn = resultSet.getString(2);
            String name = resultSet.getString(3);
            String sex = resultSet.getString(4);
            System.out.format("| %2s |  %4s | %7s |%3s |%n",id,sn,name,sex);
            count++;
        }
        System.out.println("+------+-------+---------+-------------+");
        System.out.format("%d rows in set",count);
        //-3 关闭resultset对象
        resultSet.close();
        //-2 关闭statement 对象
        statement.close();
    }
}
