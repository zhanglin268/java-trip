package com.zhang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 张林
 * @Date :Created in 8:10 pm 11/07/2020
 */
@WebServlet("/zhc")
public class zhengzhou extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset = utf-8");
        PrintWriter writer = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User.userList.add(new User(username,password));
        writer.println("<p>注册完毕</p>");

    }

}
