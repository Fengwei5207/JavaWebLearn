<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/23
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        out.print(name+"<br>");
        out.print(pwd+"<br>");
    %>
  
  </body>
</html>
