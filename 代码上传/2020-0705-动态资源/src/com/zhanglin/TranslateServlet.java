package com.zhanglin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:2020-0705-动态资源
 * @description
 * @author: 张林
 * @creat:2020-07-06 16:40
 **/
public abstract class TranslateServlet extends HttpServlet {

    private static Map<String,String>dictionary = new HashMap<>();
    static {
        dictionary.put("apple","苹果");
        dictionary.put("pear","梨子");
        dictionary.put("yellow","黄色");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String english = req.getParameter("english");
         //todo :没有任何的错误处理
        String chinese = dictionary.getOrDefault(english,"不认识的单词");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> 翻译的结果</h1>");
        writer.println("<p>"+english+"的意思是"+chinese);





    }
}
