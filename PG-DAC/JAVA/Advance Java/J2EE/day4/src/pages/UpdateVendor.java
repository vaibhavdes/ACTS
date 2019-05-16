package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VendorDaoImpl;

/**
 * Servlet implementation class UpdateVendor
 */
@WebServlet("/Update")
public class UpdateVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private VendorDaoImpl dao;

    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession hs=request.getSession();
		dao=(VendorDaoImpl)hs.getAttribute("dao");
		
		int id=Integer.parseInt(request.getParameter("id"));
		hs.setAttribute("id", id);
		
		try(PrintWriter pw=response.getWriter()){
			pw.print("<form action='update'>"); 
			pw.print("<table style='background-color: cyan; margin: auto;>'"
					+ "	<tr>"
					+ "					<td>City</td>"
					+ "					<td><input type=text name=city></td>"
					+ "				</tr>"
					+ "				<tr>"
					+ "					<td>Phone</td>"
					+ "					<td><input type=text name=phone></td>"
					+ "				</tr>"
					+ "			</table>"
					+ "			<input type=submit value=Update>"
					+ "		</form>");
		}catch(Exception e)
		{
			throw new ServletException("UpdateVendor error:" + e);
		}
		
	}

}
