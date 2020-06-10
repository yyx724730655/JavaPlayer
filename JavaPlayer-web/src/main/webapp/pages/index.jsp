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
<h2>这里是初始页面</h2>
<table border="1">
    <tr>
        <td>学生</td>
        <td><a href="${pageContext.servletContext.contextPath}/student/findAllStudent" >查看所有Student</a></td>
        <td><a href="${pageContext.servletContext.contextPath}/student/showAddStudent" >添加Student</a></td>
    </tr>
    <tr>
        <td>账户</td>
        <td><a href="${pageContext.servletContext.contextPath}/account/findAll" >查看所有Account</a></td>
    </tr>
    <tr>
        <td>班级</td>
        <td><a href="${pageContext.servletContext.contextPath}/classes/findAllClasses" >查看所有Classes</a></td>
        <td><a href="${pageContext.servletContext.contextPath}/classes/showAddClasses" >添加Classes</a></td>
    </tr>
    <tr>
        <td>课程</td>
        <td><a href="${pageContext.servletContext.contextPath}/course/showAll" >查看所有Course</a></td>
        <td><a href="${pageContext.servletContext.contextPath}/course/showAdd" >添加Course</a></td>
    </tr>
</table>
</body>
</html>
