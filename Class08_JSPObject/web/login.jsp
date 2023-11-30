<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/23
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="text-align: center">

    <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null) {
            out.println(msg);

        }

    %>
    <form action="loginValidate_toMain.jsp" method="post">
        <p>用户名:<input type="text" name="username"></p>
        <p>密码:<input type="password" name="pwd"></p>
        <p><input type="submit" value="提交"></p>

    </form>
</div>
</body>
</html>
