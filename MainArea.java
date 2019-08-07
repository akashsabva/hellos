import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Area
{
	int length;
	int width;
	Area(int l,int w)
	{
		System.out.println("Hellos..");	
		length=l;
		width=w;
	}
}

class MainArea
{
	public static void main(String args[])
	{
		Scanner ob1=new Scanner(System.in);   
			int i=ob1.nextInt();
			System.out.println(i);
		Scanner ob2=new Scanner(System.in);   
			int j=ob2.nextInt();
			System.out.println(j);	
		
		
		
        	
		Area a=new Area(i,j);
		//Area b=new Area();
		////////////////////////Area b=a;
		//a.length=5;
		//a.width=10;
		
		int area1;
		area1=a.length*a.width;
		System.out.println("Area1="+area1);	
	
	}
}