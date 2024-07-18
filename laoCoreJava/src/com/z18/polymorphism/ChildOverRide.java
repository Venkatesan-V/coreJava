package com.z18.polymorphism;

public class ChildOverRide extends OverRiding {

	public void college() {
		System.out.println("study in VLB");
	}
	
	public void place () {
		System.out.println("study in CBE");
	}
	
	public static void main(String[] args) {
		
		OverRiding ride=new ChildOverRide();
		ride.college();
		ride.place();
		
		OverRiding newride=new OverRiding(); //parentClass
		newride.college();
		newride.place();
		
	}
}
