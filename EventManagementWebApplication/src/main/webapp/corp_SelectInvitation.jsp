<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_invitationBackground.jpg">
<% 
double iprice = Double.parseDouble(request.getParameter("iprice"));
String iname = request.getParameter("iname");
int iid = Integer.parseInt(request.getParameter("iid"));

out.println("You have selected " + iname + " Photography package. Please feel free to select other item packages on left side menu also" + iprice );

session.setAttribute("IPRICE",iprice);
session.setAttribute("INAME",iname);
session.setAttribute("IID",iid);

%>

</body>
</html>