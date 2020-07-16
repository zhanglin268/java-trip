package com.zhanglin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static sun.misc.Version.println;

/**
 * @author: 张林
 * @Date :Created in 1:59 pm 10/07/2020
 */

@WebServlet("/status")
public class StatusServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendError(404,"这是自己部署的错误404");
        //resp.setStatus(405);
        //resp.setStatus(200);//手动设置响应请求
        //resp.setStatus(404);
       // resp.setContentType("text/plain;charset = utf-8");
      //  resp.getWriter().println("这是自己设置的");
        //自己练习
        /*resp.setStatus(404);
        resp.setContentType("text/plain;charset = utf-8");
        resp.getWriter().println("吃冰淇淋不");*/

        //int[] arr = {1,2,3};
        //System.out.println(arr[4]);
        /*Object o = null;
        synchronized (o) {*/

        resp.setStatus(301);
        resp.setHeader("Location","https://www.baidu.com/");



    }
}
