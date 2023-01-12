package Loops;

public class Reverse_Number {
	public static void main(String[] args) {
		int a=1234;
		int reverse=0;
		while(a!=0)	
		{
		int c=a%10;
		reverse =reverse*10+c;
		a=a/10;
		}
		
		System.out.println("Reverse number is "+reverse);
		

//	if(a==reverse)
//	{
//		System.out.println("Number is palindrome");
//	}
//	else {
//		System.out.println("Number is not palindrome");
//	}

}
}
