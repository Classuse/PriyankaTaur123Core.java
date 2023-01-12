package Loops;

public class Even_Odd {
	public static void main(String[] args) {
		int a=1;
		while(a<=50) {
			if (a%2==0) {
				System.out.println(a+"even no");
			}
			else {
				System.out.println(a+"odd no");
			}
			a++;
		}
	}

}
