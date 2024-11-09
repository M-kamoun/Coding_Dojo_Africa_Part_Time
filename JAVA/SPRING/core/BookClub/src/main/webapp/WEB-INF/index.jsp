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

<title>Books Club</title>

</head>
<body>
	<div class="container mt-3">
		<h1 class="text-primary">Books Club</h1>
		<h5>A place for friends to share thoughts on books</h5>


		<div class="row mt-5" style="min-height: 100vh;">
			<div class="col-md-6 mb-5">
				<div class="card shadow p-5">


					<h3 class="text-center font-weight-bold text-uppercase mb-3">Register</h3>
					<form:form action="/register" mode="post" modelAttribute="newUser">

						<div class="form-group">
							<form:label path="userName">User Name:</form:label>
							<br>
							<form:errors path="userName" class="text-danger" />
							<form:input class="form-control" path="userName" />
						</div>
						<div class="form-group">
							<form:label path="email">Email:</form:label>
							<br>
							<form:errors path="email" class="text-danger" />
							<form:input class="form-control" path="email" />
						</div>


						<div class="form-group">
							<form:label path="password">Password:</form:label>
							<br>
							<form:errors path="password" class="text-danger" />
							<form:input type="password" class="form-control" path="password" />
						</div>
						<div class="form-group">
							<form:label path="confirm">Confirm Password:</form:label>
							<br>
							<form:errors path="confirm" class="text-danger" />
							<form:input type="password" class="form-control" path="confirm" />
						</div>


						<div>
							<input type="submit"
								class="btn btn-outline-dark btn-block rounded-pill mt-3 w-100"
								value="Submit" />
						</div>
					</form:form>

				</div>

			</div>

			<div class="col-md-6 mb-5">

				<div class="card shadow p-5">
					<h3 class="text-center font-weight-bold text-uppercase mb-3">Login</h3>
					<form:form action="/login" mode="post" modelAttribute="newLogin">


						<div class="form-group">
							<form:label path="email">Email:</form:label>
							<br>
							<form:errors path="email" class="text-danger" />
							<form:input class="form-control" path="email" />
						</div>
						<div class="form-group">
							<form:label path="password">Password:</form:label>
							<br>
							<form:errors path="password" class="text-danger" />
							<form:input type="password" class="form-control" path="password" />
						</div>



						<div>
							<input type="submit"
								class="btn btn-outline-dark btn-block rounded-pill mt-3 w-100"
								value="Submit" />
						</div>
					</form:form>

				</div>

			</div>

		</div>

	</div>
</body>
</html>