package zhanglin.dao;

import zhanglin.model.Classes;
import zhanglin.model.DictionaryTag;
import zhanglin.model.Student;
import zhanglin.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 11:30 pm 2/08/2020
 */
public class ClassesDAO {
    public static List<Classes> queryAsDict() {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Classes> list = new ArrayList<>();
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的\n在需要空格的地方加空格或者缩进，设置占位符
            String sql = "select id, classes_name, classes_graduate_year, classes_major from classes";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);

            //3，执行查询操作
            rs = ps.executeQuery();
            //4,处理结果集
            while(rs.next()) {
               Classes classes = new Classes();
                //设置属性，通过结果集获取，并获取
                classes.setDictionaryTagKey(String.valueOf(rs.getInt("id")));
                classes.setDictionaryTagValue(rs.getString("classes_name"));
                classes.setClassesGraduateYear(rs.getString("classes_graduate_year"));
                classes.setClassesMajor(rs.getString("classes_major"));
                list.add(classes);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(" 查询班级数据字典出错",e);
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }
}
