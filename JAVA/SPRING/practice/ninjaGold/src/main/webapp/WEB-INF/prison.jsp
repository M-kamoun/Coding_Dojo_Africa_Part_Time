<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="img/prison-png.png" alt="prison" width="150px" height="150px"/>
<p> your debt : 
<c:out value="${gold}"></c:out>
</p>
<p>
<c:out value="${message}"></c:out>
</p>
<form action="/payDebt" method="post">
		<input type="Submit" value="pay your debt" class="btn" name="reset">
		</form>
		
</body>
</html>