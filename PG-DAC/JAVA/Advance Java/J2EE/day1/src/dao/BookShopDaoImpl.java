package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import pojos.Customer;

import static utils.DBUtils.*;

public class BookShopDaoImpl implements BookShopDao {
	private Connection conn;
	private PreparedStatement pst;

	public BookShopDaoImpl() throws Exception {
		conn = fetchConnection();
		pst = conn.prepareStatement(
				"insert into my_customers (deposit_amt,email,name,password,reg_date,role) VALUES (?,?,?,?,?,?)");
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
}
