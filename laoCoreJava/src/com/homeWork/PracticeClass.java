package com.homeWork;



public class PracticeClass {

	public Integer collectAmount=1000;

	public void collectAmount() {
		System.out.println("Daddy have collected rupees " +collectAmount);
	}

	public Integer collectAmountAndGaveItToMe() {
		
		return collectAmount;
	}

	public static void main(String[] args) {

		PracticeClass mySon = new PracticeClass();
		mySon.collectAmount();
		Integer amountAndGaveItToMe = mySon.collectAmountAndGaveItToMe();
		System.out.println(amountAndGaveItToMe);

	}
}