<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
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
<%
int nog = (Integer)session.getAttribute("NOG");

int VIDS = (Integer)session.getAttribute("VID");
int DIDS = (Integer)session.getAttribute("DID");
int FIDS = (Integer)session.getAttribute("FID");
int IIDS = (Integer)session.getAttribute("IID");
int PIDS = (Integer)session.getAttribute("PID");
int ENTIDS = (Integer)session.getAttribute("ENTID");



double v = (Double)session.getAttribute("VPRICE");
double f = (Double)session.getAttribute("FPRICE");
double d = (Double)session.getAttribute("DPRICE");
double e = (Double)session.getAttribute("EPRICE");
double i = (Double)session.getAttribute("IPRICE"); 
double p = (Double)session.getAttribute("PPRICE");
double t = (Double)session.getAttribute("TPRICE");

double sum = v + (f*nog) + d + (e*nog) + i + p + t;

String title = "<h1>Your Toatal Payment Details</h1>";

String str1 = "<h4>Number of Guests : </h4>";

String str2 = "<h4>Price for selected Venue Package : Rs.</h4>";
String str3 = "<h4>Price for selected Food Package( Rs."+f+" * "+nog+" ) : Rs. </h4>";
String str4 = "<h4>Price for selected Decorator Package: Rs. </h4>";
String str5 = "<h4>Price for Entertainment Package( Rs."+e+" * "+nog+" ) : Rs. </h4>";
String str6 = "<h4>Price for selected Invitation Package: Rs. </h4>";
String str7 = "<h4>Price for selected Photography Package: Rs. </h4>";
String str8 = "<h4>Price for selected Multimedia Equipment Package: Rs. </h4>";
String str9 = "<h2>Toata Amount : Rs. </h2>";
String str10 = "______________________________________________________________________________";

out.println("=================================================================================");
out.println(title);
out.println("=================================================================================");
out.println("<table><tr>");
out.println("<td>"+ str1 + "</td><td>"+ nog + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str2 + "</td><td>"+  v + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str3 + "</td><td>"+  f + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str4 + "</td><td>"+  d + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str5 + "</td><td>"+  e + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str6 + "</td><td>"+  i + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str7 + "</td><td>"+  p + "</td>");
out.println("</tr><tr>");
out.println("<td>"+ str8 + "</td><td>"+  t + "</td>");
out.println("</tr><tr>");

out.println("<td>"+ str10 + "</td><td>"+ str10 + "</td>");

out.println("</tr><tr>");
out.println("<td>"+ str9 + "</td><td>"+ sum + "</td>");
out.println("</tr></table>");

out.println("=================================================================================");

%>
<table>
<tr>
					<td><button onclick="window.location.href='Corp_payConfirm.jsp'" class=ibutton>Confirm Payment</button></td>
				</tr>

</table>
<%

%>
</body>
</html>