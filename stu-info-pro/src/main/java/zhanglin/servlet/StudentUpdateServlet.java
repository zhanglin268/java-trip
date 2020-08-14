package zhanglin.servlet;

import zhanglin.dao.StudentDAO;
import zhanglin.model.Student;
import zhanglin.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 张林
 * @Date :Created in 3:13 pm 3/08/2020
 */
@WebServlet("/student/update")
public class StudentUpdateServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        Student s = JSONUtil.read(req.getInputStream(),Student.class);
        StudentDAO.update(s);
        return null;
    }
}
