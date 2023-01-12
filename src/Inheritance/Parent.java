package Inheritance;

public class Parent extends GrandParent {
	public Parent(int i)
	{
		System.out.println("Parents class construtor");
	}
	
public void home() {
	System.out.println("Home methode in parent class");
}
public void car() {
	System.out.println("Car methode in parent class");
}
public void capital() {
	System.out.println("capital methode inparent class");
}
public static void furniture() {
	System.out.println("static mehode in parent class ");
}
public static void main(String[]args) {
	//farm();
}
}
