package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VendorDaoImpl;

/**
 * Servlet implementation class AddVendor
 */
@WebServlet("/Add")
public class AddVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw=response.getWriter()){
		pw.write("	<form action='add'>"
				+ "		<table style='background-color: cyan; margin: auto;'>"
				+ "			<tr>"
				+ "				<td>email</td>"
				+ "				<td><input type=email name=email></td>"
				+ "			</tr>"
				+ "			<tr>"
				+ "				<td>name</td>"
				+ "				<td><input type=text name=name></td>"
				+ "			</tr>"
				+ "			<tr>"
				+ "				<td>City</td>"
				+ "				<td><input type=text name=city></td>"
				+ "				</tr>"
				+ "				<tr>"
				+ "				<td>Phone</td>"
				+ "				<td><input type=text name=phone></td>"
				+ "			</tr>"
				+ "			<tr>"
				+ "				<td>regAmount</td>"
				+ "				<td><input type=text name=regAmount></td>"
				+ "			</tr>"
				+ "			<tr>"
				+ "				<td>regDate</td>"
				+ "				<td><input type=date name=regDate></td>"
				+ "			</tr>"
				+ "			<tr>"
				+ "				<td>role</td>"
				+ "				<td><input type=text name=role></td>"
				+ "			</tr>"
				+ "		</table>"
				+ "		<input type=submit value='Add New Vendor'>"
				+ "	</form>");
		}catch(Exception e)
		{
			throw new ServletException("AddVendor error:" + e);
		}
		
	}

}
