<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Burger details</title>
</head>
<body>
<h1><c:out value="${burger.name}"/></h1>
<p> Description : <c:out value="${burger.restaurant}"/></p>
<p> Language : <c:out value="${burger.rating}"/> </p>
<p> Number of pages : <c:out value="${burger.notes}"/> </p>
</body>
</html>