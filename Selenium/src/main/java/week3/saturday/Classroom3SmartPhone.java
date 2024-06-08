package week3.saturday;

public class Classroom3SmartPhone extends Classroom3AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("Connecting WhatsApp");
	}
	
	public static void main(String[] args) {
		Classroom3SmartPhone obj=new Classroom3SmartPhone();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		obj.takeVideo();

	}
}
