
public class RemoveTheNumbers {
	public static void main(String[]args) {
		String s1="dhn8f5d896fgg6";
		//int l=s1.length();
		String alphabet="";
		for(int i=0;i<s1.length();i++) {
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				alphabet=alphabet+s1.charAt(i);
			}
		}
		System.out.println("The Numeric Strung is:"+alphabet);
	}


}
