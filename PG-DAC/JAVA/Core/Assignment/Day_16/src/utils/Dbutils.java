package utils;

import java.sql.*;

public class Dbutils {
	public static Connection fetchConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url,"root","root");
	}
}
