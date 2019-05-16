package thread_sort;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

import com.app.core.Emp;

public class KeySortThread implements Runnable {
	private Map<Integer,Emp> e1;
	
	public KeySortThread(Map<Integer,Emp> e1)
	{
		this.e1 = e1;
	}
	
	@Override
	public void run() {
		TreeMap<Integer,Emp> t1 = new TreeMap(e1);
		try(PrintWriter pw = 
				new PrintWriter(new FileWriter("emp.data"));
				) 
		{
			pw.println(t1.entrySet());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try(FileReader fr = new FileReader("emp.data");	) {
			int i=0;		
			while((i=fr.read())!=-1) {				
				System.out.print((char)i);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
