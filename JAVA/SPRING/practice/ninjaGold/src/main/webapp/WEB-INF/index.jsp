<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>

<p> your gold : <c:out value="${gold}"/></p>
<form action="/" method="post">
		<input type="Submit" value="Reset" class="btn" name="reset">
		</form>
<div class="container">
	<div class="box">
		<h3>Farm</h3>
		<p>Earn (0-20 gold)</p><br>
	
		<form>
		<input type="Submit" value="Find gold" class="btn" name="farm" >
		</form>
		
		
	</div>
	<div class="box">
	<h3>Cave</h3>
	<p>Earn (5-10 gold)</p><br>
	
		<form>
		<input type="Submit" value="Find gold" class="btn" name="cave" >
		</form>
		
	</div>
	<div class="box">
			<h3>House</h3>
			<p>Earn (2-5 gold)</p><br>
		
		<form>
		<input type="Submit" value="Find gold" class="btn" name="house" >
		</form>
	
	</div>
	<div class="box">
		<h3>Quest</h3>
		<p>Earn / takes (0-50 gold)</p>
	
		<form>
		<input type="Submit" value="Find gold" class="btn" name="quest" >
		</form>
	
		
	</div>
	<div class="box">
		<h3>Spa</h3>
		<p>takes (5-20 gold)</p><br>
	
		<form>
		<input type="Submit" value="Find gold" class="btn" name="spa" >
		</form>
	
		
	</div>
	
	</div>
	<h3> Activities :</h3>
	<iframe src="/activities" title="Activities iframe"></iframe>

</body>
</html>