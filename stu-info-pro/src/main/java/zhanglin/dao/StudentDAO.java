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
 * @Date :Created in 12:36 am 2/08/2020
 */
public class StudentDAO {


    public static List<Student> query() {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> list = new ArrayList<>();
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的在需要空格的地方加空格或者缩进，设置占位符
            String sql = "select s.id," +
                    "       s.student_name," +
                    "       s.student_no," +
                    "       s.id_card," +
                    "       s.student_email," +
                    "       s.classes_id," +
                    "       s.create_time," +
                    "       c.id cid," +
                    "       c.classes_name," +
                    "       c.classes_graduate_year," +
                    "       c.classes_major," +
                    "       c.classes_desc," +
                    "       c.create_time c_create_time" +
                    "   from student s" +
                    "         join classes c on s.classes_id = c.id";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);

            //3，执行查询操作
            rs = ps.executeQuery();
            //4,处理结果集
            while(rs.next()) {
                Student student = new Student();
                //设置属性，通过结果集获取，并获取
                student.setId(rs.getInt("id"));
                student.setStudentName(rs.getString("student_name"));
                student.setStudentNo(rs.getString("student_no"));
                student.setIdCard(rs.getString("id_card"));
                student.setStudentEmail(rs.getString("student_email"));
                student.setClassesId(rs.getInt("classes_id"));
                student.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
                Classes classes = new Classes();
                student.setClasses(classes);
                classes.setId(rs.getInt("cid"));
                classes.setClassesName(rs.getString("classes_name"));
                classes.setClassesGraduateYear(rs.getString("classes_graduate_year"));
                classes.setClassesMajor(rs.getString("classes_major"));
                classes.setClassesDesc(rs.getString("classes_desc"));
                classes.setCreateTime(new Date(rs.getTimestamp("c_create_time").getTime()));


                list.add(student);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(" 查询数据字典标签出错",e);
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }

    public static Student queryById(int id) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student student = new Student();
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的在需要空格的地方加空格或者缩进，设置占位符
            String sql = "select s.id," +
                    "       s.student_name," +
                    "       s.student_no," +
                    "       s.id_card," +
                    "       s.student_email," +
                    "       s.classes_id," +
                    "       s.create_time," +
                    "       c.id cid," +
                    "       c.classes_name," +
                    "       c.classes_graduate_year," +
                    "       c.classes_major," +
                    "       c.classes_desc," +
                    "       c.create_time c_create_time" +
                    "   from student s" +
                    "         join classes c on s.classes_id = c.id" +
                    "   where s.id=?";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setInt(1,id);
            //3，执行查询操作
            rs = ps.executeQuery();
            //4,处理结果集
            while(rs.next()) {
                //设置属性，通过结果集获取，并获取
                student.setId(rs.getInt("id"));
                student.setStudentName(rs.getString("student_name"));
                student.setStudentNo(rs.getString("student_no"));
                student.setIdCard(rs.getString("id_card"));
                student.setStudentEmail(rs.getString("student_email"));
                student.setClassesId(rs.getInt("classes_id"));
                student.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
                Classes classes = new Classes();
                student.setClasses(classes);
                classes.setId(rs.getInt("cid"));
                classes.setClassesName(rs.getString("classes_name"));
                classes.setClassesGraduateYear(rs.getString("classes_graduate_year"));
                classes.setClassesMajor(rs.getString("classes_major"));
                classes.setClassesDesc(rs.getString("classes_desc"));
                classes.setCreateTime(new Date(rs.getTimestamp("c_create_time").getTime()));



            }
            return student;
        } catch (Exception e) {
            throw new RuntimeException(" 查询学生详情出错",e);
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }

    public static void insert(Student s) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的\n在需要空格的地方加空格或者缩进，设置占位符
            String sql = "insert into student(student_name,student_no,id_card,student_email,classes_id) values(?,?,?,?,?) ";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setString(1,s.getStudentName());
            ps.setString(2,s.getStudentNo());
            ps.setString(3,s.getIdCard());
            ps.setString(4,s.getStudentEmail());
            ps.setInt(5,s.getClassesId());
            //3，执行查询操作
            int num = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(" 新增学生出错",e);
        }finally {
            DBUtil.close(c,ps);
        }
    }

    public static void update(Student s) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的\n在需要空格的地方加空格或者缩进，设置占位符
            String sql = "update student set student_name=?,student_no=?,id_card=?,student_email=?,classes_id=? where id=?";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setString(1,s.getStudentName());
            ps.setString(2,s.getStudentNo());
            ps.setString(3,s.getIdCard());
            ps.setString(4,s.getStudentEmail());
            ps.setInt(5,s.getClassesId());
            ps.setInt(6,s.getId());
            //3，执行查询操作
            int num = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(" 新增学生出错",e);
        }finally {
            DBUtil.close(c,ps);
        }
    }

    public static void delete(String[] ids) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1,获取数据库连接
            c = DBUtil.getConnection();
            //ctrl+r替换所有的\n在需要空格的地方加空格或者缩进，设置占位符
            StringBuilder sql = new StringBuilder("delete from student where id in(");
           for(int i = 0; i< ids.length;i++) {
               if(i != 0){
                   sql.append(",");
               }
               sql.append("?");
           }
           sql.append(")");
            //2.创建操作命令对象
            ps = c.prepareStatement(sql.toString());
            for(int i = 0;i < ids.length;i++) {
                ps.setInt(i+1,Integer.parseInt(ids[i]));//jdbc设置占位符是从1开始的

            }

            //3，执行查询操作
            int num = ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(" 删除学生出错",e);
        }finally {
            DBUtil.close(c,ps);
        }
    }
}
