
public class RemoveTheAlphabets {
	public static void main(String[]args) {
		String s1="dhn8f5d896fgg6";
		//int l=s1.length();
		String numeric="";
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(s1.charAt(i)))
			{
				numeric=numeric+s1.charAt(i);
			}
		}
		System.out.println("The Numeric Strung is:"+numeric);
	}

}
