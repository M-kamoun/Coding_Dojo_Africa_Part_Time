<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
<h1 class="center"> Here's your Omikuji</h1>
<h3><c:out value="${show}" /></h3>
<div class="center" >
<a href="/omikuji">Go Back</a>
</div>


</body>
</html>