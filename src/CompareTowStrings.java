
public class CompareTowStrings {
	public static void main(String[]args)
	{
		String s1="hellow";
		  String s2="java";
		  boolean s3=s1.equals(s2);
		  System.out.println(s3);//fals
		  
		  boolean s4=s1==s2;
		  System.out.println(s4);//fals 
		  
		  int lengthCount=s1.length();
		  System.out.println(lengthCount);
		  
		  char findCaractor=s1.charAt(5);
		  System.out.println(findCaractor);

		  StringBuffer sb1 = new StringBuffer("hellow");
		  sb1.reverse();
		  System.out.println(sb1);
	}


}
