<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YYX
  Date: 2020-05-21
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示班级的所有学生</title>
</head>
<body>
<h2>展示班级的所有学生</h2>
<table border="1" cellpadding="0" cellspacing="0">
    <c:forEach items="${stuList}" var="sl">
        <tr>
            <td>${sl.sname}</td>
            <td>${sl.sex}</td>
            <td>${sl.birthday}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
