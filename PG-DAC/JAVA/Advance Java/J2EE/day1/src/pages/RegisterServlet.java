package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookShopDaoImpl;
import pojos.Customer;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookShopDaoImpl dao;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void init() throws ServletException {
		try {
			dao = new BookShopDaoImpl();
			System.out.println(dao);
		} catch (Exception e) {
			throw new ServletException("err in init", e);
		}
	}

	@Override
	public void destroy() {
		if (dao != null)
			try {
				dao.CleanUp();
			} catch (Exception e) {
				throw new RuntimeException("err in destroy", e);
			}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		try(PrintWriter pw = response.getWriter())
		{
			double amt  = Double.parseDouble(request.getParameter("amount"));
			String email  = request.getParameter("email");
			String name  = request.getParameter("name");
			String password  = request.getParameter("password");
			Date date  = Date.valueOf(request.getParameter("reg_date"));
			String role  = request.getParameter("role");
			
			String result = dao.register_customer(amt, email, name, password, date, role);

			if (result.contains("false"))
			{
				pw.print("<h4> Invalid Login , Pls <a href=register.html>Retry Registration</a></h4>");
			}
			else
			{
				pw.print("success registration <a href=login.html>Proceed To Login</a></h4>");
				//response.sendRedirect("login");
			}
		}catch(Exception e)
		{
			throw new ServletException("err in do-get", e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		try(PrintWriter pw = response.getWriter())
		{
			double amt  = Double.parseDouble(request.getParameter("amount"));
			String email  = request.getParameter("email");
			String name  = request.getParameter("name");
			String password  = request.getParameter("password");
			Date date  = Date.valueOf(request.getParameter("reg_date"));
			String role  = request.getParameter("role");
			
			String result = dao.register_customer(amt, email, name, password, date, role);

			if (result.contains("false"))
			{
				pw.print("<h4> Invalid Login , Pls <a href=register.html>Retry Registration</a></h4>");
			}
			else
			{
				pw.print("success registration <a href=login.html>Proceed To Login</a></h4>");
				//response.sendRedirect("login");
			}
		}catch(Exception e)
		{
			throw new ServletException("err in do-get", e);
		}
	}

}
