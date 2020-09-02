<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.IOException "%>
      <%@ page import="java.io.PrintWriter "%>
        <%@ page import="java.sql.DriverManager "%>
          <%@ page import="java.sql.ResultSet "%>
           <%@ page import="java.sql.SQLException "%>
            <%@ page import="java.sql.ResultSet "%>
    		<%@page import="java.io.OutputStream"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/corp_foodBackground.jpg">
<%

  Class.forName("com.mysql.jdbc.Driver");
  java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
  java.sql.Statement stmt = con.createStatement();
  String str="<h1>Food Menu Details</h1>	<table border=3><tr  align=center><td width=100> Caterer Name</td><td width=100>Menu Name</td><td width=100>Price Per Serving</td><td width=100>Package Deatails</td><td width=100>Select caterer</td></tr>";
  ResultSet rs = stmt.executeQuery("select * from caterer where type='corporate'");
  
  
  while(rs.next()) {	  
	int fid=rs.getInt(1);
	String fname=rs.getString(3);
	double fprice = rs.getDouble(5);
	  str+="<tr align=center><td>"
	   		  +rs.getString(2)+"</td><td>"
	   		  +rs.getString(3)+"</td><td>Rs."
	   		  +rs.getDouble(5)+"0</td><td width=470 height=600>"
	   		+"<img src=images/"+rs.getString(7)+" width=470 height=600/> </td><td>"
	   		  +"<br><form name=select action=corp_SelectFood.jsp method=post><input type=hidden  name=fid value="+fid+"><input type=hidden  name=fprice value="+fprice+"><input type=hidden  name=fname value="+fname+"><input type=submit value=Select></form></td>"
	   		  + "</tr>";
	  
	  
      
	   
  }
 str +="</table>";
 out.println(str);
 con.close();

%>
</body>
</html>