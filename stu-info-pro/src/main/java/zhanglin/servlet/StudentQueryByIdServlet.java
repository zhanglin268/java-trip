package zhanglin.servlet;

import zhanglin.dao.StudentDAO;
import zhanglin.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 张林
 * @Date :Created in 12:43 am 3/08/2020
 */
@WebServlet("/student/queryById")
public class StudentQueryByIdServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String id = req.getParameter("id");
        Student s = StudentDAO.queryById(Integer.parseInt(id));

        return s;
    }
}
