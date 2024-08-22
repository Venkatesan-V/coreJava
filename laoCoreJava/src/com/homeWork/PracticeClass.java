package com.homeWork;

public class PracticeClass {

	String animal_name;
	int animal_num;
	
	public PracticeClass(String name, int num) {
		animal_name=name;
		animal_num=num;
		System.out.println("animal name :" +name +"animal number :" + num);
	}
	
	public static void main(String[] args) {
		
		PracticeClass obj = new PracticeClass("Lion", 1001);
		
		
		
	}
	
	
	
	
	
	

}