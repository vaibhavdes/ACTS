package pack1;
import static com.app.core.CollectionUtils.populateData;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Dept;

import thread_task.HireDateSortThread;
import thread_task.SalarySortThread;

public class Tester {
	public static void main(String[] args) {
		Map<String,Dept> deptEmp = populateData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dept");
		//P.1 When Entered Same Department | Concurrent Modification Exception Because of Unsync access to Shared Resource i.e List/ArrayList
		Thread t1 = new Thread(new HireDateSortThread(deptEmp,sc.next()),"HireDate");
		Thread t2 = new Thread(new SalarySortThread(deptEmp,sc.next()),"Salary");
		t1.start();
		t2.start();
		
		//Orphans
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(sc!=null)
			sc.close();
	}
}
