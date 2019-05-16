package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Vendor;

public interface VendorDao {
	String registerVendor(Vendor v);
	Vendor getVendorDetails(int id);
	List<Vendor> getVendorsDetails();
	String updateVendorDetails(int id, String city, String cell_no);
	String deleteVendor(int id);
	String setProfileImage(String fileName,int custId);
	String getProfileImage(String fileName,int custId);

}
