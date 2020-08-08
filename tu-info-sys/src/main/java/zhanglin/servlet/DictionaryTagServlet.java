package zhanglin.servlet;

import zhanglin.dao.DictionaryTagDAO;
import zhanglin.model.DictionaryTag;
import zhanglin.model.Response;
import zhanglin.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张林
 * @Date :Created in 7:05 pm 31/07/2020
 */
@WebServlet("/dict/tag/query")//servlet路径一定要以/开头，否则Tomcat会报错
public class DictionaryTagServlet extends AbstractBaseServlet {


    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        String key = req.getParameter("dictionaryKey");
        List<DictionaryTag> tags = DictionaryTagDAO.query(key);
        return tags;
    }
}
