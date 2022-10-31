<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/27/2022
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>

<form action="/result" method="get">
    <input type="number" placeholder="a" name="a" style="width: 300px">
    <input type="number" placeholder="b" name="b" style="width: 300px">

    <button type="submit" value="Add">Addition(+)</button>
    <button type="submit" value="Sub">Subtraction(-)</button>
    <button type="submit" value="Mul">Multiplication(X)</button>
    <button type="submit" value="Div">Division(-)</button>

</form>
</body>
</html>
