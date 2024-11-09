<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<title>Add Dojo</title>

</head>
<body>
<div class="container mt-5">
<h2>Add new Dojo</h2>

<form:form action="/addDojo" mode="post" modelAttribute="dojo">
	<div>
		<form:label path="name">Name:</form:label><br>
		<form:errors path="name" class="text-danger"/>
		<form:input path="name" style="width:250px;"/>
	</div>
	
	
	
	<div>
		<input class="mt-2 btn btn-primary" type="submit" value="submit"/>
	</div>
</form:form>

<br>
<h1>Dojos</h1>
<table class="table table-striped table-bordered w-25">
	<thead>
		<tr>
			<th>Dojo  Name</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dojo" items="${dojos}">
			<tr>
				<td><c:out value="${dojo.name}"/></td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>

</div>




</body>
</html>