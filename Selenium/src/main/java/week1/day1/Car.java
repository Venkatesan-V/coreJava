package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("Applied break");
	}
	public void soundHorn() {
		System.out.println("Applied sound horn");
	}
	public static void main(String[] args) {

		Car vehicle=new Car ();
		vehicle.applyBreak();
		vehicle.soundHorn();
		
}
}