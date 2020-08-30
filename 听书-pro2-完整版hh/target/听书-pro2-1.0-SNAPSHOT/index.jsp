<%@ page import="com.lin.model.Book" %>
<%@ page import="com.lin.service.BookService" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 张林
  Date: 23/08/2020
  Time: 12:13 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 执行java代码-->
<%!
    private BookService bookService;
    public void jspInit() {
        bookService = new BookService();
    }
%>
<%
    //这里是执行java代码
    List<Book> books = bookService.list();
%>
<!DOCTYPE html>
<html lang="zh-hans">
<html>
<head>
    <meta charset="utf-8">
    <title>首页 -听书FM</title>
</head>
<body>
    <header>
        <nav>
            <ol>
                <li><a href="/register.html" >注册</a></li>
                <li><a href="/login.html" >登陆</a></li>
                <li><a href="/add-book.jsp" >上传书籍</a></li>

            </ol>
        </nav>
    </header>
    <main>
        <ol>
            <% for(Book book:books) { %>
            <li>
                <a href="/book.jsp?bid=<%=book.bid%>"><%=book.title %></a>
                <span>上传者:<%=book.user.username %></span>
            </li>
            <%} %>
        </ol>
    </main>
</body>
</html>
