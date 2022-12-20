<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${result}</title>
</head>
<jsp:include page="navbar.jsp"><jsp:param value="" name="" /></jsp:include>
<br>
<body style="background-color: #B22222">

	<br>
	<div class="container-fluid" style="padding-top: 2in;">
		<div class="row row-no-gutters">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">

				<h1 style="font-family:Apple Chancery, Yellow, cursive; font-size: 80px">${result}</h1>
			</div>
		</div>
	</div>
</body>
</html>