package com.BlackPearl.web.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.BlackPearl.web.model.Invitation;
import com.BlackPearl.web.service.InvitationInsertService;

/**
 * Servlet implementation class InvitationInsertControl
 */
@MultipartConfig(maxFileSize=169999999)
public class InvitationInsertControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvitationInsertControl() {
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
		String dname=request.getParameter("dname");
		String dpId=request.getParameter("dpId");
		String type=request.getParameter("type");
		double price=Double.parseDouble(request.getParameter("price"));
		Part image=request.getPart("image");
		
		
		InputStream inputStream = null;
		
		if(image != null)
		{
			@SuppressWarnings("unused")
			long fileSize = image.getSize();
			@SuppressWarnings("unused")
			String fileContent=image.getContentType();
			inputStream =image.getInputStream();
		}
		
		Invitation i = new Invitation();
		
		i.setIname(dname);
		i.setIpackage(dpId);
		i.setType(type);
		i.setPrice(price);
		i.setImage(inputStream);

		
		InvitationInsertService is = new InvitationInsertService();
		is.addInvitation(i);
		
		request.setAttribute("invitation", i);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullInsert.jsp");
		dispatcher.forward(request, response);

	}

}
