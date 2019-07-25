<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@include file="/WEB-INF/resources/css/templatemo_style.css"%></style>
</head>
 <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>
<h3 align="center" style="color: red;">${requestScope.status}</h3>
<sf:form method="post" modelAttribute="customer" style="border:1px solid #ccc">
<table style="/* background-color: */ cyan; margin: auto;">
			<tr>
				<td>Enter Name</td>
				<td><sf:input  path="customeName" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><sf:input  path="customerEmail" /></td>
			</tr>
			<tr>
				<td>Enter Phone No</td>
				<td><sf:input  path="customerPhone" /></td>
			</tr>
			<tr>
				<td>Enter UserName</td>
				<td><sf:input  path="userName" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><sf:password path="password" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><sf:textarea path="address" /></td>
			</tr>
			
		<%-- 	<tr>
				<td>Choose Role</td>
				<td><sf:radiobutton path="role" value="admin" />Admin</td>
				<td><sf:radiobutton path="role" value="vendor" />Customer</td>
			</tr>
			 --%>

			<tr>
				<td><input type="submit" value="Register Me" /></td>


			</tr>
		</table>
</sf:form>

</body>
</html>
