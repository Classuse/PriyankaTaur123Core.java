package Inheritance;

public class Chlid extends Parent {
	public Chlid(int a,int b)
	{   super(10);
		System.out.println("Child class construtor");
	}
	
	public void bike() { 
		System.out.println("bike methode with in child class");
		furniture();
		
	}
	public static void main(String[]args) {
    Chlid c=new Chlid(20,30);
    
	c.bike();
	c.home();
	c.car();
	c.capital();
	farm();
	
	}
	

}
