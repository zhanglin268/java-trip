package zhanglin.servlet;

import zhanglin.dao.StudentDAO;
import zhanglin.model.Page;
import zhanglin.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 12:35 am 2/08/2020
 */
@WebServlet("/student/query")
public class StudentQueryServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
       // Page p = Page.parse(req);
        List<Student>  students = StudentDAO.query();
        return students;
    }
}
