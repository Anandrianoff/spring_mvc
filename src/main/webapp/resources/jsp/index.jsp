<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello exam</title>
</head>
<body>
    <sf:form action="/users/add" method="post" modelAttribute="user">
        <sf:input path="name"/><sf:errors path="name"></sf:errors><br>
        <input type="submit" value="Goo">
    </sf:form>
</body>
</html>
