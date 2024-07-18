package com.z13.javaConstructors;

public class StudentDefaultConstructor {

	String Student_name;
	Integer rollNumber;
	int applicationNumber;
	boolean isFemale;
	Boolean isMale;
	
	public static void main(String[] args) {
		
		StudentDefaultConstructor studDefCons = new StudentDefaultConstructor();
		System.out.println("Constructor calls "+studDefCons.Student_name);
		System.out.println("Constructor calls " +studDefCons.rollNumber);		// returns null because Integer is a class here
		System.out.println(studDefCons.applicationNumber);		// returns zero because integer is a dataType here
		System.out.println(studDefCons.isFemale);
		System.out.println(studDefCons.isMale);
	
		
	}
}
