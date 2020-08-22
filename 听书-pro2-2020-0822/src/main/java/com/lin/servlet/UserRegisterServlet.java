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
 * @Date :Created in 4:54 pm 22/08/2020
 */
@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
    private UserService userService;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //每次都带上utf-8的设置，字符集不会出现问题
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //没有做参数检查
        try {
            User user = userService.register(username,password);
            if(user == null) {
                //没有注册成功
                //没有做太多易用性考虑。没有告诉用户错误原因。
                resp.sendRedirect("/register.html");
                return ;
            }
            //把当前用户种入session中，下次资源访问时携带用户信息。
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            //返回首页，
            resp.sendRedirect("/register.html");
            return ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }
}
