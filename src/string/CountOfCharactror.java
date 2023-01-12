package string;
//WAP to print the count of charactor inside a string.
public class CountOfCharactror {
	public static void main(String[] args) {
		String s1="Hellasasjava";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			if(s2=='j')
			{
				count++;
			}
		}
		System.out.println("Inside a String Characrot j ="+count);
	}

}
