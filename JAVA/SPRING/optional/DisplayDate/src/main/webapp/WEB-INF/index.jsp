<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
	
<title>Dashboard</title>
</head>
<body>
<div>
<a href="<c:out value="${date}"></c:out>">Date Template</a>
<a href="<c:out value="${time}"></c:out>">Time Template</a>
</div>
<script type="text/javascript" src="/js/app.js"></script>
</body>
</html>