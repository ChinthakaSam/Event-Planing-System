
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

<div style="width:100px;height:80px;">
<%

int id=Integer.parseInt(request.getParameter("id"));
ResultSet rs;
try {	
	
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
    java.sql.Statement stmt = con.createStatement();
    stmt.executeUpdate("delete from invitation where iId="+id+"");
    
    
   
  
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullDelete.jsp");
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
