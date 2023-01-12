package Inheritance;

public class A  {
	int a=50;
	static void m1() {
		int a =10;
		int b=10;
		int c=a+b;
		
		System.out.println(a);
		
		System.out.println(c);
		
		System.out.println("static methode");
	}
	public void m2()
	{
		System.out.println(this.a);
		System.out.println("Non static methode");
	}
	
	

}
