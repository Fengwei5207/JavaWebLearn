<%@ page import="com.test.bean.Product" %><%--
  Created by IntelliJ IDEA.
  User: XiaLuo
  Date: 2023/11/24
  Time: 15:37
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
          float price = 27.5f;

      %>
      
      <jsp:useBean id="product" class="com.test.bean.Product" scope="page"/>"
      <jsp:setProperty name="product" property="num" value="1"/>
      <jsp:setProperty name="product" property="price" value="2"/>
      <jsp:getProperty name="product" property="total"/>

</div>
  </body>
</html>
