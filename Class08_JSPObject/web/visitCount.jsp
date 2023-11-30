<%--
  Created by IntelliJ IDEA.
  User: XiaLuo
  Date: 2023/11/24
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VisitCount</title>
</head>
<body>
<div>
    <%
    int pageCount = 1;
    int sessionCount = 1;
    int appCount = 1;
    if (pageContext.getAttribute("sessionCount")!= null){
        sessionCount = Integer.parseInt(pageContext.getAttribute("sessionCount").toString());
        sessionCount++;
    }
    if (pageContext.getAttribute("pageCount")!= null){
        pageCount = Integer.parseInt(pageContext.getAttribute("pageCount").toString());
        pageCount++;
    }
    if (pageContext.getAttribute("appCount")!= null){
        appCount = Integer.parseInt(pageContext.getAttribute("appCount").toString());
        appCount++;
    }
    pageContext.setAttribute("pageCount",pageCount);
    session.setAttribute("sessionCount",sessionCount);
    application.setAttribute("appCount",appCount);
    out.print(pageContext.getAttribute("pageCount"));
    out.print(session.getAttribute("sessionCount"));
    out.print(application.getAttribute("appCount"));

    %>

</div>
</body>
</html>
