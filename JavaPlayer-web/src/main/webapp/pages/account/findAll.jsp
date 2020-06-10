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
<h2>这里是查看所有Account页面</h2>
<table id="acTable" border="1">
    <c:forEach items="${list}" var="acList">
        <tr>
            <td>${acList.aname}</td>
            <td>${acList.money}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
