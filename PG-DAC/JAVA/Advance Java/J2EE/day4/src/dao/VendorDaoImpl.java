package dao;

import static utils.DBUtils.fetchConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pojos.Vendor;

public class VendorDaoImpl implements VendorDao{
	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4;
	public VendorDaoImpl() throws Exception {
		// get cn
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from my_vendors");	
		pst2 = cn.prepareStatement("update my_vendors set cell_no=?,city=? where id=?");
		pst3 = cn.prepareStatement("delete from my_vendors where id=?");
		pst4 = cn.prepareStatement("insert into my_vendors VALUES(default,?,?,?,?,?,?,?)");
		System.out.println("dao created...");
	}
	public void cleanUp() throws Exception {
		if (pst1 != null)
			pst1.close();
		if (cn != null)
			cn.close();
	}

	@Override
	public List<Vendor> getAllVendors() throws Exception {
		ArrayList<Vendor> vendors = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				vendors.add(new Vendor(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getDouble(6),rst.getDate(7),rst.getString(8)));
		}
		System.out.println("dao rets vendors " + vendors);
		return vendors;
	}

	@Override
	public String updateVendor(String city, String phone, int id) throws Exception {
		// TODO Auto-generated method stub
		pst2.setString(1,city);
		pst2.setString(2,phone);
		pst2.setInt(3, id);
		
		int rst = pst2.executeUpdate();
		if(rst==0)
				return "fail";
		else
				return "success";
	}
	@Override
	public String deleteVendor(int id) throws Exception {
		pst3.setInt(1, id);
		boolean rst = pst3.execute();
		if(rst)
			return "fail";
		else
			return "success";
	}
	
	@Override
	public String addVendor(String email, String name, String city, String cell_no, double regAmount, String regDate,
			String role) throws Exception {
		pst4.setString(1, email);
		pst4.setString(2, name);
		pst4.setString(3, city);
		pst4.setString(4, cell_no);
		pst4.setDouble(5, regAmount);
		pst4.setDate(6,Date.valueOf(regDate));
		pst4.setString(7, role);

		boolean rst = pst4.execute();
		if(rst)
			return "fail";
		else
			return "success";
	}

}
