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
import pojos.Voter;

/**
 * Servlet implementation class VoterServlet
 */
@WebServlet("/Voter")
public class VoterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			HttpSession hs = request.getSession();

			Voter v = (Voter) hs.getAttribute("acct_dtls");
			VoterDaoImpl dao = (VoterDaoImpl) hs.getAttribute("voter_dao");

			/*
			 * try { String g = (String) hs.getAttribute("status"); }catch(Exception e) {
			 * pw.print("Already Voted"); }
			 */

			if (v != null) {
				pw.print("<h3>Hello , " + v.getId() + "</h3>");

				if (v.getVote_status() == 0) {

					pw.print("Please Submit your Vote");

					List<String> candidates = dao.getAllCandidates();

					pw.print("<form action='Vote'>");
					pw.print("<br>");
					pw.print("Choose Candidate");

					for (String s : candidates)
						pw.print("<br> <input type='radio' name='candidate' value='" + s + "'>" + s);

					pw.print("<br>");
					pw.print("<input type='submit' value='Submit Vote'>");
					pw.print("</form>");
					pw.print("</center>");

				} else {
					pw.print("<center><h3>Parat Matdan Allowed Nahiye</h3></center>");
					pw.print("<h4><a href='Logout'>Logout</a><h4>");
				}

			} else {
				pw.print("No session tracking....");

			}

		} catch (Exception e) {
			throw new ServletException("error in Voter::GET");
		}
	}
}
