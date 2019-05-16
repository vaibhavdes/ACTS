package bean;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import dao.VendorDaoImpl;
import pojos.Vendor;
import pojos.VendorType;

public class VendorBean {
	private String email, name, role, city, cell_no;
	private double regAmount;
	private String regDate;
	private Integer vendorId;
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


	public String getCell_no() {
		return cell_no;
	}

	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
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

		if (dao.updateVendor(vendorId, city, cell_no).contains("success")) {
			status = "Update Succesfull";
		} else {
			status = "Update UnSuccesfull";
		}
		return "return";
	}

	public String vendorDelete() throws Exception {

		if (dao.deleteVendor(vendorId).contains("success")) {
			status = "Delete Succesfull";
		} else {
			status = "Delete UnSuccesfull";
		}
		return "return";
	}

	public String vendorAdd() throws Exception {
		System.out.println("add vendor");
		Vendor v = new Vendor(email, name, city, cell_no, regAmount,LocalDate.parse(regDate), VendorType.valueOf(role.toUpperCase()));
		if (dao.registerVendor(v).contains("success")) {
			status = "Add Succesfull";
		} else {
			status = "Add UnSuccesfull";
		}
		return "return";

	}
}
