package com.z12.javaReturnType;

public class CollectAmount {

	public Integer collectAmount=1000;
	
	public void collectAmount() {
		System.out.println("Daddy have collected rupees " +collectAmount);
	}
	
	public Integer collectAmountAndGaveItToMe() {
		System.out.println("Daddy have collected rupees " +collectAmount +" and sent it to you");
		return collectAmount;
	}
	
	public static void main(String[] args) {
		
		CollectAmount mySon = new CollectAmount();
		mySon.collectAmount();
		
		Integer collect = mySon.collectAmountAndGaveItToMe();
		System.out.println("Received " +collect);
		
		
	}
}
