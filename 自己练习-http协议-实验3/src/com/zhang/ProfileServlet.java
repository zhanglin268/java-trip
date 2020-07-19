package com.zhang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 张林
 * @Date :Created in 4:53 pm 11/07/2020
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过请求cookie中的session-id，去session中读取user对象
        //如果读到了user对象，就代表用户已经登录了
        //否则，代表用户没有登录过
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();

        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("user");
        if(user == null) {
            writer.println("<p>你没有登录 ，所以没有个人主页</p>");
        }else {
            writer.println("<p>欢迎你,"+user.username+"</p>");
        }

    }
}
