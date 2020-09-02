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
 * Servlet implementation class CorporateEventController
 */
public class CorporateEventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorporateEventController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int nog = Integer.parseInt(request.getParameter("nog"));
		String city = request.getParameter("city");
		String type = request.getParameter("type");
		
		try {	
	      Class.forName("com.mysql.jdbc.Driver");
	      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
	      java.sql.Statement stmt = con.createStatement();
	      String str="<h1>Venue Details</h1>	<table border=1><tr  align=center><td width=100>Venue Name</td><td width=100>Address</td><td width=100>Number of Geusts</td><td width=100>Price</td><td width=100>Package Details</td><td width=100>Select Venue</td></tr>";
	      ResultSet rs = stmt.executeQuery("select * from venue where address='"+city+"' AND type='"+type+"' AND numberOfguests >='"+nog+"'");
	      
	      
	      while(rs.next()) {	  
	    	int vid=rs.getInt(1);
	    	int noge=rs.getInt(6);
	    	String vname=rs.getString(2);
	    	double vprice = rs.getDouble(7);
	    	  str+="<tr align=center><td>"
			   		  +rs.getString(2)+"</td><td>"
			   		  +rs.getString(3)+"</td><td>"
			   		  +rs.getInt(6)+"</td><td>Rs."
			   		  +rs.getDouble(7)+"0</td><td width=470 height=600>"
			   		+"<img src=images/"+rs.getString(9)+" width=470 height=600/> </td><td>"
			   		  +"<br><form name=select action=corp_SelectVenue.jsp method=post><input type=hidden  name=vid value="+vid+"><input type=hidden  name=noge value="+noge+"><input type=hidden  name=vname value="+vname+"><input type=hidden  name=vprice value="+vprice+"><input type=submit value=Select></form></td>"
			   		  + "</tr>";
	    	  
	    	  
		      
	    	   
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
