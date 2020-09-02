package com.BlackPearl.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BlackPearl.web.model.User;
import com.BlackPearl.web.service.UserService;
/**
 * Servlet implementation class UserControl
 */
public class UserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControl() {
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
		response.setContentType("text/html");

		User u = new User();
		
		u.setName(request.getParameter("name"));
		u.setUname(request.getParameter("uname"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		
		UserService us = new UserService();
		us.addUser(u);

		request.setAttribute("user", u);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullRegister.jsp");
		dispatcher.forward(request, response);
		//doGet(request, response);
	}

}
