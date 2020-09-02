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

import com.BlackPearl.web.model.Caterer;
import com.BlackPearl.web.service.FoodInsertService;

/**
 * Servlet implementation class FoodInsertControl
 */
@MultipartConfig(maxFileSize=169999999)
public class FoodInsertControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodInsertControl() {
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
		String cname=request.getParameter("cname");
		String menu=request.getParameter("menu");
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
		
		Caterer c = new Caterer();
		
		c.setCname(cname);
		c.setMenuId(menu);
		c.setType(type);
		c.setPricePerServing(price);
		c.setImage(inputStream);

		
		FoodInsertService fs = new FoodInsertService();
		fs.addFood(c);
		
		request.setAttribute("food", c);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullInsert.jsp");
		dispatcher.forward(request, response);
	}

}
