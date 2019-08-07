interface MyInterface {
  void callback(int param);

}

abstract class Partially implements MyInterface {
  static int a=5;
  static int b=10;
 

  public static void show() {
    System.out.println(a + " " + b);
    System.err.println("Test");
	
  }
	public static void main(String args[])
	{
		show();
	}
}
	