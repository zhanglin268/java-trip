package zhanglin.servlet;

import zhanglin.model.Response;
import zhanglin.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 5:24 pm 27/07/2020
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        Response r = new Response();
        r.setCode("COK200");
        r.setMessage("操作成功");
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        r.setData(l);
        pw.println(JSONUtil.write(r));
        pw.flush();

    }
}
