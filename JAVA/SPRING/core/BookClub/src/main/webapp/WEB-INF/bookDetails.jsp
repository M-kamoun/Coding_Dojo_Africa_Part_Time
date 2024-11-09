<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details</title>
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
				<c:out value="${book.title}" />
			</h1>

			<a href="/books">&lt;&lt;Back to shelves</a>


		</div>
		<p>
			<span style="color: red;"><c:out value="${book.user.userName}" /></span>
			<span><strong> read</strong></span> <span style="color: purple;"><strong><c:out
						value="${book.title}" /> </strong></span> <span><strong> by </strong></span> <span
				style="color: green;"><strong><c:out
						value="${book.author}" /> </strong></span>
		</p>
		<h4>
			Here are
			<c:out value="${book.user.userName}" />
			's thoughts :
		</h4>
		<br>

		<div class="row">
			<div class="col-md-8">

				<div class="card  p-3 border border-primary">
					<c:out value="${book.thoughts}" />

				</div>
				<div class="d-flex justify-content-end mt-5">
					<form action="/books/${book.id}/edit" method="post">
				
						<input type="submit" class="btn btn-success mx-3" value="UPDATE" 
						<c:if test="${book.user.id != user.id}">disabled </c:if> style="cursor: pointer;" /> 
					</form>
					
						
					<form action="/books/${book.id}/delete" method="post">
					 <input type="hidden" name="_method" value="delete">
						<input type="submit"
							class="btn btn-danger" value="DELETE"
							<c:if test="${book.user.id != user.id}">disabled </c:if>
							style="cursor: pointer;" />
					</form>
					</div>

			


			</div>

		</div>




	</div>





</body>
</html>