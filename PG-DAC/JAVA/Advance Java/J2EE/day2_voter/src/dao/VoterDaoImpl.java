package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojos.Candidate;
import pojos.Voter;

public class VoterDaoImpl implements VoterDao {

	private Connection conn;
	private PreparedStatement pst1, pst2, pst3,pst4,pst5;

	public VoterDaoImpl() throws Exception {
		conn = fetchConnection();
		pst1 = conn.prepareStatement("select * from my_voter where email=? AND password=? AND role=?");
		pst2 = conn.prepareStatement("select * from my_voter_candidate");
		pst3 = conn.prepareStatement("select * from my_voter_candidate ORDER BY votes desc LIMIT 2");
		pst4 = conn.prepareStatement("update my_voter_candidate SET votes = votes + 1 WHERE name=?");
		pst5 = conn.prepareStatement("update my_voter set vote_status=1 WHERE id=?");


	}

	public void cleanUp() throws Exception {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (conn != null)
			conn.close();
	}

	@Override
	public Voter voterLogin(String email, String pass, String role) throws Exception {
		pst1.setString(1, email);
		pst1.setString(2, pass);
		pst1.setString(3, role);
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				return new Voter(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));				
		}
		return null;
	}

	@Override
	public List<String> getAllCandidates() throws Exception {
		ArrayList<String> candidates = new ArrayList<>();
		try (ResultSet rst = pst2.executeQuery()) {
			while (rst.next())
				candidates.add(rst.getString(2));
		}
		System.out.println("Testing Candidate: " + candidates);
		return candidates;
	}

	@Override
	public List<Candidate> getCandidateByVotes() throws Exception {
		ArrayList<Candidate> candidates = new ArrayList<>();
		try (ResultSet rst = pst3.executeQuery()) {
			while (rst.next())
				candidates.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
		System.out.println("Testing Candidates: " + candidates);
		return candidates;
	}

	@Override
	public List<Candidate> getCandidateByPart(String party) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String updateVote(String candidate,int voter_id) throws Exception {
		// TODO Auto-generated method stub
		pst4.setString(1, candidate);
		pst5.setInt(1, voter_id);
		int result = pst4.executeUpdate();
		int result1 = pst5.executeUpdate();
		if(result != 0)
		{
			if(result1!=0)
				return "success";
		}
		return "failure";
	}

}
