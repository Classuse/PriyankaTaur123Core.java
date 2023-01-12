package Loops;

public class Practies {
	public static void main(String[] args) {
	int no=1234;
	int orignalno=1234;
	int reverse=0;
	while(no!=0)
	{
		int c=no%10;
		reverse=reverse *10+c;
		no=no/10;
	}
	System.out.println("This is a Reverse No"+reverse);
	
	if(orignalno==reverse) {
		System.out.println("this no is palidrome");
	}
	else {
		System.out.println("this no is not palidrome");
	}

}
}
