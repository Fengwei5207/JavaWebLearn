<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/17
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
        <%
            String email = request.getParameter("email");
            if (!email.contains("@")) {
        %>
        非法邮箱
        <%
        } else if (email.lastIndexOf(".") == -1) {
        %>
        非法邮箱
        <%
        } else {
        %>
        邮箱格式正确
        <%
            }
        %>
</div>
</body>
</html>
