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
 * Servlet implementation class DisplayPhotography
 */
public class DisplayPhotography extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayPhotography() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management1",
					"root", "1234");
			java.sql.Statement stmt = con.createStatement();
			String str = "<h1>Photography Package Details</h1>	<table border=1><tr  align=center><td width=100>Photographer ID</td><td width=100> Photographer Name</td><td width=100>Package Name</td><td width=100>Package Type</td><td width=100>Price</td><td width=100>Image</td><td width=100>Delete Package</td><td width=100>Update Package</td></tr>";
			ResultSet rs = stmt.executeQuery("select * from photographer ");

			while (rs.next()) {
				int id = rs.getInt(1);
				str += "<tr align=center><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>"
						+ rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>Rs." + rs.getDouble(5)
						+ "0</td><td>"
						+ "<br><form name=viewf action=viewPhotography.jsp method=post><input type=hidden name=id value=" + id
						+ "><input type=submit value=View></form>"
						+ "</td><td><br><form name=delete action=deletePhotography.jsp method=post><input type=hidden  name=id value="
						+ id + "><input type=submit value=Detele></form></td>"
						+ "<td><br><form name=update action=UpdatePhotography method=post><input type=hidden  name=id value="
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
