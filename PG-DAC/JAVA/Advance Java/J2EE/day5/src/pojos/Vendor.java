package pojos;

import java.sql.Date;

public class Vendor {
	private int id;
	private String email,name;
	private String city,cell_no;
	private double regAmount;
	private Date regDate;
	private String role;
	
	
	public Vendor(int id, String email, String name, String city, String cell_no, double regAmount, Date regDate,
			String role) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.city = city;
		this.cell_no = cell_no;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.role = role;
	}

	public Vendor(String email, String name, String city, String cell_no, double regAmount, Date regDate,
			String role) {
		super();
		this.email = email;
		this.name = name;
		this.city = city;
		this.cell_no = cell_no;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.role = role;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCell_no() {
		return cell_no;
	}


	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}


	public double getRegAmount() {
		return regAmount;
	}


	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Vendor [id=" + id + ", email=" + email + ", name=" + name + ", city=" + city + ", cell_no=" + cell_no
				+ ", regAmount=" + regAmount + ", regDate=" + regDate + ", role=" + role + "]";
	}
	
	
}
