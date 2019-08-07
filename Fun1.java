import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Abc
{
	int length;
	int width;
	Abc(int l,int w)
	{	
		length=l;
		width=w;
	}
}
class Fun
{
	public static void main(String args[])
	{
		System.out.println("Please Enter Any Two Value:");
		Scanner ob1=new Scanner(System.in);   
			int i=ob1.nextInt();
			//System.out.println(i);
		Scanner ob2=new Scanner(System.in);   
			int j=ob2.nextInt();
			//System.out.println(j);
	
		Abc a=new Abc(i,j);
		int area;
		area=a.length*a.width; 
		System.out.println("Area="+area);
	
	}
}	