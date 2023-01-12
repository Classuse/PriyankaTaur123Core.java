package Loops;

public class Palindrome_Number {

	public static void main(String[] args) {
		int no=12345;
		int Orignalno=12345;
		int reverse=0;
		while(no!=0) {
			int remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
			
		}
System.out.println("Reverse Number is "+reverse);


if(Orignalno==reverse) {
	System.out.println(reverse+"number is palindrome");
	
}
else {
	System.out.println(reverse+" no is not palindrome");
}
	}

}
