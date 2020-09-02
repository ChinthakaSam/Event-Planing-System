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
 * Servlet implementation class UpdateInvitation
 */
public class UpdateInvitation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateInvitation() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1",
					"root", "1234");
			java.sql.Statement stmt = con.createStatement();
			String str = "<h1>Update Invitation Package Details</h1><form name=up method=post action=updatedInvitation.jsp ><table border=0 align=center>";
			ResultSet rs = stmt.executeQuery("select * from invitation where iId=" + id + "");

			while (rs.next()) {

				String cname = rs.getString(2);
				str += "<tr align=center height=60 width=400><td width=200 height=30>Invitation Comapany Id</td><td><input type=text name=vid value="
						+ rs.getInt(1)
						+ " readonly></td></tr><tr align=center height=60 width=400><td>Invitation Comapany Name</td><td><input type=text name=vname value="
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
