package pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static pack2.CollectionUtils.populateData;
 
public class Tester {
	public static void main(String[] args) {
		
		//serialization
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.data")))
		{
			Map<Integer,Emp> hm = populateData();
			out.writeObject(hm);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//de-serialization
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.data")))
		{
			System.out.println(in.readObject());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
