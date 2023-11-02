<%--
  Created by IntelliJ IDEA.
  User: XiaLuo
  Date: 2023/10/27
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
  <div style="text-align: center; margin-top: 50px">
  <form method="post" action="/formReqServlet">
    <p>UserName: <input type="text" name="username"></p>
    <p>PassWord: <input type="password" name="password"></p>
    <p>InformationSource:
      <input type="checkbox" name="source" value="网络">网络
      <input type="checkbox" name="source" value="朋友">朋友
    </p>
    <p><input type="submit" name="submit"></p>
    <p><input type="reset" name="reset"></p>
  </form>
    </div>

  </body>
</html>
