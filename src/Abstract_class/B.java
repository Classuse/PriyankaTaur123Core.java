package Abstract_class;

public abstract class B extends A {
	//public static void main(String[] args) {
		//B o=new B();
		//o.update();
		//o.insert();
		
	

	@Override
	public void delete() {
		System.out.println("Delete from delete methode");
		
	}

	@Override
	public abstract void viewPhoto() ;
	
}

