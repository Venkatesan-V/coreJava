package com.z14.conditionalStatements;

public class SwitchCaseEx {

	String fruit= "grapes";

	public void identifyFruit () {
		switch(fruit) {
		case "dog": System.out.println("dog is not a fruit");
		break;

		case "duck": System.out.println("duck is not a fruit");
		break;
		
		case "elephant": System.out.println("elepant is not a fruit");
		break;
		
		case "grapes": System.out.println("grapes is a fruit");
		break;
		
		default : System.out.println("fruit is not available");
		
		}
	}
	public static void main(String[] args) {

		SwitchCaseEx sCase= new SwitchCaseEx();
		sCase.identifyFruit();
		
	}
}
