package pojos;

public class Voter {
	private int id;
	private String name;
	private String password;
	private String role;
	private int vote_status;
	public Voter(int id,String name, String password, String role,int vote_status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.vote_status = vote_status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}	

	public int getVote_status() {
		return vote_status;
	}

	public void setVote_status(int vote_status) {
		this.vote_status = vote_status;
	}

	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
