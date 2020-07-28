package com.zhanglin.servlet;

import com.zhanglin.model.User;

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
 * @Date :Created in 12:59 am 13/07/2020
 */
@WebServlet("")
public class IndexServlet extends HttpServlet {

    /*protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        String nav = "";
        if (user == null) {
            nav = "             <li><a href=\"register.html\">注册</a></li>\n" +
                    "            <li><a href=\"login.html\">登录</a></li>\n";
        } else {
            nav = "             <li>" + user.username + "</li>\n" +
                    "            <li><a href=\"publish.html\">发表文章</a></li>\n";
        }

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        String htmlContent = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>老陈说</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"navigator\">\n" +
                "        <ol>\n" +
                nav +
                "        </ol>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"article-list\">\n" +
                "        <!-- 如果没有文章 -->\n" +
                "        没有任何文章，请发表第一篇文章\n" +
                "        <!-- 如果有文章 -->\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        writer.println(htmlContent);
    }*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        String nav = "";
        if (user == null) {
            nav = "             <li><a href=\"register.html\">注册</a></li>\n" +
                    "            <li><a href=\"login.html\">登录</a></li>\n";
        } else {
            nav = "             <li>" + user.username + "</li>\n" +
                    "            <li><a href=\"publish.html\">发表文章</a></li>\n";
        }

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        String htmlContent = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>老陈说</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"navigator\">\n" +
                "        <ol>\n" +
                nav +
                "        </ol>\n" +
                "    </div>\n" +
                "\n" +
                "    <div id=\"article-list\">\n" +
                "        <!-- 如果没有文章 -->\n" +
                "        没有任何文章，请发表第一篇文章\n" +
                "        <!-- 如果有文章 -->\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        writer.println(htmlContent);
    }
}
