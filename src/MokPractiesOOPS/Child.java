package MokPractiesOOPS;

public class Child extends Parent {
	static String s1 ="abc";
	
	public void bike()
	{
		System.out.println(super.s1);
		System.out.println("bike method from the child class");
	}
	
	public static void main(String[] args) {
		Child d=new Child();
		d.car();
		d.bike();
		d.motarCycle();
		Parent p=new Parent();
		p.car();
		//p.bike();
		p.motarCycle();
		farm();
		System.out.println(s1);
		
		
		
	}


}
