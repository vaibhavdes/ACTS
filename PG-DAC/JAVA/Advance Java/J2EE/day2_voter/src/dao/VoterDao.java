package dao;

import java.util.List;

import pojos.Candidate;
import pojos.Voter;

public interface VoterDao {

	//Voter / Admin Login 
	Voter voterLogin(String email, String pass, String role) throws Exception;
	//Voter
	List<String> getAllCandidates()  throws Exception;
	//Votes
	List<Candidate> getCandidateByVotes() throws Exception;
	//ByParty
	List<Candidate> getCandidateByPart(String party) throws Exception;
	//UpdateVote
	String updateVote(String candidate,int voter_id) throws Exception;


}
