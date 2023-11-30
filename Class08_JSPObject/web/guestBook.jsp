<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2023/11/23
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <div>
        <form action="guestBook.jsp" method="post">
            <p>user<input type="text" name="username"></p>
            <p>msg<textarea rows="3" cols="30" name="msg"></textarea></p>
            <p><input type="submit" value="提交"></p>

        </form>

        <%
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("username");
            String msg = request.getParameter("msg");

            List<String> msgs = (ArrayList<String>) application.getAttribute("msgs");
            if (msgs == null) {
                msgs = new ArrayList<>();
            } else {
                msgs.add(name + ":" + msg);
            }
            application.setAttribute("msgs", msgs);
            out.print("-------留言板-------<br>");
            for (String msg1 : msgs) {
                out.println(msg1 + "<br>");

            }


        %>
    </div>

</div>
</body>
</html>
