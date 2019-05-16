package dao;

import java.sql.Date;
import java.util.List;

import pojos.Vendor;

public interface VendorDao {
	//add Vendor
	String addVendor(String email, String name, String city, String cell_no, double regAmount, String regDate,
			String role)  throws Exception;
	//update Vendor
	String updateVendor(String city,String phone,int id)  throws Exception;
	//delete Vendor
	String deleteVendor(int id)  throws Exception;
	//get Vendors
	List<Vendor> getAllVendors()  throws Exception;

}
