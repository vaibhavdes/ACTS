package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VoterDaoImpl;
import pojos.Candidate;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/Admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter())
		{
			HttpSession hs = request.getSession();
			VoterDaoImpl dao = (VoterDaoImpl)hs.getAttribute("voter_dao");
			
			if(dao != null)
			{
			pw.print("<center>");
			pw.print("Election Commission of India Official Website");
			pw.write("</center>");
			
			List<Candidate> list = dao.getCandidateByVotes();
			
			pw.write("<table border=1>");
			pw.print("<tr><td>Name</td><td>Party</td><td>Votes</td></tr>");

			for(Candidate c : list)
				pw.print("<tr><td>"+c.getName()+"</td><td>"+c.getParty()+"</td><td>"+c.getVotes()+"</td></tr>");
			
			pw.write("</table>");
			}

		}catch(Exception e)
		{
			throw new ServletException("Error in Admin Servlet",e);
		}
		
	}

}
