<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YYX
  Date: 2020-05-21
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找所有Classes</title>
</head>
<body>
    <table border="1" cellspacing="0" cellpadding="0">
        <c:forEach items="${list}" var="cl">
            <tr>
                <td>${cl.cid}</td>
                <td>${cl.cname}</td>
                <td><a href="showStudent?cid=${cl.cid}">查找该班级的学生</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
