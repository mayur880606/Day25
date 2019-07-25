
<%-- <style><%@include file="/WEB-INF/resources/css/templatemo_style.css"%></style> --%>

<%@ include file="/WEB-INF/views/template/header.jsp"%>
<body style="background-color:powderblue;">
		<div class="page-header">
			<h1>Administrator Page</h1>
           <h1>name of admin is :: ${sessionScope.user_dtls}</h1>
			<p class="lead">Welcome to Administrator page!</p>
		</div>
	
		<h3>
			<a href="<c:url value="/admin/booklist"/>">Book Inventory</a>
		</h3>
		
		<p>Here you can view, check and modify the book inventory</p>
		
		<br><br>
		
		<h3>
			<a href="<c:url value="/admin/customer"/>">Customer Management</a>
		</h3>
		
		<p>Here you can view the customer information!!!</p>
		
		</body>
<%@ include file="/WEB-INF/views/template/footer.jsp"%>