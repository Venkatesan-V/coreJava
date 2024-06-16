package com.lao.polymorphism;

public class OverLoad {

	public int method1 (int a, int b) {
		System.out.println("method 1 executed");
		return a+b;
	}
	public int method1 (int a, int b, int c) {
		System.out.println("method 2 executed");
		return a*b*c;
	}
	public static void main(String[] args) {
		
		OverLoad overloading= new OverLoad();
		
		System.out.println(overloading.method1(12, 13));
		System.out.println(overloading.method1(2, 3, 4));
		
	}
	
}
