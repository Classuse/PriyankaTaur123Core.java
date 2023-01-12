package Singaltone;

//this is the singaltone class which we will able to access/create only one object inside a class

public class A {
	static int i=10000;
	private static	A a=new A();
	 private A()
	 {
		 
	 }
public static A getobject()
{
return a;	
}

}
