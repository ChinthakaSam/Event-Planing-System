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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLoginControl
 */
public class AdminLoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginControl() {
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
		 PrintWriter out = response.getWriter();
		    String uname = request.getParameter("uname");
		    String upass = request.getParameter("upass");
		    
		  
	
		    try {	
		      Class.forName("com.mysql.jdbc.Driver");
		      java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1","root","1234");
		      java.sql.Statement stmt = con.createStatement();
		      ResultSet rs = stmt.executeQuery("select uname,password from admin where uname='"+uname+"' and password='"+upass+"'");
		      
		    
		      if(rs.next()) {
		        response.sendRedirect("adminPanel.jsp?name="+rs.getString("uname"));
		        HttpSession session = request.getSession();
		        session.setAttribute("uname", uname);
		        
		      }else {
		        out.println("Wrong id and password");
		      }
		      
		      
		      
		    } catch (ClassNotFoundException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    
		    
	}

}