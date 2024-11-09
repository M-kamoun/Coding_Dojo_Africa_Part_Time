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

<c:forEach var="activity" items="${activities}">
	<c:choose>
		<c:when test="${activity.contains('lost')}">
			<p style="color:red;"><c:out value="${activity}"></c:out></p>		
		</c:when>
		<c:otherwise>
			<p style="color:green;"><c:out value="${activity}"></c:out></p>
		</c:otherwise>
	</c:choose>

   
</c:forEach>

</body>
</html>