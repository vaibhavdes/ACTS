package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VendorDaoImpl;
import pojos.Vendor;

/**
 * Servlet implementation class ListVendors
 */
@WebServlet("/List")
public class ListVendors extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VendorDaoImpl dao;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			dao = new VendorDaoImpl();
			System.out.println("List Init::");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("dao", dao);
		String status = (String) hs.getAttribute("status");
		if(status==null)
		{
			status = "Welcome to Vendor System";
		}
		try(PrintWriter pw = response.getWriter())
		{
			List<Vendor> vendors = new ArrayList<>();
			vendors = dao.getAllVendors();
			System.out.println("List doGet::" + vendors);
			
			pw.write("<h5 style='align:center'>Vendor List</h5>");
			pw.write("<h4 align='center' style='color: red;'>"+status+"</h4>");

			pw.write("<table border='1' style='background-color: cyan; margin: auto;'>" + 
					"		<tr>\r\n" + 
					"			<td>ID</td>\r\n" + 
					"			<td>Name</td>\r\n" + 
					"			<td>Email</td>\r\n" + 
					"			<td>City</td>\r\n" + 
					"			<td>Cell No</td>\r\n" + 
					"			<td>Reg_Amount</td>\r\n" + 
					"			<td>Reg_Date</td>\r\n" + 
					"			<td>Role</td>\r\n" + 
					"			<td></td>\r\n" + 
					"			<td></td>\r\n" + 
					"		</tr>");
			
			for(Vendor v : vendors) {
				pw.write("<tr>");
				pw.write("<td>"+v.getId()+"</td>");
				pw.write("<td>"+v.getName()+"</td>");
				pw.write("<td>"+v.getEmail()+"</td>");
				pw.write("<td>"+v.getCity()+"</td>");
				pw.write("<td>"+v.getCell_no()+"</td>");
				pw.write("<td>"+v.getRegAmount()+"</td>");
				pw.write("<td>"+v.getRegDate()+"</td>");
				pw.write("<td>"+v.getRole()+"</td>");
				pw.write("<td><a href='Update?id="+v.getId()+"'>Update</td>");
				pw.write("<td><a href='delete?id="+v.getId()+"'>Delete</td>");
				pw.write("</tr>");
			}
			
			pw.write("</table>");
				
			pw.write("<h4 align='center' style='color: blue;'><a href='Add'>Add New Vendor</a></h4>");
	
		}catch(Exception e)
		{
			throw new ServletException("error listVendor :: " + e);
		}
	}

}
