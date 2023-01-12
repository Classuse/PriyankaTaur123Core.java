package string;
// WAP to print Reverse a String
public class Reverse_String {
	public static void main(String[] args) {
		String s1="Hellow";
		int s2=s1.length()-1;
		for(int i=s2;i>=0;i--)
		{
			 char s3=s1.charAt(i);
			 System.out.print(s3);
		}
	}

}
