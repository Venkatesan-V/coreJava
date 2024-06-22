package com.eleventh.ExceptionHandling;

public class FinallyWithThreadDead {

	public static void main(String[] args) {

//		System.out.println(2/0);

		try { 
			System.out.println("Inside try block");
//			System.exit(0);
			System.out.println(2/0);

		}catch (Exception e) { 
			System.out.println("Inside catch block"); 
		}
		
		
		finally { 
			System.out.println("Inside finally block"); 
		}
		
		
// When thread has exception, finally block is not executed.


	}
}
