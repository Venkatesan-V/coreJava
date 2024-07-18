package com.z21.ExceptionHandling;

public class FinallyWithException {
	
	public static int addition() {
		return 3;
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block");
			System.out.println(FinallyWithException.addition());
			System.out.println(2/0);
		}catch (Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
