package com.z14.conditionalStatements;

public class IfElseStatement {

	boolean isCupEmpty=true;
	
	public static void main(String[] args) {
		
		IfElseStatement coffee= new IfElseStatement();
		
		if(coffee.isCupEmpty) {
			System.out.println("Fill the coffee");
		} else {
			System.out.println("Have the coffee");
		}
		
	}
}
