package com.lao.javaConstructors;

public class ChildClass extends ParentClass {

	public ChildClass () {
		
		/*
		 * when we extends other class by default it will call parentclass constructor
		 * super(); is present hidden
		 */
		System.out.println("she is an IAS office with first rank in the batch");
	}
	
	public static void main(String[] args) {
		
		ChildClass child= new ChildClass();
		
		
	}
	
}
