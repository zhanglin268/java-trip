<%@ page import="com.lin.model.Book" %>
<%@ page import="com.lin.model.Section" %>
<%@ page import="com.lin.model.User" %>
<%@ page import="com.lin.service.BookService" %>
<%--
  Created by IntelliJ IDEA.
  User: 张林
  Date: 23/08/2020
  Time: 8:00 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private BookService bookService;

    public void jspInit() {
        bookService = new BookService();
    }
%>
<%
    // 根据 URL 中的 bid，获取书籍信息
    int bid = Integer.parseInt(request.getParameter("bid"));
    Book book = bookService.get(bid);
    if (book == null) {
        response.sendError(404, "没有这本书");
        return;
    }
    // 获取当前登陆用户信息
    User user = (User) session.getAttribute("user");
%>
<html>
<head>
    <meta charset="utf-8">
    <title>听书FM | 书籍详情</title>
</head>
<body>
<h1><%= book.title %></h1>
<p>上传者: <%= book.user.username %></p>

<!-- 如果当前用户就是书籍的上传用户，允许用户进行添加新章节 -->
<% if (user != null && book.user.equals(user)) { %>
<h2>添加新章节</h2>
<form method="post" action="post-section">
    <input type="hidden" name="bid" value="<%= book.bid %>">
    <div>
        <label for="name">
            章节名称：
            <input type="text" id="name" name="name">
        </label>
    </div>
    <div>
        <button type="submit">提交</button>
    </div>
</form>
<% } %>

<h2>章节列表</h2>
<ol>
    <% for (Section section : book.sections) { %>
    <% if (section.uuid != null) { %>
    <li>
        <%= section.name %>
        <audio controls src="/audio/get?uuid=<%= section.uuid %>"></audio>
    </li>
    <% } else if (user != null && book.user.equals(user)) { %>
    <li>
        <%= section.name %>
        <a href="record.jsp?sid=<%= section.sid %>">录制声音</a>
    </li>
    <% } %>
    <% } %>
</ol>
</body>
</html>

