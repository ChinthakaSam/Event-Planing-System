
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.IOException "%>
      <%@ page import="java.io.PrintWriter "%>
        <%@ page import="java.sql.DriverManager "%>
          <%@ page import="java.sql.ResultSet "%>
           <%@ page import="java.sql.SQLException "%>
            <%@ page import="java.sql.ResultSet "%>


<html>
<body>
<input type="submit" value="Back" onclick="New.java">
<div style="width:100px;height:80px;">
<%
OutputStream img;
int id=Integer.parseInt(request.getParameter("id"));
try {	
	
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
    java.sql.Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("select * from venue where vid="+id+"");

    while(rs.next()) {
    	
  	    byte barray[]=rs.getBytes(8);
  	    response.setContentType("image/jpg");
  	    img=response.getOutputStream();
  	    img.write(barray);
  	    img.flush();
  	    img.close();
    }
   
    
    
    
  } catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
%>
</div>
</body>
</html>
