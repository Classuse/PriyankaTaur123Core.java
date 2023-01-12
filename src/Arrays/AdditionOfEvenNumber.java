package Arrays;

public class AdditionOfEvenNumber {
	public static void main(String[] args) {
		int a[]= {15,20,10,26,48,90,19};
		int add=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)//Odd number(a[i]%2==1)
			{
				System.out.println(a[i]);
				add=add+a[i];
				
			}
		}
		System.out.println("Results:"+add);
	}

}
