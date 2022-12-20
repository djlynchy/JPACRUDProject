<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All firearms</title>
<style type="text/css">
.
</style>
<link href="css/styles.css" rel="stylesheet" />
</head>
<jsp:include page="navbar.jsp"><jsp:param value="" name="" />
</jsp:include>
<body style="background-color: #778899">
	<div class="container-fluid">
		<div class="row row-no-gutters">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">
				<c:forEach items="${firearm}" var="firearm">
					

						<br>
						<br>
						<form action="getFirearm.do" method="GET">
							<input type='hidden' name='id' id='id' value='${firearm.id}' />
							<button type="submit" class="btn btn-success">See Firearm
								Details</button>
						</form>


						<div>
							<h3 style="font-family: Apple Chancery, Charcoal, cursive;">${firearm.name}</h3>

						</div>
						<br>
						
						<form action="deleteFirearm.do" method="GET">
					<input type='hidden' name='id' id='id' value='${firearm.id}' />
					<button type="submit" class="btn btn-danger">Delete</button>
				</form>

				
					<hr>
				</c:forEach>
			</div>
			<div class="col-xs-6 col-md-4"></div>
		</div>
	</div>
</body>
</html>