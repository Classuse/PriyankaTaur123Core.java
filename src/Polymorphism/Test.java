package Polymorphism;

public class Test {
	public void m1()
	{
		System.out.println("zero Arguement construtor");
	}
	public void m1(int a)
	{
		System.out.println("one Arguement Construtor");
	}
    void m1(int a,int b)
	{
		System.out.println("Two Arguement construtor");
	}
    
   static  void m1(String s)
   {
	   System.out.println("String argurment");
	}
   
    
    public static void main(String[] args) {
    	Test t=new Test();
    	t.m1(10);
        t.m1(10,20);
        m1("velocity");
    	
	}

}
