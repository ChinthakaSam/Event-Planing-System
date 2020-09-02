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
 * Servlet implementation class UpdateEntertainment
 */
public class UpdateEntertainment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEntertainment() {
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

		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1",
					"root", "1234");
			java.sql.Statement stmt = con.createStatement();
			String str = "<h1>Update Entertainment Package Details</h1><form name=up method=post action=updatedEntertainment.jsp ><table border=0 align=center>";
			ResultSet rs = stmt.executeQuery("select * from entertainment where entId=" + id + "");

			while (rs.next()) {

				String cname = rs.getString(2);
				str += "<tr align=center height=60 width=400><td width=200 height=30>Entertainment Comapany Id</td><td><input type=text name=vid value="
						+ rs.getInt(1)
						+ " readonly></td></tr><tr align=center height=60 width=400><td>Entertainment Comapany Name</td><td><input type=text name=vname value="
						+ cname
						+ "></td></tr><tr align=center height=60 width=400><td>Package Name</td><td><input type=text name=address value="
						+ rs.getString(3)
						+ "></td></tr><tr align=center height=60 width=400><td>Package Type</td><td><input type=text name=type value="
						+ rs.getString(4)
						+ "></td></tr><tr align=center height=60 width=400><td>Price</td><td><input type=text name=price value="
						+ rs.getDouble(5) + "0></td></tr>";

			}
			str += "<tr><td><input type=submit value=Update></td></tr></table></form>";
			out.println(str);
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

}
