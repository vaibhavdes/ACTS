package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Vendor;

public interface VendorDao {
	String registerVendor(Vendor v);
	String updateVendor(int id,String city,String phone);
	String deleteVendor(int id);
	List<Vendor> getAllVendors();

}
