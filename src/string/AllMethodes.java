package string;

public class AllMethodes {
	public static void main(String[] args) {
		String s="Velocity";
		int s1=s.length();
		System.out.println(s1);
		System.out.println("********");
		
		String s2="velocity";
		char c=s2.charAt(5);
		System.out.println(c);
		System.out.println("**********");
		
		
		for(int i=0;i<s1;i++) {
			char s3=s2.charAt(i);
			System.out.println(s3);
			}
		System.out.println("***********");
		
		
	String s4="Nayan";
	int s5=s4.length()-1;
	for(int i=s5;i>=0;i--)
	{
		char s6=s4.charAt(i);
		System.out.print(s6);
	}
	System.out.println("*********");


	String s7="india";
	String s8="India";
	boolean s9=s7.equals(s8);
	System.out.println(s9);//false
	
	
	String s10="India";
	String s11="india";
	boolean s12=s10.equalsIgnoreCase(s11);
	System.out.println(s12);//true
	
	String s13="Neha";
	String s14=s13.concat(" Mulani");
	System.out.println(s14);
	
	
			
		
		
		
		
		
		
		
	}
	

}
