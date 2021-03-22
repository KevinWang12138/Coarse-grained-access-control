<%--
  Created by IntelliJ IDEA.
  User: 75230
  Date: 2021/3/22
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎，会员你好！</h1>
<a href="<c:url value='/users/u.jsp'/>">会员入口</a><br/>
<a href="<c:url value='/admin/a.jsp'/>">管理员入口</a><br/>
<a href="<c:url value='/index.jsp'/>">游客入口</a><br/>
</body>
</html>
