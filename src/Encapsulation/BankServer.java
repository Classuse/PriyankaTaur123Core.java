 package Encapsulation;
      //Note: here the variable Costomer1 is declared as private and that
      //variable we are calling inside the public methode so it is data hiding.  
public class BankServer {
	private double customer1=50000;

	public double getBalaence(int pin) 
	{
	double balence =0; 
	if(pin==1234)
	{
		System.out.println("Your Account balence is:"+customer1);
		balence =customer1;
	}
	else {
		balence=0;
		System.out.println("Please cheak your pin and try again");
	}
	return balence;
}
	public void setBalence(int amount)
	{
		if(amount<=customer1)
		{
			customer1=customer1-amount;
			System.out.println("Please collect the cash");
		}
		else {
			System.out.println("Insufficient balence");
		}
	}


}
