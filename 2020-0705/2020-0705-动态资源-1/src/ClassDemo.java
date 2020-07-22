import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program:2020-0705-动态资源
 * @description
 * @author: 张林
 * @creat:2020-07-05 16:41
 **/
public class ClassDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过query  string，取到wd这个name所对应的value
        String  wd = req.getParameter("wd");
        //返回的content-type是text/html，字符集编码是utf-8
        resp.setContentType("text/html;charset = utf-8");
        PrintWriter writer = resp.getWriter();
        //输出响应的内容
        writer.println("<h1> 我是/s资源</h1>");
        writer.println("<p>用户要找的关键字是："+wd+"</p>");
    }


}

/*
*   <servlet>
<servlet-name> hh</servlet-name>
<servlet-name>classDemo</servlet-name>
</servlet>

<servlet-mapping>
<servlet-name>hh</servlet-name>
<url-pattern>/t</url-pattern>
</servlet-mapping>
*
*
*
*
*
* <servlet-mapping>
	<servlet-name>Hello</servlet-name>
	<url-pattern>/hello</url-pattern>
</servlet-mapping>
*
* <servlet>
	<servlet-name>Hello</servlet-name>
	<servlet-class>FistDynamicResource</servlet-class>
</servlet>	 */
