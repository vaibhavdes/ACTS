package beans;

import java.sql.Date;
import java.util.List;

import dao.VendorDaoImpl;
import pojos.Vendor;

public class VendorBean {
	private String email, name, role, city, phone;
	private double regAmount;
	private String regDate;
	private int id;
	private String status;

	private VendorDaoImpl dao;
	private Vendor details;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public VendorBean() throws Exception {
		System.out.println("in Vendors constr");
		dao = new VendorDaoImpl();
		status = "";
	}

	public List<Vendor> getVendors() throws Exception {
		return dao.getAllVendors();
	}

	public String vendorUpdate() throws Exception {
		System.out.println("update vendor");

		if (dao.updateVendor(city, phone, id).contains("success")) {
			status = "Update Succesfull";
		} else {
			status = "Update UnSuccesfull";
		}
		return "return";
	}

	public String vendorDelete() throws Exception {

		if (dao.deleteVendor(id).contains("success")) {
			status = "Delete Succesfull";
		} else {
			status = "Delete UnSuccesfull";
		}
		return "return";
	}

	public String vendorAdd() throws Exception {
		System.out.println("add vendor");
		if (dao.addVendor(email, name, city, phone, regAmount, regDate, role).contains("success")) {
			status = "Add Succesfull";
		} else {
			status = "Add UnSuccesfull";
		}
		return "return";

	}
}
