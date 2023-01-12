package Encapsulation;

public class ATM {
	public static void main(String[] args) {
		HDFC_Server o=new HDFC_Server(101,"priyanka");
		int id=o.getCustomerId() ;
		String Name=o.getCustomerName();
		System.out.println("Customer Name: "+id);
		System.out.println("CustomerId:  "+Name);
	}

}
