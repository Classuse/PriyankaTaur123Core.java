package Array;

import java.util.Arrays;

//WAP to separate 1 and 0 insode an array
public class SeparateZero_One {

	public static void main(String[] args) {
		int []a= {0,0,1,1,0,1,0,1,1};
		//Arrays.sort(a);
		//for (int aa:a)
		//System.out.print(aa+" ");
		//Without using sort methode.
		 
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
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
