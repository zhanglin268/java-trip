package zhanglin.filter;

import zhanglin.model.Response;
import zhanglin.util.JSONUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 张林
 * @Date :Created in 4:31 pm 3/08/2020
 */

/*
*配置过滤器，只要请求路径匹配到过滤器路径，都会先执行过滤器的dofilter方法
* 至于是否往后面执行，依赖是否再次调用filterchain，dofilter方法
*
 */
@WebFilter("/**")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //只校验除登录接口之外的后台接口，没有登录时，不允许访问
        //前端资源，只校验public/page/main.html首页，其他的都放行
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getContextPath();
        //if("/public/page/main.html".equals(uri) || (!uri.startsWith("/public/")
       // && !uri.startsWith("/static") && !"/user/login".equals(uri))) {
            HttpSession session =req.getSession(false);//没有false的时候返回null
            if(session == null) {
                //首页的时候就重定向到登录页面，如果后端接口，返回错误的json数据、
                req.setCharacterEncoding("UTF-8");
                res.setCharacterEncoding("UTF-8");
                //首页重定向到登录页面
                if("/public/page/main.html".equals(uri)) {
                    res.setContentType("/text/html;charset=UTF-8");
                    String schema = req.getScheme();//http
                    String host = req.getServerName();//服务器ip
                    int port = req.getServerPort();//端口号
                    String ctx = req.getContextPath();//项目部署路径，应用上下文sis
                   // res.sendRedirect("/public/index.html");//这种写法跳转回出问题？
                   // res.sendRedirect("/public/index.html");//这种写法跳转回出问题？
                    String basePath = schema+"://"+host+":"+port+ctx;
                    res.sendRedirect("/public/index.html");//这种写法跳转回出问题？

                    return ;
                    //请求后端非登录接口
                }else if(!uri.startsWith("/public/")
                && !uri.startsWith("/static/") && !"/user/login".equals(uri)) {
                   res.setContentType("application/json");
                    PrintWriter pw = res.getWriter();
                    Response r = new Response();
                    r.setCode("ERR");
                    r.setMessage("不予许访问");
                    res.setStatus(401);
                    pw.println(JSONUtil.write(r));
                    pw.flush();
                    return;
                }
            }
            chain.doFilter(request,response);
      //  }

    }

    @Override
    public void destroy() {

    }
}
