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
public class UpdateVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int BUFFER_SIZE = 4096;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVenue() {
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
	  
		int id=Integer.parseInt(request.getParameter("id"));
	    try {	
	      Class.forName("com.mysql.jdbc.Driver");
	      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
	      java.sql.Statement stmt = con.createStatement();
	      String str="<h1>Update Details</h1><form name=up method=post action=updatedVenue.jsp ><table border=0 align=center>";
	      ResultSet rs = stmt.executeQuery("select * from venue where vid="+id+"");
	      
	      
	      while(rs.next()) {	  
	    	
	    	  String vname=rs.getString(2);
	    	  str+="<tr align=center height=60 width=400><td width=200 height=30>Venue Id</td><td><input type=text name=vid value="+rs.getInt(1)+" readonly></td></tr><tr align=center height=60 width=400><td>Venue Name</td><td><input type=text name=vname value="
			   		  +vname+"></td></tr><tr align=center height=60 width=400><td>Location</td><td><input type=text name=address value="
			   		  +rs.getString(3)+"></td></tr><tr align=center height=60 width=400><td>Hall Numaber</td><td><input type=text name=hallno value="
			   		  +rs.getString(4)+"></td></tr><tr align=center height=60 width=400><td>Venue Type</td><td><input type=text name=type value="
			   		  +rs.getString(5)+"></td></tr><tr align=center height=60 width=400><td>Number of Guests</td><td><input type=text name=nog value="
			   		  +rs.getInt(6)+"></td></tr><tr align=center height=60 width=400><td>Price</td><td><input type=text name=price value="
			   		  +rs.getDouble(7)+"0></td></tr><tr align=center height=60 width=400><td></td><td><input type=hidden name=image value="
			   		  +rs.getBlob(8)+"</td></tr>";
			   		
		      
	    	   
	      }
	     str +="<tr><td><input type=submit value=Update></td></tr></table></form>";
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
