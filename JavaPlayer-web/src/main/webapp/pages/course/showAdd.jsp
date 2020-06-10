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
<h2>添加Course</h2>
<form action="../course/addCourse" method="post">
    <input id="couname" name="couname"/>课程名称
    <input type="submit" value="提交">
</form>

</body>
</html>
