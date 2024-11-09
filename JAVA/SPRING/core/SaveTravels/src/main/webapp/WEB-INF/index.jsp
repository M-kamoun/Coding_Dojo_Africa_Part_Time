<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>ITravels</title>



</head>
<body>
	<div class="container mt-5">
		<h1>Save Travels</h1>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<td><a href="/expenses/${expense.id}"><c:out
									value="${expense.name}" /></a></td>
						<td><c:out value="${expense.vendor}" /></td>
						<td>$<fmt:formatNumber type="number" maxFractionDigits="2"
								minFractionDigits="2" value="${expense.amount}" /></td>
						<td class="d-flex  align-items-center">
						<a class="btn btn-success ms-2"
							href="/expenses/edit/${expense.id}">EDIT</a>
							
							<form action="/expenses/${expense.id}" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input type="submit" class="btn btn-danger ms-2" value="DELETE">
							</form></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<h2>Add an Expense</h2>
		<form:form action="/addExpense" mode="post" modelAttribute="expense">
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
			<div>
				<input type="submit" value="Submit" class="btn btn-primary mt-3" />
			</div>
		</form:form>
	</div>




</body>
</html>