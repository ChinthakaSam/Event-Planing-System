<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=date],select {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #ccccc0;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #000000;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<body>

<form action="New" method="post">
	<input type="submit" class="registerbtn" value="View Venue Details">
	</form>
	

	<h1>Add Venue</h1>
	<br><br>
	<form name="addvenue" action="VenueControl" method="post" enctype="multipart/form-data">
		<div class="container" style="width: 650px;" >
		
			Name <input type="text" name="vname"> <br>
			Address <input type="text" name="address"> <br> 
			Hall Number <input type="text" name="hallno"> <br>
			Type 
					<select name="type">
						<option  value="indoor">Indoor</option>
						<option value="outdoor">Outdoor</option>
					</select>
		         <br>
			Number of Guests <input type="text" name="numberOfguests"> <br>
			Price <input type="text" name="price"> <br>
			Upload image <input type="file" name="image"> <br><br>
			
			
			<button type="submit" class="registerbtn">Add Venue</button>
		</div>
	</form>
</body>
</html>