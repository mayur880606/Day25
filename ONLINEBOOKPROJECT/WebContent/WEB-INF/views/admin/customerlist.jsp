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
	        <th>CustomerName</th>
	        <th>CustomerEmail</th>
	        <th>CustomerPhone</th>
	        <th>UserName</th>
	        <th>Address</th>
	        
	      </tr>
	    </thead>
		<tbody>
			<c:forEach var="c" items="${requestScope.book_list}">

				<tr>
					<td>${c.customeName}</td>
					<td>${c.customerEmail}</td>
					<td>${c.customerPhone}</td>
					<td>${c.userName}</td>
					<td>${c.address}</td>
					<td><a href="<spring:url value='/admin/update?customer_id=${c.customer_id}'/>">Update</a></td>
					<td><a href="<spring:url value='/admin/delete?customer_id=${c.customer_id}'/>">Delete</a></td>

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