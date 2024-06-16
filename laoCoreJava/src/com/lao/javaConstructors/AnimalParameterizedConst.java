package com.lao.javaConstructors;

public class AnimalParameterizedConst {

	String animal_name;
	String animal_type;
	
	public AnimalParameterizedConst (String name, String type) {
		animal_name=name;
		animal_type=type;
		System.out.println("Animal name is "+ name +" and its type is " +type);
	}
	
	public static void main(String[] args) {
		
		AnimalParameterizedConst animal= new AnimalParameterizedConst("Tiger", "Wild");
		AnimalParameterizedConst bird= new AnimalParameterizedConst("Eagle", "Bird");
		
		
	}
}
