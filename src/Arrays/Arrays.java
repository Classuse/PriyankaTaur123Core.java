package Arrays;

public class Arrays {
	public static void main(String[] args) {
		int a[]= {5,3,2,8,4,1,0,9};
		int c;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					c=a[j];
					a[j]=a[i];
					a[i]=c;
				}
			}
		}
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
	}

}
