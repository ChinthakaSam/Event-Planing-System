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
 * Servlet implementation class DisplayEntertainment
 */
public class DisplayEntertainment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEntertainment() {
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

		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1",
					"root", "1234");
			java.sql.Statement stmt = con.createStatement();
			String str = "<h1>Entertainment Package Details</h1>	<table border=1><tr  align=center><td width=100>Entertainment Company ID</td><td width=100> Entertainment Company Name</td><td width=100>Package Name</td><td width=100>Package Type</td><td width=100>Price</td><td width=100>Image</td><td width=100>Delete Package</td><td width=100>Update Package</td></tr>";
			ResultSet rs = stmt.executeQuery("select * from entertainment ");

			while (rs.next()) {
				int id = rs.getInt(1);
				str += "<tr align=center><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>"
						+ rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>Rs." + rs.getDouble(5)
						+ "0</td><td>"
						+ "<br><form name=viewf action=viewEntertainment.jsp method=post><input type=hidden name=id value=" + id
						+ "><input type=submit value=View></form>"
						+ "</td><td><br><form name=delete action=deleteEntertainment.jsp method=post><input type=hidden  name=id value="
						+ id + "><input type=submit value=Detele></form></td>"
						+ "<td><br><form name=update action=UpdateEntertainment method=post><input type=hidden  name=id value="
						+ id + "><input type=submit value=Update></form></td></tr>";

			}
			str += "</table>";
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
