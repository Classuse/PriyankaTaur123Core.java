
public class CountTheElementg {
	public static void main(String[] args) {
		String s="Prohsaaad";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			//char c=s.charAt(i);
			if(s.charAt(i)=='a')
			{
				count=count+1;
			}
			
		}
		System.out.println(count);	
	}

}
