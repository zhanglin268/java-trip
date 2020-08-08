package zhanglin.dao;

import zhanglin.model.Classes;
import zhanglin.model.Student;
import zhanglin.model.User;
import zhanglin.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 * @author: 张林
 * @Date :Created in 4:17 pm 3/08/2020
 */
public class UserDAO {
    public static User query(User u) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       User query = null;
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的在需要空格的地方加空格或者缩进，设置占位符
            String sql = "select id,nickname,email,create_time from user where username=? and password=?";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setString(1,u.getUsername());
            ps.setString(2,u.getPassword());
            //3，执行查询操作
            rs = ps.executeQuery();
            //4,处理结果集
            while(rs.next()) {
                //设置属性，通过结果集获取，并获取
                query = u;
                query.setId(rs.getInt("id"));
                query.setNickname(rs.getString("nickname"));
                query.setEmail(rs.getString("email"));
                query.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));

            }
            return query;
        } catch (Exception e) {
            throw new RuntimeException("登录用户名校验出错",e);
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }
}
