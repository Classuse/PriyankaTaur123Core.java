
public class PrintTheProgramLineByLine {
public static void main(String[] args) {
	String s="JavaProgram";
	int L=s.length();
	System.out.println(L);
	for(int i=0;i<L;i++)
	{
		char c=s.charAt(i);
		System.out.println(c);
	}
}

}
