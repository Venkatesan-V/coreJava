package week3.sunday;

public interface RBI {

	public void moneyTransfer();
	//In general, methodName has body {}, In interface, no body needed.
	
	int rateOfInterest=6;
	//Any variable declaring in interface becomes Static Final Variable
	// without creating object, i can access the variable
	// Static - can be called Without creating object
	// Final - Constant - cannot change the value of the variable
	// System.out.println("Transfer 1lac" +rateOfInterest+10); +10 is not possible as per above statement
	// final int x=5; means 5 is constant and cannot be changed
	
	public void deposit();
	
	public void rateofInterest();
	
	
}
