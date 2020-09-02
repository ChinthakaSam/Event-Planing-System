<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.IOException "%>
<%@ page import="java.io.PrintWriter "%>
<%@ page import="java.sql.DriverManager "%>
<%@ page import="java.sql.ResultSet "%>
<%@ page import="java.sql.SQLException "%>
<%@ page import="java.sql.ResultSet "%>
<%@ page import=" java.io.PrintWriter"%>
<%@ page import=" javax.servlet.http.HttpSession"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
input[type=text], input[type=password], input[type=date], select {
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
	<%
	int id=Integer.parseInt(request.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1",
					"root", "1234");
			java.sql.Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from venue where vid="+id+"");

			int vid = rs.getInt(1);
			String vname = rs.getString(2);
			String address = rs.getString(3);
			String hallno = rs.getString(4);
			String type = rs.getString(5);
			int nog = rs.getInt(6);
			double price = rs.getDouble(7);
			
			out.print(id);
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	%>
	
	<h1>Update Venue</h1>
	<br>
	<br>
	<form name="upvenue" action="VenueControl" method="post"
		enctype="multipart/form-data">
		<div class="container" style="width: 650px;">

			Name <input type="text" name="vname" value="<%=id %>"> <br> Address <input
				type="text" name="address"> <br> Hall Number <input
				type="text" name="hallno"> <br> Type <select
				name="type">
				<option value="indoor">Indoor</option>
				<option value="outdoor">Outdoor</option>
			</select> <br> Number of Guests <input type="text" name="numberOfguests">
			<br> Price <input type="text" name="price"> <br>
			Upload image <input type="file" name="image"> <br>
			<br>


			<button type="submit" class="registerbtn">Add Venue</button>
		</div>
	</form>
</body>
</html>