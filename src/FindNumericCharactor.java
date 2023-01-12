
public class FindNumericCharactor {
	public static void main(String[] args) {
		String s="achi1023b9hgh0";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
			count++;	
			}
		}
		System.out.println(count);
	}

}
