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
<h2>添加Student</h2>
<form action="../student/addStudent" method="post">
    <input id="sname" name="sname"/>名字
    <input id="sex" name="sex"/>性别
    <input id="birthday" name="birthday"/>生日
    <select id="classesid" name="classesid">班级
        <c:forEach items="${classesList}" var="cl">
            <option value="${cl.cid}">${cl.cname}</option>
        </c:forEach>
    </select>
    <input type="submit" value="提交">
</form>

</body>
</html>
