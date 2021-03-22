<%--
  Created by IntelliJ IDEA.
  User: 75230
  Date: 2021/3/22
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录</h1>
${msg}
<form action="<c:url value='/loginServlet'/>" method="post">
    用户名：<input type="text" name="username"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
