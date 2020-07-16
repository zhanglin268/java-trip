package com.zhanglin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 张林
 * @Date :Created in 5:05 pm 10/07/2020
 */

@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //第一种种cookie的方法(本质上都是设置响应头)
        /* resp.setHeader("Set-Cookie","today = 2020-07-09");
        resp.setContentType("text/plain;charset = utf-8");
        resp.getWriter().println("已经种下cookie了：today = 2020-07-09");*/


        //""第二种种cookie的方法
        Cookie cookie = new Cookie("today","2020-07-09");
        resp.getWriter().println("已经种下cookie了：today = 2020-07-09");


    }
}
