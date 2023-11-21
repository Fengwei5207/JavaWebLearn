<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/16
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookChoose</title>
</head>
<body style="text-align: center">
<form action="shoppingCar" method="post">
    <p><input type="checkbox" name="books" value="Java基础">Java基础</p>
    <p><input type="checkbox" name="books" value="Java高级">Java高级</p>
    <p><input type="checkbox" name="books" value="JavaWeb">JavaWeb</p>
    <p><input type="checkbox" name="books" value="Java Spring">Java Spring</p>
    <p><input type="checkbox" name="books" value="Java从入门到入土">Java从入门到入土</p>
    <p><input type="submit" value="submit"></p>
</form>
  
  </body>
</html>
