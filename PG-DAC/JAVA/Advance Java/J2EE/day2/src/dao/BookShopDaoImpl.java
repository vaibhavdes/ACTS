package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pojos.Customer;

import static utils.DBUtils.*;

public class BookShopDaoImpl implements BookShopDao {
	private Connection conn;
	private PreparedStatement pst,pst1;

	public BookShopDaoImpl() throws Exception {
		conn = fetchConnection();
		pst = conn.prepareStatement(
				"insert into my_customers (deposit_amt,email,name,password,reg_date,role) VALUES (?,?,?,?,?,?)");
		pst1 = conn.prepareStatement("select * from my_customers where email=? and password=?");
		System.out.println("DAO CREATED");
	}

	public void CleanUp() throws Exception {
		if (pst != null)
			pst.close();
		if (conn != null)
			conn.close();
	}

	@Override
	public String register_customer(double depositAmount, String email, String name, String password, Date regDate,
			String role) throws Exception {

		pst.setDouble(1, depositAmount);
		pst.setString(2, email);
		pst.setString(3, name);
		pst.setString(4, password);
		pst.setDate(5, regDate);
		pst.setString(6, role);

		int ret = pst.executeUpdate();
		if (ret != 0) {
			return "true";
		}
		return "false";
	}
	
	@Override
	public Customer validateCustomer(String email, String pass) throws Exception {
		// set IN params
		pst1.setString(1, email);
		pst1.setString(2, pass);
		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				return new Customer(rst.getInt(1), rst.getDouble(2), email, rst.getString(4), pass, rst.getDate(6),
						rst.getString(7));
		}
		return null;
	}
}
