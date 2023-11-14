<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/9
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="padding: 20px; text-align: center">
<div>默认方式提交Form表单数据</div>
<form action="reqBody" method="post" enctype="application/x-www-form-urlencoded">
    Name:<input type="text" name="name">
    PWD:<input type="text" name="pwd">
    <input type="submit">
</form>
<div>文件上传</div>
<form action="reqBody" method="post" enctype="multipart/form-data">
    <div>选择文件上传:</div>
    <input type="file" name="upLoad">
    <br>
    <input type="submit" value="提交" style="margin-top: 20px">
</form>
</div>
</body>
</html>
