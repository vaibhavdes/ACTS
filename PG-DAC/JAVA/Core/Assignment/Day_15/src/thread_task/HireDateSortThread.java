package thread_task;

import java.util.List;
import java.util.Map;

import com.app.core.Dept;
import com.app.core.Emp;

import utils.IOUtils;

public class HireDateSortThread implements Runnable{
	private Map<String,Dept> e1;
	private String deptName;
	public HireDateSortThread(Map<String,Dept> e1,String deptName)
	{
		this.e1 = e1;
		this.deptName = deptName;
	}

	@Override
	public void run() {
		System.out.println("started thread "+Thread.currentThread().getName());
		//Collection<Emp> c1 = e1.get(deptName).getEmps();
		
		List<Emp> al = e1.get(deptName).getEmps();
		synchronized(al)
		{
			System.out.println("in lock "+Thread.currentThread().getName());
		//al.stream().filter(i->i.getHireDate()).sorted((o1,o2)->o1.getHireDate().compareTo(o2.getHireDate())).forEach(System.out::println);;
		al.sort((e1,e2)->e1.getHireDate().compareTo(e2.getHireDate()));
		
		
		try {
			IOUtils io = new IOUtils("date_emp.data");
			io.writeData(al);
			io.cleanUp();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println("released lock "+Thread.currentThread().getName());
		}
		System.out.println("over thread "+Thread.currentThread().getName());
	}
}
