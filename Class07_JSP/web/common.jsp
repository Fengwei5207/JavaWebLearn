<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/21
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p>
        <%--    在页面翻译期间引入文件，可以是jsp、HTML或文本文件--%>
        <%@ include file="Title.jsp" %>
    </p>
    <p>
        <%
            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            out.println(date);
        %>
    </p>
    <p>
        <%@include file="footer.jsp"%>
    </p>

</div>
</body>
</html>
