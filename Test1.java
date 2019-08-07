import java.lang.Thread;
class A extends Thread
{
	A()
	{
		System.out.println("1");
	}
	public void run()
	{
		System.out.println("2");
	}
}
public class Test1
{
	public static void main(String args[])
	{
		Thread a = new A();
		
		a.start();
	}
}