package Constructor;

public class Test {
	public Test() {
		this("velocity");
		System.out.println("Zero Arguement Costructor");
	}
	public Test(String s) {
		System.out.println("one Arguement Constrcutor "+s);
		
	}
	public Test(String s,int a) {
		System.out.println("Two Argument Constructor= "+s+" "+a);
	}
	public Test(String s,float f,int a) {
		System.out.println("three Argument Constructor");
	}
	
	
	
	public static void main(String[] args) {
		Test t1=new Test();
		
		Test t3=new Test(" class",01);
		Test t5= new Test(" hii " ,0.05f,20);
		
		
	}
	

}
