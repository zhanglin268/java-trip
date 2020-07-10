import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 张林
 * @Date :Created in 9:00 pm 9/07/2020
 */
@WebServlet("/set-cookie")
public class SetCook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Set-Cookie","hello= nihao");
        resp.setContentType("text/plain;charset=utf-8");
        resp.getWriter().println("已经好了cookie:hello= nihao");
    }
}
