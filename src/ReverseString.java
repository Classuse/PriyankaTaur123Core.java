
public class ReverseString {
	public static void main(String[] args) {
		String s="Program";
		int L=s.length();
		System.out.println(L);
		for(int i=L-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.print(c);
			
		}
	}

}
