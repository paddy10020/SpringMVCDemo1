<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>我不是真正的慕课网</title>

    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/resources/css/main.css"
          type="text/css" />
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/resources/js/jquery-1.11.3.min.js">
    </script>


</head>
<body>
<script>
    jQuery(function($) {
        var urlStr = "<%=request.getContextPath()%>/test/123";
        $.ajax({
            method:"GET",
            url:urlStr,
            success:function (data) {
                var person = data;
                $(".person-name").html(person.name);
                $(".person-age").text(person.age);
                $(".person-sex").text(person.sex);
            }
        })
    });
</script>
<h1>json格式数据测试</h1><br>

<%--<input type="button" onclick="toJson()">--%>
<p class="person-name"></p>
<p class="person-age"></p>
<p class="person-sex"></p>
</body>
</html>