package Loops;

public class Pattern {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		for( i=5;i>=1;i--)
		{
			for(j=1;j<=5;j++)
			{
				if(j>=1 && j>=i) {
				System.out.print("* ");
				}
	
			else 
			{
			System.out.print(" ");
			}
		}
			System.out.println();
		}
	}
}
