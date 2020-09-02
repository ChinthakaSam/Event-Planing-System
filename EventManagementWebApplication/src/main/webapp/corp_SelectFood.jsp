<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_foodBackground.jpg">>
<% 

double fprice=Double.parseDouble(request.getParameter("fprice"));
String fname=request.getParameter("fname");
int fid = Integer.parseInt(request.getParameter("fid"));

out.println("You have selected " + fname + " food package. Please feel free to select other item packages also" +fprice);

session.setAttribute("FPRICE",fprice);
session.setAttribute("FNAME",fname);
session.setAttribute("FID",fid);
%>

</body>
</html>