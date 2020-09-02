<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_entertainBackground.jpg">
<%
double eprice=Double.parseDouble(request.getParameter("eprice"));
String ename=request.getParameter("ename");
int entid = Integer.parseInt(request.getParameter("entid"));

out.println("You have selected " + ename + " Photography package. Please feel free to select other item packages on left side menu also" );

session.setAttribute("EPRICE",eprice);
session.setAttribute("ENAME",ename);
session.setAttribute("ENTID",entid);

%>

</body>
</html>