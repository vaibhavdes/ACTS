package Inheritance;

public class Worker extends Emp{
		private int hoursWorked;
		private int hourlyRate;
		
		public Worker(String name,String email,int deptId,double basic,int hoursWorked,int hourlyRate)
		{
			super(name,email,deptId,basic);
			this.hourlyRate = hourlyRate;
			this.hoursWorked = hoursWorked;
		}
		
		public void computeNetSalary()
		{
			System.out.println("Sal: " + super.getBasic() + (hoursWorked * hourlyRate));
		}
	
		public int getRate()
		{
			return hourlyRate;
		}
		
		@Override
		public String toString()
		{
			return "Details " + super.toString() + " Hours Worked:" + hoursWorked + " Hourly Rate:" + hourlyRate;
		}
		
}
