<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_decoBackground.jpg">>
<% 
double dprice=Double.parseDouble(request.getParameter("dprice"));
String dname=request.getParameter("dname");
int did = Integer.parseInt(request.getParameter("did"));

out.println("You have selected " + dname + " decorator package. Please feel free to select other item packages also ");

session.setAttribute("DPRICE",dprice);
session.setAttribute("DNAME",dname);
session.setAttribute("DID",did);
%>

</body>
</html>