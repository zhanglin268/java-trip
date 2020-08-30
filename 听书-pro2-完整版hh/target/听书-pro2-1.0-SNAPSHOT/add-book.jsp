<%@ page import="com.lin.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 张林
  Date: 23/08/2020
  Time: 12:45 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User)session.getAttribute("user");
    if(user == null) {
        response.sendRedirect("/login.html");
        return ;
    }
%>

<html>
<head>
    <title>听书FM | 上传书籍</title>
</head>
<body>
    <form method="post" action="/post-book">
        <div>
            <label for="title">
                书籍标题：
                <input type="text" id="title" name="title">
            </label>
        </div>
        <div>
            <button type="submit">上传</button>
        </div>
    </form>
</body>
</html>
