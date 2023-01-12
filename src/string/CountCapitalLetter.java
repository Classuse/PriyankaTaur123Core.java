package string;
//WAP to count of Capital Letter in a string
public class CountCapitalLetter {
	
	public static void main(String[] args) {
		String s1="HeLLoo";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			int value =s2;
			if(value>=65&& value<=90)//only chang if(value>=65&& value>=90) 
				                  //this condition count the small letter.
			{
				count++;
			}
		}
		System.out.println("total number of count:"+count);
	}

}
