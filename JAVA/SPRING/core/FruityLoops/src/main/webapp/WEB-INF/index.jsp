<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>Fruit Store</title>
</head>
<body>

	<h1 class="text-center my-4">Fruit Store</h1>
	<div class="container ">

		<table class="table table-bordered text-left w-50 mx-auto">
			<thead class="table-primary">
				<tr>
					<th>Name</th>
					<th>Price</th>

				</tr>
			</thead>
			<tbody>
				<!-- loop our items-->
				<c:forEach var="oneItem" items="${items}">

					<tr>

						<!--  Without ninja Bonus: 
					<td><c:out value="${oneItem.name}"></c:out></td>
			-->

						<!-- whit Ninja bonus : 
			change the font color of every fruit that starts with the letter 'G' to orange.
			
			 -->

						<td><c:choose>

								<c:when test="${oneItem.name.startsWith('G')}">

									<span style="color: orange;"> <c:out
											value="${oneItem.name}"></c:out>
									</span>

								</c:when>
								<c:otherwise>
									<c:out value="${oneItem.name}"></c:out>
								</c:otherwise>

							</c:choose></td>



						<td><c:out value="${oneItem.price}"></c:out></td>

					</tr>

				</c:forEach>
			</tbody>



		</table>
	</div>


</body>
</html>