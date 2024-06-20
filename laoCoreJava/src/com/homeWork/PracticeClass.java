package com.homeWork;

public class PracticeClass {

	public Integer collectAmount=1000;
	
	public void collectAmount() {
		System.out.println("Daddy have collected rupees " +collectAmount);
	}
	
	
	public static void main(String[] args) {
		
		PracticeClass pClass=new PracticeClass();
		pClass.collectAmount();
		
		
	}	
}
