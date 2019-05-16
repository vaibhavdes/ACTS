package utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Emp;

public class IOUtils {
	private PrintWriter pw;
	
	public IOUtils(String fileName) throws Exception
	{
		pw = new PrintWriter(new FileWriter(fileName));
	}
	
	public void cleanUp()
	{
		if(pw!=null)
			pw.close();
	}
	
	public void writeData(List<Emp> li)
	{
		pw.println(li.toString());
	}
}
