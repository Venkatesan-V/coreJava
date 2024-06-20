package com.sixth.staticMethods;

public class StaticMethodEx {

	public static void staticMethod() {
		System.out.println("callable");
	}

	public void nonStaticMethod () {
		System.out.println("non callable");
	}
	
	public static void main(String[] args) {
		
		StaticMethodEx statMeth= new StaticMethodEx();
		statMeth.nonStaticMethod();

		staticMethod();
	}
}
