package com.lib;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 张林
 * @Date :Created in 7:04 pm 9/07/2020
 */

@WebServlet("/stues")
public class libServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.sendError(404,"今天太热了");
        resp.setStatus(301);
        resp.setHeader("location","https://www.baidu.com");
    }
}
