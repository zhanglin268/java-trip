package com.lin.servlet;

import com.lin.model.User;
import com.lin.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author: 张林
 * @Date :Created in 10:15 pm 22/08/2020
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
    private UserService userService;


    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            User user = userService.login(username,password);
            if(user == null) {
                //没有注册成功
                //没有做太多易用性考虑。没有告诉用户错误原因。
                resp.sendRedirect("/login.html");
                return ;
            }
            //把当前用户种入session中，下次资源访问时携带用户信息。
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            //返回首页，
            resp.sendRedirect("/");
            return ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
