
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>navbar</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>

	<div class="w3-bar w3-light-grey w3-border w3-top ">
	
		
			<div style="text-align: center; border-color:#3C5E6F;  font-family:Apple Chancery, cursive; font-size: 55px">
				<strong></strong>
			</div>
		
		
		<form action="/" method="GET">
			<button type="submit" class="w3-bar-item w3-button w3-mobile"><strong style="font-family:fantasy, ForestGreen; font-size: 25px">Home</strong></button>
		</form>
		<form action="listFirearms.do" method="GET">
			<button type="submit" class="w3-bar-item w3-button w3-mobile"><strong style="font-family:fantasy, DarkGreen; font-size: 25px">List All firearms</strong></button>
		</form>

		<form action="createFirearmForm.do" method="GET">
			<button type="submit" class="w3-bar-item w3-button w3-mobile"><strong style="font-family:fantasy, YellowGreen; font-size: 25px">Create firearm</strong></button>
		</form>
<form action="getFirearm.do" method=GET>
			<input type="number" min="1"
				class="w3-bar-item w3-input w3-green w3-mobile pull-right"
				name="id" placeholder="Firearm ID">
			<button type="submit"
				class="w3-bar-item w3-button w3-green w3-mobile pull-right"><strong style="font-family:fantasy, YellowGreen; font-size: 15px">Search</strong></button>
		</form>
		
	</div>
<br>
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
</html>