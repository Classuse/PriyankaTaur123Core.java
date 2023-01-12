package string;

public class CountATotaolNoOfAlphabet {
	public static void main(String[] args) {
		String s1="Hellow1234";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			if(Character.isAlphabetic(s2))
			{
				count++;
				
			}
		}
		System.out.println("Total Numeric charactors are :"+count);
	}


}
