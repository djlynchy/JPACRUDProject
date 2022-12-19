<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new Firearm</title>
</head>
<jsp:include page="navbar.jsp"><jsp:param value="" name="" /></jsp:include>
<br>
<body style="background-color: #41C5EE">

	<br>
	<div class="container-fluid" style="padding-top: 2in;">
		<div class="row row-no-gutters">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">



				<form:form action="createFirearm.do" method="POST"
					modelAttribute="firearm">
					<div class="form-row">
						<div class="form-group col-md-6">
							<form:label path="name">Name</form:label>
							<form:input type="text" class="form-control" required="required"
								path="name" placeholder="Name" />
						</div>
						<div class="form-group col-md-6">
							<form:label path="caliber">Caliber</form:label>
							<form:input type="text" class="form-control" path="caliber"
								placeholder="Caliber" />
						</div>
					</div>
					<div class="form-group col-md-6">
						<form:label path="operation">Operation</form:label>
						<form:input type="text" class="form-control" path="operation"
							placeholder="Operation" />
					</div>
					<div class="form-group col-md-6">
						<form:label path="type">Type</form:label>
						<form:input type="text" class="form-control" path="type"
							placeholder="Type" />
					</div>

					<div class="form-group col-md-6">
						<form:label path="capacity">Capacity</form:label>
						<form:input type="text" class="form-control" path="capacity"
							placeholder="Capacity" />
					</div>

					<br>
					<br>
					<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
			</div>


		</div>

	</div>



</body>
</html>