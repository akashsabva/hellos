class For 
{
	For()
	{
		int x=10;
		int y=15;
	}		
	protected void finalize()
	{
		//for(int x=0; x<10; x++)  
		//{
		//	System.out.println("X="+x);
		//}	
	}
	public static void main(String args[])
	{
		For ob1=new For();
		ob1.finalize();
	}
}