package week3.sunday;

public class Execution {

	public static void main(String[] args) {
		
		//we can not create object for interface
		
		ICICI bank=new ICICI();
		bank.deposit();
		bank.moneyTransfer();
		bank.rateofInterest();
		
		
		SBI sbi=new SBI();
		sbi.KYCdoc();
		sbi.Signature();
		
		RBI rules=new ICICI(); // LearnCollection-->List
		RBI srules=new SBI();
		
	}

}
