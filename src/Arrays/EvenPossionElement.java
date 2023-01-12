package Arrays;
//WAP to print the Even/Odd Position element
public class EvenPossionElement {
	public static void main(String[] args) {
		int a[]= {10,20,25,36,40,89};
	
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)//(i%2==1) Odd Position
			{
				System.out.println(a[i]);
				
			}
		}
		
	}

}
