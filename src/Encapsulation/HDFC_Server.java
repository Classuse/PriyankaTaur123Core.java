package Encapsulation;

public class HDFC_Server {
	private int customerId;
	private String customerName;
	
	HDFC_Server(int customerId,String customerName)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	

}
