package com.lao.javaConstructors;

public class ConstructorOverloading {
	
	String draw;

	public ConstructorOverloading () {
		System.out.println("object created");
	}
	
	public ConstructorOverloading (String todraw) {
		draw= todraw;
		System.out.println("Drawing " +todraw);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading constOverLoad= new ConstructorOverloading();
			
		ConstructorOverloading drawing= new ConstructorOverloading("rectangle");
		
		
		
	}
	
}
