package pack1;

public class OddPrinter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 100; i++)
			if(i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				try
				{
					Thread.sleep(100);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		System.out.println("Odd Printer Over");
	}

}
