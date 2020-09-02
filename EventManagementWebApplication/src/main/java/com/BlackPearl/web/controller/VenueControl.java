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


import com.BlackPearl.web.model.Venue;
import com.BlackPearl.web.service.VenueService;


/**
 * Servlet implementation class VenueControl
 */

@MultipartConfig(maxFileSize=169999999)
public class VenueControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VenueControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String vname=request.getParameter("vname");
		String address=request.getParameter("address");
		String hallno=request.getParameter("hallno");
		String type=request.getParameter("type");
		int numberOfguests=Integer.parseInt(request.getParameter("numberOfguests"));
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
		
		Venue v = new Venue();
		
		v.setVname(vname);
		v.setAdress(address);
		v.setHallno(hallno);
		v.setType(type);
		v.setNumberOfguests(numberOfguests);
		v.setPrice(price);
		v.setImage(inputStream);

		
		VenueService vs = new VenueService();
		vs.addVenue(v);
		
		request.setAttribute("venue", v);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/successfullInsert.jsp");
		dispatcher.forward(request, response);
	}

}
