<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Showing firearm</title>
</head>
<jsp:include page="navbar.jsp"><jsp:param value="" name=""/></jsp:include>
	<br>
<body style="background-color: #4682B4">

<div class="container-fluid" style="padding-top:2in;">
		<div class="row row-no-gutters">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">
				<h3 style="font-family:Impact, Charcoal, sans-serif; ">
					<strong>${Firearm.name}</strong>
				</h3>
				<form action="updateFirearmForm.do" method="POST">
					<input type='hidden' name='id' id='id' value='${firearm.id}' />
					<button type="submit" class="btn btn-success">Update</button>
				</form> 
				<br>
				<p>
					<strong>Caliber: </strong>${Firearm.caliber}</p>
		
				<p>
					<strong>Operation: </strong>${Firearm.operation}</p>
				<p>
					<strong>Capacity: </strong>${Firearm.capacity} Rounds</p>
				
				<p>
					<strong>Type: </strong>${Firearm.type}
				</p>
				
				<br>
				<br>
 		<%-- <form action="deleteFirearm.do" method="POST">
					<input type='hidden' name='id' id='id' value='${firearm.id}' />
					<button type="submit" class="btn btn-danger">Delete</button>
				</form> --%>
				<br>
			</div>
		</div>
</div>
</body>
</html>