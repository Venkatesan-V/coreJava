package week3.sunday;

public class ICICI implements RBI, BankRules {

	//@Override // this Override can be removed- no problem
	
	public void moneyTransfer() {
		System.out.println("Transfer 1lac");
	}

	//@Override
	public void deposit() {
		System.out.println("Deposit 3lac");
	}

	//@Override
	public void rateofInterest() {
		System.out.println("ROI is 8%"); 		
	}

	//@Override
	public void KYCdoc() {
		System.out.println("Mandatory document");
	}	

	//@Override
	public void Signature() {
		System.out.println("Signature is Mandatory " +rateOfInterest);
	}
		
	
	public static void main(String[] args) {
	
	ICICI obj=new ICICI();
	obj.moneyTransfer();
	obj.deposit();
	obj.rateofInterest();
	obj.KYCdoc();
	obj.Signature();
	}
}
