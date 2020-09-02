package com.BlackPearl.web.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UpdatedVenue
 */
@SuppressWarnings("unused")
public class UpdatedVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatedVenue() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		/*
		int id=Integer.parseInt(request.getParameter("id"));
		String vname=request.getParameter("vname");
		String address=request.getParameter("address");
		String hallno=request.getParameter("hallno");
		String type=request.getParameter("type");
		int numberOfguests=Integer.parseInt(request.getParameter("numberOfguests"));
		double price=Double.parseDouble(request.getParameter("price"));
		Part image=request.getPart("image");
		*/
		
		 try {	
		      Class.forName("com.mysql.jdbc.Driver");
		      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
		      java.sql.Statement stmt = con.createStatement();
		     
		    //  stmt.executeUpdate("update venue set vname="+vname+",address="+address+" wherevid="+id+"");
		      
		     con.close();
		      
		    } catch (ClassNotFoundException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		   
	}

}
