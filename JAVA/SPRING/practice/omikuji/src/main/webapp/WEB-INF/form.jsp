<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>

	<h1 class="center">Send an Omikuji</h1>

	<form action='/submitData' method='POST'>
		<div>
			<label for='number'>Pick any number from 5 to 25</label> 
			<input type="number" name='number' id='number' min='5' max='25'>
		</div>
		<div>
			<label for='city'>Enter a name of any city</label> 
			<input type="text" name='city' id='city'>
		</div>
		<div>
			<label for='person'>Enter a name of any real person</label> 
			<input type="text" name='person' id='person'>
		</div>
		<div>
		<label for="hobby">Enter professional endeavor or hobby</label>
		<input type="text" name="hobby" id='hobby'/>
	</div>
	
	<div>
		<label for="livingThing'">Enter any type of living thing</label>
		<input type="text" name="livingThing" id='livingThing'/>
	</div>
	<div>
		<label for="message">Say something nice to someone:</label>
		<textarea name="message" id="messsage" cols="30" rows="10"></textarea>
	</div>
	
	<div>
		<p>Send and show a friend!</p>
		
		<input type="submit" value="Send"/>
	</div>
		
	</form>
</body>
</html>