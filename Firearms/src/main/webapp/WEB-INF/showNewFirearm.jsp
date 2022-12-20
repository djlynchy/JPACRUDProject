<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Showing Firearm</title>
</head>
<jsp:include page="navbar.jsp"><jsp:param value="" name="" /></jsp:include>
<br>
<body style="background-color: #9BAD8B">
	<br>
	<div class="container-fluid" style="padding-top: 2in;">
		<div class="row row-no-gutters">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">
				<h3 style="font-family:Apple Chancery, Charcoal, cursive; ">
					<strong>${firearm.name}</strong>
				</h3>

				<p>
					<strong>Caliber: </strong>${firearm.caliber}</p>
		
				<p>
					<strong>Operation: </strong>${firearm.operation}</p>
				<p>
					<strong>Capacity: </strong>${firearm.capacity} rounds</p>
				
				<p>
					<strong>Type: </strong>${firearm.type}
				</p>
				

				<br>
				<form action="updateFirearmForm.do" method="GET">
					<input type='hidden' name='id' id='id' value='${firearm.id}' />
					<button type="submit" class="btn btn-success">Update</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>