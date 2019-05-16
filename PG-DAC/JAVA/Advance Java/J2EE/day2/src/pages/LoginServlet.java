package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookShopDaoImpl;
import pojos.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BookShopDaoImpl dao;
    /**
     * @see HttpServlet#HttpServlet()
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


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			// read req param
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			// invoke dao's method for validation
			Customer c = dao.validateCustomer(email, pwd);
			// chk
			if (c == null)
				pw.print("<h4> Invalid Login , Pls <a href=login.html>Retry</a></h4>");
			else {		
				pw.print("success mesg from 1st page");
				response.sendRedirect("details");
			}
		} catch (Exception e) {
			// wrap it in SE & re-throw to WC
			throw new ServletException("err in do-get", e);
		}
	}

}
