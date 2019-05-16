package pack1;

public class Tester {
	
	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread(new EvenPrinter(),"even");
		Thread t2 = new Thread(new OddPrinter(),"odd");
		
		t1.start();
		t2.start();
		
		//No Orphan
		t1.join();
		t2.join();
	}

}
