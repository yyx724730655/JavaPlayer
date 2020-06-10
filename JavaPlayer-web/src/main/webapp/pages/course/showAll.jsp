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
<h2>这里是查看所有Course页面</h2>
<table id="couTable" border="1">
    <c:forEach items="${couList}" var="couList">
        <tr>
            <td>${couList.couname}</td>
            <td><a href="delete?couid=${couList.couid}" >删除</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
