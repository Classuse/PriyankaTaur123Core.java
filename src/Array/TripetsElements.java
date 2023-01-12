package Array;
//WAP to find out the which got add to form 11.
public class TripetsElements {
	public static void main(String[] args) {
		int a[]= {5,5,1,2,3,3};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;i<a.length;j++)
			{
				for(int k=0;i<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==11)
					{
						System.out.println(a[i]+""+a[j]+""+a[k]);
					}
				}
			}
		}
	}

}
