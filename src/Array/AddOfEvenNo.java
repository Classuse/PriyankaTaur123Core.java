package Array;

public class AddOfEvenNo {
	public static void main(String[] args) {
		int a[]= {2,5,4,8,7,2,3};
		int add=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
				add=add+a[i];
			}
		}
		System.out.println(add);
	}

}
