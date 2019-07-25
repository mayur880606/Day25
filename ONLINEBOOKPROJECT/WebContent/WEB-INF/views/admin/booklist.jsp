<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style><%@include file="/WEB-INF/resources/css/templatemo_style.css"%></style>
</head>
<body>
<h4>Last Action Status : ${requestScope.status}</h4>
<div class="container">
	<h3>Book List</h3>
	<table class="table table-striped">
		 <thead>
	      <tr>
	        <th>BookName</th>
	        <th>BookDescription</th>
	        <th>BookPublication</th>
	        <th>bookCondition</th>
	        <th>bookPrice</th>
	        <th>bookInStock</th>
	      </tr>
	    </thead>
		<tbody>
			<c:forEach var="b" items="${requestScope.book_list}">

				<tr>
					<td>${b.bookName}</td>
					<td>${b.bookDescription}</td>
					<td>${b.bookPublication}</td>
					<td>${b.bookCondition}</td>
					<td>${b.bookPrice}</td>
					<td>${b.bookInStock}</td>
	
					<td><a href="<spring:url value='/admin/update?bookId=${b.bookId}'/>">Update</a></td>
					<td><a href="<spring:url value='/admin/delete?bookId=${b.bookId}'/>">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h5>
		<a href="<spring:url value='/admin/AddBook'/>">Add a New Book</a>
	</h5>
</div>
</body>
</html>