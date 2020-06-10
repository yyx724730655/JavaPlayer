<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YYX
  Date: 2020-5-18
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../student/addCourse" method="post">
    <input type="text" id="sid" name="sid" value="${sid}">
    <table border="1" cellspacing="0" cellpadding="0">
        <c:forEach items="${courseList}" var="coul">
            <tr>
                <td><input type="checkbox" id="couid" name="couid" value="${coul.couid}" >${coul.couname}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
