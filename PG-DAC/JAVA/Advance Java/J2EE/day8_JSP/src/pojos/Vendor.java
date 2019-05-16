package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity 
@Table(name="my_vendor")
public class Vendor {
	private Integer vendorId;
	private String email,name;
	private String city,cell_no;
	private double regAmount;
	private LocalDate regDate;
	private VendorType role;
	private List<BankAccount> bank=new ArrayList<>();

	public Vendor()
	{
		System.out.println("in vendor:: constructor");
	}
	
	public Vendor(String email, String name, String city, String cell_no, double regAmount, LocalDate regDate,
			VendorType role) {
		super();
		this.email = email;
		this.name = name;
		this.city = city;
		this.cell_no = cell_no;
		this.regAmount = regAmount;
		this.regDate = regDate;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length=30)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(length=20)
	public String getCell_no() {
		return cell_no;
	}

	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}
	@Column(name="reg_amount",columnDefinition="double(8,1)")
	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	@Column(name="reg_date")
	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	@Enumerated(EnumType.STRING)
	public VendorType getRole() {
		return role;
	}

	public void setRole(VendorType role) {
		this.role = role;
	}

	@OneToMany(mappedBy="vendorIdentity",cascade=CascadeType.ALL)
	public List<BankAccount> getBank() {
		return bank;
	}

	public void setBank(List<BankAccount> bank) {
		this.bank = bank;
	}

	public void addBank(BankAccount b)
	{
		bank.add(b);//vendor --->bank
		b.setVendorIdentity(this);//bank ---> vendor
	}
	public void removeBank(BankAccount b)
	{
		bank.remove(b);//vendor -X--bank
		b.setVendorIdentity(null);
	}
	
	@Override
	public String toString() {
		return "Vendor [id=" + vendorId + ", email=" + email + ", name=" + name + ", city=" + city + ", cell_no=" + cell_no
				+ ", regAmount=" + regAmount + ", regDate=" + regDate + ", role=" + role + "]";
	}	
	
}
