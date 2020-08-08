package zhanglin.servlet;

import zhanglin.dao.UserDAO;
import zhanglin.model.User;
import zhanglin.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: 张林
 * @Date :Created in 4:05 pm 3/08/2020
 */
@WebServlet("/user/login")
public class LoginServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u = JSONUtil.read(req.getInputStream(),User.class);
        //数据库校验用户密码
        User query = UserDAO.query(u);
        if(query == null) {
            throw new RuntimeException("用户名或密码错误,校验失败");
        }
        //查询通过用户名查询到用户时将用户保存到用户里面去
        HttpSession session = req.getSession();//=getsession(true)时，没有session时创建一个
        session.setAttribute("user",query);

        return null;
    }
}
