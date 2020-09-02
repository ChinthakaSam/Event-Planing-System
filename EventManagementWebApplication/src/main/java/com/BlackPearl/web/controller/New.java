package com.BlackPearl.web.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class New
 */
@SuppressWarnings("unused")
public class New extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFFER_SIZE = 4096;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public New() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
	  
	    
	    try {	
	      Class.forName("com.mysql.jdbc.Driver");
	      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
	      java.sql.Statement stmt = con.createStatement();
	      String str="<h1>Venue Details</h1>	<table border=1><tr  align=center><td width=100>Venue ID</td><td width=100>Name</td><td width=100>Location</td><td width=100>Hall Number</td><td width=100>Venue Type</td><td width=180>Number Of Guests</td><td width=100>Price</td><td width=100>Image</td><td width=100>Delete Venue</td><td width=100>Update Venue</td></tr>";
	      ResultSet rs = stmt.executeQuery("select * from venue ");
	      
	      
	      while(rs.next()) {	  
	    	int id=rs.getInt(1);
	    	  str+="<tr align=center><td>"+rs.getInt(1)+"</td><td>"
			   		  +rs.getString(2)+"</td><td>"
			   		  +rs.getString(3)+"</td><td>"
			   		  +rs.getString(4)+"</td><td>"
			   		  +rs.getString(5)+"</td><td>"
			   		  +rs.getInt(6)+"</td><td>Rs. "
			   		  +rs.getDouble(7)+"0</td><td>"
			   		  +"<img src=images/"+rs.getString(9)+" width=200 height=200/> </td><td>"
			   		  +"<br><form name=delete action=deleteVenue.jsp method=post><input type=hidden  name=id value="+id+"><input type=submit value=Detele></form></td>"
			   		  + "<td><br><form name=update action=UpdateVenue method=post><input type=hidden  name=id value="+id+"><input type=submit value=Update></form></td></tr>";
	    	  
	    	  
		      
	    	   
	      }
	     str +="</table>";
	     out.println(str);
	     con.close();
	      
	    } catch (ClassNotFoundException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    finally
	    {
	    	out.close();
	    }
	}

}
