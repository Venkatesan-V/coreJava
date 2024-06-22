package com.eleventh.ExceptionHandling;

public class UnCheckedExceptionEx {

	static String name;
	
	public static void main(String[] args) {
		
		System.out.println(name.length());
		
	}
	
}
// Console output: Exception in thread "main" java.lang.NullPointerException: 
// Cannot invoke "String.length()" because "com.lao.ExceptionHandling.UnCheckedExceptionEx.name" is null
// at laoCoreJava/com.lao.ExceptionHandling.UnCheckedExceptionEx.main(UnCheckedExceptionEx.java:9)
