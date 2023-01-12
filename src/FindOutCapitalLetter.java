
public class FindOutCapitalLetter {

	public static void main(String[] args) {
		String s="HEllo";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int value =c;
			if(value>=65 && value>=90)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
}
