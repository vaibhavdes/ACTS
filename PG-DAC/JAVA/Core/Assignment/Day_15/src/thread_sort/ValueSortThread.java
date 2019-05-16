package thread_sort;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.app.core.Emp;

import utils.IOUtils;

public class ValueSortThread implements Runnable{
	private Map<Integer,Emp> e1;

	public ValueSortThread(Map<Integer,Emp> e1)
	{
		this.e1 = e1;
	}

	@Override
	public void run() {
		
		Collection<Emp> c1 = e1.values();
		List<Emp> al = new ArrayList<Emp>(c1);
		al.sort((o1,o2)->o1.getHireDate().compareTo(o2.getHireDate()));
		
		try {
			IOUtils io = new IOUtils("emp1.data");
			io.writeData(al);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	

		try(FileReader fr = new FileReader("emp1.data");	) {
			int i=0;		
			while((i=fr.read())!=-1) {				
				System.out.print((char)i);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		/*al.sort(new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getHireDate().compareTo(o2.getHireDate());
				}
		});
		*/
	
		/*try(PrintWriter pw = 
				new PrintWriter(new FileWriter("emp1.data"));
				) 
		{
			pw.println(al.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
}
