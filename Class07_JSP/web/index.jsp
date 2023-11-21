<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/17
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .body {
            text-align: center;
        }

    </style>
</head>
<body>

<div class="body">
    <div>
        <div>获取当前时间</div>
        <div>Time:</div>
        <%
            Date date = new Date();
            out.print(date);
        %>
        <%=date.toLocaleString()%>
    </div>
    <div style="margin-top: 20px">
        通过JSP判断当前是上午还是下午
        <br>
        <%
            if (Calendar.getInstance().get(Calendar.AM_PM) == Calendar.AM) {
        %>
        上午好
        <%
        } else {
        %>
        下午好
        <%
            }
        %>

    </div>
    <div style="margin-top: 20px; text-align: left;">
        <div>九九乘法表</div>
        <%
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= i; j++) {
        %>
        &nbsp;
        <%=j+"*"+i+"="+j*i%>
        <%
            }
        %>
        <br>

        <%
            }
        %>

    </div>

    <div>
        <%!
            int count = 0;
            void setCount(){
                count++;
            }

        %>
        <%
            setCount();
            out.print(count);

        %>

    </div>

    <div>
        <%

        %>
    </div>

</div>


</body>
</html>
