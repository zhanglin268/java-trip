import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program:2020-0705-动态资源
 * @description
 * @author: 张林
 * @creat:2020-07-05 09:32
 **/
public class FistDynamicResource extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("name");
        String age = req.getParameter("age");
       resp.setContentType("text/html;charset = utf-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<h1> 编程很枯燥 ，但生活不就是苦中作乐嘛</h1>");
        writer.println("<p>再见 哈哈" + name+"年龄" +age+"</p>");
    }
}
