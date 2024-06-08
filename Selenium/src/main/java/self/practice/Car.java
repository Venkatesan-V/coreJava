package self.practice;

public class Car {

	public void appliedBreak() {
		System.out.println("applied Break");
	}
	public void soundHorn() {
		System.out.println("sound Horn");
	}
	public int noOfWheels(int x) {
	
		return x;
	}
	public static void main(String[] args) {
	
		Car obj=new Car();
		
		obj.appliedBreak();
		obj.soundHorn();
		
		int noOfWheels=obj.noOfWheels(4);
		System.out.println("noOfWheels " +noOfWheels);
	
		
	}

}
