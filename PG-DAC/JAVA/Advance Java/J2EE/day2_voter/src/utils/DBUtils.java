package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	public static Connection fetchConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"root","root");
	}
}
