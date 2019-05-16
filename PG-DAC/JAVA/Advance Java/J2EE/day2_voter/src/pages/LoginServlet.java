package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VoterDaoImpl;
import pojos.Voter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/AdminLogin", "/VoterLogin" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VoterDaoImpl dao;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
	public void init() throws ServletException
	{
		try {
			dao = new VoterDaoImpl();
		}catch(Exception e)
		{
			throw new ServletException("error in init", e);
		}
	}
	
	@Override
	public void destroy() {
		if (dao != null)
			try {
				dao.cleanUp();
			} catch (Exception e) {
				throw new RuntimeException("error in destroy", e);
			}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter() ) {
			HttpSession hs = request.getSession();
			
			hs.setAttribute("voter_dao", dao);
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String role = request.getParameter("role");
			
			Voter v = dao.voterLogin(email, password, role);
			if( v == null)
				pw.print("<h4> Invalid Login  <a href=login.html>Please Try Again</a></h4>");
			else
			{
				hs.setAttribute("acct_dtls", v);
				if(role.contains("voter"))
					response.sendRedirect("Voter");
				else
					response.sendRedirect("Admin");
			}

		}catch(Exception e)
		{
			throw new ServletException("err in do-post", e);
		}
	}

}
