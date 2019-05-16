package utils;
import java.sql.*;

public class DBUtils {
//method to ret db connection
	public static Connection fetchConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/test";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, "root", "root");
	}
}
