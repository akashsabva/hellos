class Array
{
	public static void main(String args[])
	{
		int twoD[][]=new int[4][];
		twoD[0]=new int[2];
		twoD[1]=new int[3];
		twoD[2]=new int[4];
		twoD[3]=new int[5];
		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i+2;j++)
			{
				twoD[i][j]=k;
				k++;
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i+2;j++)
			
			System.out.print(twoD[i][j]+ " ");
			System.out.println();
		}
		
		//int a=1,b=2,c=3;
		//c+=a*b;
		//c%=6;
		//System.out.println("c= " +c);
		
		////////////////////////////////int i=100,j=200;
		////////////////////////////////while(++i<--j);
		////////////////////////////////System.out.println("i="+i);
		////////////////////////////////System.out.println("j="+j);
		
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\throws java.io.IOException;
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\{
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\	String str;
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\	System.out.println("Please Enter Name:");
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\	str= System.in.read();
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\	System.out.println("Your Name="+str);
		///////////Page-91=ERROR\\\\\\\\\\\\\\\\\\\\\\}
		
		//for(;;)
		//{
		//	System.out.println("Please Enter Name:");
		//}
		
		
	}
		
}