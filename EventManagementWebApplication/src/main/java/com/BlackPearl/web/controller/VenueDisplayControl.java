package com.BlackPearl.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VenueDisplayControl
 */
public class VenueDisplayControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VenueDisplayControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
	    int vid=Integer.parseInt(request.getParameter("vid"));
	    out.print(vid);
	    try {	
	      Class.forName("com.mysql.jdbc.Driver");
	      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
	      java.sql.Statement stmt = con.createStatement();
	      String str="	<table border=1><tr><td>Venue ID</td><td>Name</td><td>Location</td><td>Hall Number</td><td>Venue Type</td><td>Number Of Guests</td><td>Price</td><td>Image</td></tr></table>";
	      ResultSet rs = stmt.executeQuery("select * from venue where Vid="+vid+"");
	     
	      if(rs.next()) {
	    	   str+="<tr><td>"+rs.getInt(1)+"</td><td>"
	    			   		  +rs.getString(2)+"</td><td>"
	    			   		  +rs.getString(3)+"</td><td>"
	    			   		  +rs.getString(4)+"</td><td>"
	    			   		  +rs.getString(5)+"</td><td>"
	    			   		  +rs.getInt(6)+"</td><td>"
	    			   		  +rs.getDouble(7)+"</td><td>"
	    			   		  +rs.getBlob(8)+"</td><td>"
	    			   		  +"</td></tr>";
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
