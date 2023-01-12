package Arrays;

public class AddTheNumberOfEvenPositon {
	public static void main(String[] args) {
		int a[] ={10,20,30,40,60,70};
		int Add=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)//Odd Position (i%2==1)
			{
				Add=Add+a[i];
				System.out.println(a[i]);
			}
		}
		System.out.println("Addition of Even Position element:"+Add);
	}

}
