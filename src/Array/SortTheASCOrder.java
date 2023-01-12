package Array;

public class SortTheASCOrder {
	public static void main(String[] args) {
		int []a= {9,7,8,5,4,2,3,0,1,6};
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
					
				}
			}
		}
		for (int aa:a) {
		System.out.print(aa+" ");
		}
	}

}
