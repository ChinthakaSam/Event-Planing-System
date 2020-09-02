<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.ibutton {
	width: 250px;
	height: 50px;
	background-color: rgba(0, 0, 0, 0.71);
	color: white;
}
</style>
</head>
<body>
	<div>
		<div style="width: 30%; height: auto; float: left;">
			<table>
				<tr>
					<td><button
							style="width: 250px; height: 250px; background-color: rgba(0, 0, 0, 0);">Total
							Amount</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Venue</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Food</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Decoration</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Entertainment</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Invitation</button></td>
				</tr>
				<tr>
					<td><button class="ibutton">Photography</button></td>
				</tr>
			</table>
		</div>
		<div style="width: 70%; height: auto; float: left;">
			<iframe src="b_venueIframe.jsp" style="height: 980px;width: 100%; border:0;"></iframe>
		</div>
	</div>
</body>
</html>