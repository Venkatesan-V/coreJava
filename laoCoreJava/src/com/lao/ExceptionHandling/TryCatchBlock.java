package com.lao.ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=10;
		
		try {
			int result= num2/num1;
			System.out.println(result);
		} catch (ArithmeticException e) {
			int result= num2/2;
			System.out.println(result);
		} 
		

		
	 	
	
	
	}
}
