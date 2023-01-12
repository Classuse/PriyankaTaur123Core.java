package Polymorphism;

public class B extends A {
	public void m1() {
		System.out.println("m1 methode from B class");
	}
	public int m2(int i) {
		System.out.println("m2 methode with arguement B claa");
		return i;
	}
	public static void m3(int a) {
		System.out.println("static methode from B class");
	}
	public void m4(String s) {
		System.out.println("m4 methode from B class");
	}
	void marry()
	{
		System.out.println("Child class marry methode");
	}
	static void m5(int a,int b) {
		 System.out.println("m5 methode in A class");
	 }
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2(60);
		b.m4("hii");
		b.marry();
		b.m5(10,20);
		
		A a =new A();
		a.m1();
		a.marry();
		a.m5(10);
		
		A a1=new B();
		a1.m1();
		a1.m2(60);
		a1.m4();
		a.m3(10);
		
		
		
	}

}
