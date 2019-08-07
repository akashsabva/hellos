import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

class Abc
{
	
}
class Fun
{
	public static void main(String args[])
	{
		System.out.println("Hellos Programmer...");
		System.out.println("  1. Arithmatic Operation");
		System.out.println("  2. Logical Operation");
		System.out.println("  3. Relational Operation");
		System.out.println("  4.Increment-Decrement");
		System.out.println("  Choose Any One");
		Scanner ob1=new Scanner(System.in);   
		int choice=ob1.nextInt();
		
		switch(choice)
		{
			case 1:
			System.out.println("  A. Addition");
			System.out.println("  B. Substraction");
			System.out.println("  C. Multiplication");
			System.out.println("  D. Divison");
			System.out.println("  Choose Any One");
			Scanner ob2=new Scanner(System.in);   
			char choice2= ob2.nextLine().charAt(0);
			switch(choice2)
			{
				case 'A':
					System.out.println("Please Enter Any Two Value:");
					Scanner a=new Scanner(System.in);   
					int add=a.nextInt();
					Scanner b=new Scanner(System.in);   
					int add2=b.nextInt();
					int addition;
					addition=add+add2;
					System.out.println("Your Addition:"+addition);
					break;
				case 'B':
					System.out.println("Please Enter Any Two Value:");
					Scanner c=new Scanner(System.in);   
					int sub=c.nextInt();
					Scanner d=new Scanner(System.in);   
					int sub2=d.nextInt();
					int substraction;
					substraction=sub+sub2;
					System.out.println("Your substraction:"+substraction);
					break;
				case 'C':
					System.out.println("Please Enter Any Two Value:");
					Scanner i=new Scanner(System.in);   
					int mul=i.nextInt();
					Scanner j=new Scanner(System.in);   
					int mul2=j.nextInt();
					int multiplicaion;
					multiplicaion=mul+mul2;
					System.out.println("Your multiplication:"+multiplicaion);
					break;
				case 'D':
					System.out.println("Please Enter Any Two Value:");
					Scanner k=new Scanner(System.in);   
					int div=k.nextInt();
					Scanner l=new Scanner(System.in);   
					int div2=l.nextInt();
					int division;
					division=div+div2;
					System.out.println("Your division:"+division);
					break;
			}
			break;
			case 2:
				System.out.println("  A. OR");
				System.out.println("  B. AND");
				System.out.println("  C. NOT");
				System.out.println("  Choose Any One");
				Scanner ob3=new Scanner(System.in);   
				char choice3= ob3.nextLine().charAt(0);
			switch(choice3)
			{
				case 'A':
					System.out.println("Please Enter 0 or 1");
					Scanner e=new Scanner(System.in);   
					int or=e.nextInt();
					Scanner f=new Scanner(System.in);   
					int or2=f.nextInt();
					int orr;
					orr=or|or2;
					System.out.println("Your OR Operation is:"+orr);
					break;
				case 'B':
					System.out.println("Please Enter 0 or 1");
					Scanner g=new Scanner(System.in);   
					int and=g.nextInt();
					Scanner h=new Scanner(System.in);   
					int and2=h.nextInt();
					int andd;
					andd=and&and2;
					System.out.println("Your AND Operation is:"+andd);
					break;
				case 'C':
					System.out.println("Please Enter 0 or 1");
					Scanner m=new Scanner(System.in);   
					int not=m.nextInt();
					//Scanner f=new Scanner(System.in);   
					//int or2=f.nextInt();
					int nott;
					nott=~not;
					System.out.println("Your NOT Operation is:"+nott);
					break;
			}
			break;
		}
	}
}	