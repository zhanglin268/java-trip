package com.zhanglin.servlet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/api/article-list.json")
public class ArticleListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取文章列表
        List<Article> articleList = null;
        try {
            articleList = Article.list();
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        // 2. 将文章列表转换成 JSON 字符串
        String jsonText = translateToJSON(articleList);
        // 3. 写入 response
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        resp.getWriter().println(jsonText);
    }

    private String translateToJSON(List<Article> articleList) {
        JSONArray array = new JSONArray();

        for (Article article : articleList) {
            JSONObject articleObject = new JSONObject();
            JSONObject authorObject = new JSONObject();

            authorObject.put("id", article.authorId);
            authorObject.put("username", article.authorUsername);

            articleObject.put("id", article.id);
            articleObject.put("author", authorObject);
            articleObject.put("title", article.title);
            articleObject.put("published-at", article.publishedAt);

            array.add(articleObject);
        }

        return array.toJSONString();
    }
}
