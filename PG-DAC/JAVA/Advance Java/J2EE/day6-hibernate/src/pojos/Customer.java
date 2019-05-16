package pojos;

import javax.persistence.*; //JPA
import java.util.Date;
@Entity //mandatory
@Table(name="dac_customers")

public class Customer {
	private Integer id;
	private double depositAmount;
	private String email,name,password;
	private Date regDate;
	private String role;
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("in customer constructor");
	}
	
	public Customer(int id, double depositAmount, String email, String name, String password, Date regDate,
			String role) {
		super();
		this.id = id;
		this.depositAmount = depositAmount;
		this.email = email;
		this.name = name;
		this.password = password;
		this.regDate = regDate;
		this.role = role;
	}
	
	public Customer( double depositAmount, String email, String name, String password, Date date,
			String role) {
		super();
		this.depositAmount = depositAmount;
		this.email = email;
		this.name = name;
		this.password = password;
		this.regDate = date;
		this.role = role;
	}
	
	@Id 	//Mandatory -- Primary Key Coloumn
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto Incremented Constraint
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="reg_amt")
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="reg_date")
	@Temporal(TemporalType.DATE)
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Column(length=20)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", depositAmount=" + depositAmount + ", email=" + email + ", name=" + name
				+ ", regDate=" + regDate + ", role=" + role + "]";
	}
	
	
}
