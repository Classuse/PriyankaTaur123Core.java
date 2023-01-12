package string;
//WAP to count the tital number of numeric charactor present in a  string.
public class CountATotalNumericCharactor {
	public static void main(String[] args) {
		String s1="Hellow1234";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			if(Character.isDigit(s2))
			{
				count++;
				
			}
		}
		System.out.println("Total Numeric charactors are :"+count);
	}

}
