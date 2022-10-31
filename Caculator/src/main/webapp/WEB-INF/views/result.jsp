<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Kết quả</title>
</head>
<body>
<h2> Kết Quả</h2>
<ol>
    <label for="a"></label>
    <input id="a" type="number"  name="a" value="${a}" style="width: 300px">
    <label for="b"></label>
    <input id="b" type="number"  name="b" value="${b}" style="width: 300px">
    <label for="result1"></label>
    <input id="result1" type="number"  name="result"  value="${result1}" style="width: 300px">
    <label for="result2"></label>
    <input id="result2" type="number"  name="result"  value="${result2}" style="width: 300px">
    <label for="result3"></label>
    <input id="result3" type="number"  name="result"  value="${result3}" style="width: 300px">
    <label for="result4"></label>
    <input id="result4" type="number"  name="result"  value="${result4}" style="width: 300px">
</ol>
</body>
</html>
