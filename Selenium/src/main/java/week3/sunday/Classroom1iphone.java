package week3.sunday;

public class Classroom1iphone extends Classroom1Android implements Classroom1Mobile {

	public void sendSMS() {
		System.out.println("send SMS");
		
	}

	public void dialNumber() {
		System.out.println("dial number");
		
	}

	public void switchON() {
		System.out.println("switch ON");
		
	}

	public void touchPad() {
		System.out.println("Touch Pad");
		
	}
	
	public static void main(String[] args) {
		
		Classroom1iphone obj=new Classroom1iphone();
		obj.makeCall();
		obj.touchPad();
		obj.sendSMS();
		obj.dialNumber();
		obj.switchON();
	
	}
	


	
	
	
	
	
		
}



