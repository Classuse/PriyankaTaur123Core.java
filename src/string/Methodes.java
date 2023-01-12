package string;

public class Methodes {
	public static void main(String[] args) {
		String a="Hello Everyone";
		int s1=a.length();
		System.out.println(s1);
		
		String a1=a.concat("to All");
		System.out.println(a1);
		
		String s2="NarmadaPuram";
		String s3=s2.substring(7);
		System.out.println(s3);
		System.out.println("*****");
		String s5=s2.trim();
		System.out.println(s5);
		
		String s4=s2.substring(0,7);
		System.out.println(s4);
		
		String c="PuneCity";
		String c1=c.replace("Pune","Aurangabad");
		System.out.println(c1);
		
		}
}
