package com.z16.staticMethods;

public class StaticBlockEx {

	static {
		System.out.println("print static block 1");
	}
	static {
		System.out.println("print static block 2");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("print main method");
		
		
	}
}
