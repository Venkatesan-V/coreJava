package week1.day1;

public class Mobile {

		public void sendSms() {
			System.out.println("I send one SMS");
	
			String mobileModel= "realme";
			float mobileWeight= 198f;
	}
	
		public void makeCall() {
			System.out.println("I have to make Calls");	
	
			boolean fullyCharged= true;
			int mobileCost=14000;
	}
		
	public static void main(String[] args) {
	
		Mobile specifications=new Mobile();
		
		System.out.println("This is my mobile");
		
//		specifications.sendSms();
//		specifications.makeCall();
		
		
		String mobileModel= "realme";
		float mobileWeight= 198f;
		boolean fullyCharged= true;
		int mobileCost=14000;
		
		System.out.println("model of my mobile is " +mobileModel);
		System.out.println("Weight of my mobile is " +mobileWeight);
		System.out.println("Is it charged full? " +fullyCharged);
		System.out.println("Cost of my mobile is " +mobileCost);
		
	}

}
