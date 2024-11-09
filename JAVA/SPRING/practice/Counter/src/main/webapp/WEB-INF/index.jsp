<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome User</h1>
<a href="/counter">Increment +1</a><br>
<a href="/counter2">Increment+2</a><br>

<a href="/reset" onclick="alert('Reset counter')">RESET COUNTER</a>
</body>
</html>  