<%--
  Created by IntelliJ IDEA.
  User: paddy
  Date: 2017-2-27
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/resources/css/main.css"
          type="text/css" />
    <title>Admin 界面测试</title>

    <link>
</head>
<body>
<h1>模拟登录界面</h1><hr>
<form name="mainForm" action="/test/save" method="post">
    <tr>
        <td>名字:</td>
        <td><input name="name" type="text" value=""></td>
    </tr>
    <tr>
        <td>年龄:</td>
        <td><input name="age" type="text" value=""/> </td>
    </tr>
    <tr>
        <td>性别:</td>
        <td><input name="sex" type="text" value=""></td>
    </tr>
    <tr>
        <tb><input type="submit" value="确认"></tb>
    </tr>
</form>
</body>
</html>
