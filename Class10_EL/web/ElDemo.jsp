<%--
  Created by IntelliJ IDEA.
  User: XiaLuo
  Date: 2023/11/30
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    ${"hello"}
    <br>
    ${22}
    <%
    String username = "张三";
    session.setAttribute("username",username);

    %>
    ${username}

</div>
</body>
</html>
