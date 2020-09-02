<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_techBackground.jpg">
<% 

double tprice=Double.parseDouble(request.getParameter("tprice"));
String tname=request.getParameter("tname");
out.println("You have selected " + tname + " Photography package. Please feel free to select other item packages on left side menu also" );

session.setAttribute("TPRICE",tprice);
session.setAttribute("TNAME",tname);

%>

</body>
</html>