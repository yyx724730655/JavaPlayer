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
<h2>这里是查看所有Student页面</h2>
<table id="studentTable" border="1">
    <c:forEach items="${list}" var="studentList">
        <tr>
            <td>${studentList.sname}</td>
            <td>${studentList.sex}</td>
            <td>${studentList.birthday}</td>
            <td>${studentList.cid}</td>
            <td>${studentList.courseList}</td>
            <td><a href="selectCourse?sid=${studentList.sid}">选择课程</a> </td>
            <td><a href="deleteStudent?sid=${studentList.sid}">删除学生</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
