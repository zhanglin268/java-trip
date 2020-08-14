package zhanglin.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import zhanglin.dao.DictionaryTagDAO;
import zhanglin.model.DictionaryTag;
import zhanglin.model.Response;
import zhanglin.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 12:03 am 2/08/2020
 */
public abstract class AbstractBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    //模板方法：参照httpServlet的service方法和doxxx方法的关系，service就是一个模板方法
    //模板方法是提供一种统一的处理逻辑，在不同条件下调用不同的方法，理解模板的设计模式，java多态的理解
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        Response r = new Response();

        //httpServletRequest对象，getParameter()方法，可以获得哪些数据
        //一般来说表单提交的默认提交方式，表示的意思是请求的content-type字段
        //get(）会怎么样？get是在URL中 ，post（） 会怎样？在请求体，


        try {
            Object o = process(req,resp);
            r.setSuccess(true);
            r.setCode("COK200");
            r.setMessage("操作成功");
            r.setData(o);
        } catch (Exception e) {
            //e.printStackTrace();
            r.setCode("ERR500");
            r.setMessage(e.getMessage());
            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);
            e.printStackTrace(writer);
            String stackTrace = sw.toString();
            System.err.println(stackTrace);
            r.setStackTrace(stackTrace);
        }


        pw.println(JSONUtil.write(r));
        pw.flush();
    }

    protected   abstract Object process(HttpServletRequest req, HttpServletResponse resp)throws Exception ;
}
