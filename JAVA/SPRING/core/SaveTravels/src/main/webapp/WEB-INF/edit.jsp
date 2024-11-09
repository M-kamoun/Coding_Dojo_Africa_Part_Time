<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Expense Edit</title>
</head>
<body>
	<div class="container w-50 mt-5">
	<div class="d-flex  justify-content-between align-items-center">
	<h1 class="text-success">Edit expense</h1>
	<a href="/">Go back</a>
	</div>
	
		<form:form action="/update/${expense.id}" method="post"
			modelAttribute="expense">
			<input type="hidden" name="_method" value="put">
			<div class="form-group">
				<form:label path="name" class="form-label">Expense Name:</form:label>
				<br>
				<form:errors path="name" class="text-danger" />
				<form:input path="name" class="form-control" style="width:250px;" />
			</div>
			<div class="form-group">
				<form:label path="vendor" class="form-label">Vendor Name:</form:label>
				<br>
				<form:errors path="vendor" class="text-danger" />
				<form:input path="vendor" class="form-control" style="width:250px;" />
			</div>
			<div class="form-group">
				<form:label path="amount" class="form-label">Amount:</form:label>
				<br>
				<form:errors path="amount" class="text-danger" />
				<form:input path="amount" step="0.01" min="0" class="form-control"
					style="width:250px;" />

			</div>
			<div class="form-group">
				<form:label path="description" class="form-label">Description:</form:label>
				<br>
				<form:errors path="description" class="text-danger" />
				<form:textarea path="description" class="form-control" rows="3"
					style="width:250px;" />
			</div>
			<div class="d-flex justify-content-end">
				<input type="submit" value="Submit" class="btn btn-success mt-3  " />
			</div>
		</form:form>

	</div>
</body>
</html>