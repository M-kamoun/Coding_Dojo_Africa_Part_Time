<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Expense Detail</title>
</head>
<body>

<div class="container mt-5"> 
<div class="d-flex  justify-content-between align-items-center">
	<h1 class="text-primary my-3">Expense details</h1>
	<a href="/">Go back</a>
	</div>

<table class="table table-striped table-bordered w-50">

		<tbody>

			

			<tr>
				<th>Expense Name :</th>
				<td><c:out value="${expense.name}" /></td>
			</tr>
			<tr>
				<th>Description :</th>
				<td><c:out value="${expense.description}" /></td>
			</tr>
			<tr>
				<th>Vendor Name :</th>
				<td><c:out value="${expense.vendor}" /></td>
			</tr>
			<tr>
				<th>Amount Spent :</th>
				<td>$<fmt:formatNumber type="number" maxFractionDigits="2"
						minFractionDigits="2" value="${expense.amount}" /></td>

			</tr>

		</tbody>
	</table>


</div>

	




</body>
</html>