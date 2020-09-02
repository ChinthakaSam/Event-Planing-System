<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_photograpyBackground.jpg">
<% 
double pprice = Double.parseDouble(request.getParameter("pprice"));
String pname = request.getParameter("pname");
int pid = Integer.parseInt(request.getParameter("pid"));

out.println("You have selected " + pname + " Photography package. Please feel free to select other item packages on left side menu also" );

session.setAttribute("PPRICE",pprice);
session.setAttribute("PNAME",pname);
session.setAttribute("PID",pid);

%>
</body>
</html>