package com.z14fourth.conditionalStatements;

public class IfelseIfstatement {

	String myDirector="Quentin Tarantino";
	
	public void guessMyDirector() {
		if(myDirector.equals("Martin Scorsese")) {
			System.out.println("He is my father of direction");
		} else if (myDirector.equals("Christopher Nolan")) {
			System.out.println("He is my teacher of direction");
		} else if (myDirector.equals("Kubrick")) {
			System.out.println("He is my inspiration of direction");
		} else {
			System.out.println("My director is not available");
		}
	}
	
	public static void main(String[] args) {
		
		IfelseIfstatement ifelseif= new IfelseIfstatement();
		ifelseif.guessMyDirector();
	}
}
