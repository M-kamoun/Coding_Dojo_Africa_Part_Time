<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>List of books</title>
</head>
<body>

  

<div  class="container">
<h1>List of books</h1>
<table class="table table-striped">


    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="oneBook" items="${books}">
         <tr>
          <td><c:out value="${oneBook.id}"></c:out></td>
         <td><a href="books/${oneBook.id}"><c:out value="${oneBook.title}"></c:out></a></td>
         <td><c:out value="${oneBook.description}"></c:out></td>
         <td><c:out value="${oneBook.language}"></c:out></td>
         <td><c:out value="${oneBook.numberOfPages}"></c:out></td>
         
         
         </tr>
         
         
         </c:forEach>
    </tbody>
</table>
</div>



</body>
</html>