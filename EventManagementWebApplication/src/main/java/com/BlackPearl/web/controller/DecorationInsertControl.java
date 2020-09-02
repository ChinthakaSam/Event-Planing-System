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

import com.BlackPearl.web.model.Decorator;
import com.BlackPearl.web.service.DecorationInsertService;

/**
 * Servlet implementation class DecorationInsertControl
 */
@MultipartConfig(maxFileSize=169999999)
public class DecorationInsertControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DecorationInsertControl() {
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
		
		Decorator d = new Decorator();
		
		d.setDname(dname);
		d.setDpId(dpId);
		d.setType(type);
		d.setPrice(price);
		d.setImage(inputStream);

		
		DecorationInsertService ds = new DecorationInsertService();
		ds.addDecoration(d);
		
		request.setAttribute("decoration", d);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullInsert.jsp");
		dispatcher.forward(request, response);

	}

}
