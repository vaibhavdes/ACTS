package pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity 
@Table(name="my_vendor")
public class Vendor {
	private Integer id;
	private String email,name;
	private String city,cell_no;
	private double regAmount;
	private LocalDate regDate;
	private VendorType role;
	private byte[] profileImage;
	
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
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Lob
	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", email=" + email + ", name=" + name + ", city=" + city + ", cell_no=" + cell_no
				+ ", regAmount=" + regAmount + ", regDate=" + regDate + ", role=" + role + "]";
	}	
	
}
