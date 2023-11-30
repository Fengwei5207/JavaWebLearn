<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>Error Demo</h1>
    <%
    exception.printStackTrace(response.getWriter());

    out.print("<br>"+exception.getMessage());
    %>

</div>
</body>
</html>
