<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/23
  Time: 16:27
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
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("username");
    String pwd = request.getParameter("pwd");
    StringBuffer msg = new StringBuffer();
    if (name.isEmpty()){
        msg.append("用户名不能为空");
    }
    if (pwd.isEmpty()){
        msg.append("密码不能为空");
    }else{
        if (pwd.length()<6||pwd.length()>12){
            msg.append("密码长度为6-12位");
        }
    }
    if (msg.length()==0){
        out.print("登录成功");
    }else{
        request.setAttribute("msg",msg.toString());
    %>
    <jsp:forward page="login.jsp" ></jsp:forward>

    <%
    }
    %>
</div>


</body>
</html>
