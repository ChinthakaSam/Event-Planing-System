<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/conferenceVenueBackground.jpg">
<% 
double vprice = Double.parseDouble(request.getParameter("vprice"));
String vname = request.getParameter("vname");
int noge = Integer.parseInt(request.getParameter("noge"));
int vid = Integer.parseInt(request.getParameter("vid"));

out.println("You have selected " + vname + " Venue. Please feel free to select other item packages also" );

session.setAttribute("VPRICE",vprice);
session.setAttribute("VNAME",vname);
session.setAttribute("NOG", noge);
session.setAttribute("VID", vid);

%>

</body>
</html>