package string;

public class StringInReverseOrder {
	public static void main(String[] args) {
		String s1="This is a String";
		String s2[]=s1.split(" "); 
		int s3=s2.length;
		for(int i=(s3-1);i>=0;i--)
	{
			System.out.println(s2[i]);
		}
		
	}
}
