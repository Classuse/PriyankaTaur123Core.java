package Constructor;

public class Demo {
	public Demo() {
		this("hii");
		System.out.println("Zero Arguement Consructor");
	}
	
	public Demo(int a) {
		
	System.out.println("One Arguement Consrutor");
		}
	public Demo (String s)
	{
		System.out.println("String Arguement construtor");
	}
	public static void main(String[] args) {
		Demo o=new Demo();
		
		
	}

}
