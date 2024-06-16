package com.lao.ExceptionHandling;

public class FinallyEx {

	public static void main(String[] args) {


		try {
			System.out.println("Inside try block");
		}catch (Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}