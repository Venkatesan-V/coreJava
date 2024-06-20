package week3.sunday;

public class SBI extends Apartment implements RBI, BankRules {

	
	public void KYCdoc() {
		System.out.println("Aadhar is Mandatory");
	}

	
	public void Signature() {
		System.out.println("Signature is Mandatory");
	}

	
	public void moneyTransfer() {
		System.out.println("Transfer 1");
	}

	
	public void deposit() {
		System.out.println("Deposit 1");
	}

	
	public void rateofInterest() {
		System.out.println("ROI 5%");
	}
	
	public static void main(String[] args) {
		SBI bank= new SBI();
		bank.deposit();
		bank.KYCdoc();
		bank.Signature();
		bank.moneyTransfer();
		bank.rateofInterest();
		bank.noOfFloors();
		bank.underConstruction();
	}

	@Override
	public void underConstruction() {
		System.out.println("Space given to the Bank");
		
	}
	}


