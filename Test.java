class Test
{
	public static void main(String args[])
	{
		Count myCount=new Count();
		
		int times=0;
		for(int i=0;i<100;i++)
		{
			
			increament(myCount,times);
		
		}
			System.out.println("count is"+myCount.count);
		System.out.println("time is"+times);
	}
	public static void increament(Count c,int times)
	{
		c.count++;
		times++;
	}
	
}
class Count
{
	public int count;
	Count(int c)
	{
		count=c;
	}
	Count()
	{
		count=1;
	}
}

