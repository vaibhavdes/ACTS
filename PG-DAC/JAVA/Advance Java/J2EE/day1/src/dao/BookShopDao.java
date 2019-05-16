package dao;

import java.sql.Date;

import pojos.Customer;

public interface BookShopDao {
	String register_customer(double depositAmount, String email, String name, String password, Date regDate,
			String role) throws Exception;
}
