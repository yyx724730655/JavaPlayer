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
    <title>信息</title>
    <script type="text/javascript">
        var info="${info}";
        if (info != null && info.length > 0) {
            alert(info);
            window.location.href="findAllClasses";
        }
    </script>
</head>
<body>

</body>
</html>
