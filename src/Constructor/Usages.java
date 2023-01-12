package Constructor;

public class Usages {
	int i;
	String s;
	public Usages(int u,String ss) {
		i=u;
		s=ss;
	}
	public static void main(String[] args) {
		 Usages u1=new  Usages(10,"velocity");
		 Usages u2=new  Usages(20,"Motning batch");
		 System.out.println(u1.s);
		 System.out.println(u2.i);
	}

}
