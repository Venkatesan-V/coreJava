package week3.sunday;

public class MyFlat extends Apartment {

	public static void main(String[] args) {
		
		MyFlat buy=new MyFlat();
		buy.underConstruction();
		buy.noOfFloors();
	}

	@Override
	public void underConstruction() {
		System.out.println("Implement my own design ");
		
	}

}
