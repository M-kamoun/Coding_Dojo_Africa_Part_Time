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

<title>Book SHELVES</title>
</head>
<body>
	<div class="container mt-5">
		<div class="d-flex justify-content-between align-items-center">
			<div>
				<h1>
					Welcome,
					<c:out value="${user.userName}" />
				</h1>

				<p>Books from everyone's shelves</p>
			</div>
			<div>
				<a href="/logout" class="mx-5">&larr;logout</a> <a href="/books/new">+Add
					a Book to my Shelf New </a>
			</div>
		</div>

		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted by</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
					<tr>
						<td><c:out value="${book.id}" /></td>
						<td><a href="/books/${book.id}"><c:out
									value="${book.title}" /></a></td>
						<td><c:out value="${book.author}" /></td>
						<td><c:choose>


								<c:when test="${book.user.id == user.id}">
									<span style="color: blue"><c:out
											value="${book.user.userName}" /></span>
								</c:when>
								<c:otherwise>
									<c:out value="${book.user.userName}" />
								</c:otherwise>
							</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>

</body>
</html>