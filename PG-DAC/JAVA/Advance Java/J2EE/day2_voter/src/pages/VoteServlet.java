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
 * Servlet implementation class VoteServlet
 */
@WebServlet("/Vote")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		try (PrintWriter pw = response.getWriter()) {
			HttpSession hs = request.getSession();
			VoterDaoImpl dao = (VoterDaoImpl) hs.getAttribute("voter_dao");
			Voter voter = (Voter) hs.getAttribute("acct_dtls");

			String candidate  = request.getParameter("candidate");
			System.out.println(candidate);
			
			String result = dao.updateVote(candidate,voter.getId());
			
			pw.print("<center>");
			
			if(result.contains("success"))
			{
				pw.print("<h3>Thank You for Voting</h3>");
				hs.setAttribute("status", "true");
			}
			else
				pw.print("<input type='submit' value='Retry Vote' formaction='Voter'>");
	
			pw.print("<h4><a href='Logout'>Logout</a><h4>");
			pw.print("</center>");
			
		}catch(Exception e)
		{
			throw new ServletException("err in do-get", e);
		}

	}

}
