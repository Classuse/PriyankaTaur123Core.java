
public class RemoveSpacess {
	public static void main(String[] args) {
		String as1= "   This       is       String     ";
		String as2=as1.trim();
		//System.out.println(as2);
		for(int i=0;i<as2.length();i++)
	    {
			as2=as2.replace("  ", " ");//first ""2 spaces&""1spacs.
		}
		System.out.println(as2);
	}
	

}
