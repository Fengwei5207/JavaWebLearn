<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/21
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="people" class="com.imut.bean.people" scope="request">
        <jsp:setProperty name="people" property="name" param="name"/>
    </jsp:useBean>
    <jsp:getProperty name="people" property="name"/>
</body>
</html>
