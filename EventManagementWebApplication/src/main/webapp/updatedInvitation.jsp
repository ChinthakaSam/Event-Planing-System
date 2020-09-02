
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.IOException "%>
      <%@ page import="java.io.PrintWriter "%>
        <%@ page import="java.sql.DriverManager "%>
          <%@ page import="java.sql.ResultSet "%>
           <%@ page import="java.sql.SQLException "%>
            <%@ page import="java.sql.ResultSet "%>
            <%@ page import="java.io.InputStream "%>
           <%@ page import="javax.servlet.annotation.MultipartConfig "%>

<html>
<body>

<div style="width:100px;height:80px;">
<%


int vid=Integer.parseInt(request.getParameter("vid"));
String vname=request.getParameter("vname");
String address=request.getParameter("address");
String type=request.getParameter("type");
double price=Double.parseDouble(request.getParameter("price"));

try {	
	
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
    
    
   String query="update invitation set iname='"+vname+"' , ipackage='"+address+"', type='"+type+
    		"' , price='"+price+"' where iId="+vid+"";
    Statement st = con.createStatement();
    st.execute(query);
    
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullUpdate.jsp");
	dispatcher.forward(request, response);
  
    
  } catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  finally
  {
	 
  }
  
%>
</div>
</body>
</html>
