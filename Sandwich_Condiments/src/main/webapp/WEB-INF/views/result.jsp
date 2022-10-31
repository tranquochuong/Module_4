<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Kết quả</title>
</head>
<body>
<h2> Gia vi duoc chon</h2>
<ol>
    <c:forEach items="${condiment}" var="c">
        <li>
            <c:out value="${c}"/>
        </li>
    </c:forEach>
</ol>
</body>
</html>
