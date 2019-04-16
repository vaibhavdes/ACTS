class ArgAvg
{
	public static void main(String[] args)
	{
		int count = 0;
		if(args.length < 2)
		{
			System.out.println("Less than Two Arguments Passed");
		}
		else
		{
			int i;
			for(i = 0; i < args.length; i++)
			{
				count = count + Integer.parseInt(args[i]);
			}
		}
		System.out.printf("Average is " + (count/args.length));
	}
}
