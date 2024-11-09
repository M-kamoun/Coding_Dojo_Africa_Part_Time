<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new book</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
		<div class="d-flex justify-content-between align-items-center">
		
				<h1>
					Add a Book to your shelf
				</h1>

				<a href="/books">&lt;&lt;Back to shelves</a>
				
			
		</div>
		
	
<form:form action="/addbook" mode="post" modelAttribute="book">
	<div>
		<form:label path="title">Title:</form:label><br>
		<form:errors path="title" class="text-danger"/>
		<form:input path="title" style="width:250px;"/>
	</div>
	<div>
		<form:label path="author">Author:</form:label><br>
		<form:errors path="author" class="text-danger"/>
		<form:input path="author" style="width:250px;"/>
	</div>
	<div>
		<form:label path="thoughts">My thoughts</form:label><br>
		<form:errors path="thoughts" class="text-danger"/>
		<form:textarea path="thoughts" rows="3" style="width:250px;"/>
	</div>
	
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
		
		</div>

</body>
</html>