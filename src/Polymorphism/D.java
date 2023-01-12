package Polymorphism;

public class D extends C{
	int i=200;
	String s="class";
public static void main(String[] args) {
	C c=new C();
	D d=new D();
	System.out.println(d.s);
	System.out.println(d.s1);
	System.out.println(c.s1);
	//System.out.println(c.s);   parent can not be access the proprties of class he will access oly own properties
	System.out.println(d.i);
	System.out.println(c.i);
	}

}