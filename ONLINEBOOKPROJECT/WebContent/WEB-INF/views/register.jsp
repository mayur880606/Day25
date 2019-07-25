<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><i>REGISTER</i></h1>
	<sf:form method="post" modelAttribute="vendor">
		<div class="form-group">
				<label for="name">Name:</label>
				<sf:input path="customerName" id="name" class="form-Control" />
			</div>
			<div class="form-group">
				<label for="email">Email:</label><span style="color:#ff0000">${emailMsg}</span>
				<sf:input path="customerEmail" id="email" class="form-Control" />
			</div>
			<div class="form-group">
				<label for="phone">Phone:</label>
				<sf:input path="customerPhone" id="phone" class="form-Control" />
			</div>
			<div class="form-group">
				<label for="username">Username:</label><span style="color:#ff0000">${usernameMsg}</span>
				<sf:input path="userName" id="Username" class="form-Control" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<sf:password path="password" id="password" class="form-Control" />
			</div>
			<div class="form-group">
				<label for="address">Address:</label>
				<sf:password path="address" id="address" class="form-Control" />
			</div>
	</sf:form>

</body>
</html>