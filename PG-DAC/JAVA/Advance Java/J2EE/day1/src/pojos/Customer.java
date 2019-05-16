package pojos;

import java.sql.Date;

public class Customer {
	private double deposit_amt;
	private String email;
	private String name;
	private String password;
	private Date reg_date;
	private String role;
	
	public Customer(double amt,String email,String name,String password,Date reg_date,String role)
	{
		this.deposit_amt = amt;
		this.email = email;
		this.name = name;
		this.password = password;
		this.reg_date = reg_date;
		this.role = role;
	}

	public double getDeposit_amt() {
		return deposit_amt;
	}

	public void setDeposit_amt(double deposit_amt) {
		this.deposit_amt = deposit_amt;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [deposit_amt=" + deposit_amt + ", email=" + email + ", name=" + name + ", password=" + password
				+ ", reg_date=" + reg_date + ", role=" + role + "]";
	}
	
	
	
	
}
