package com.first.javaObjectCreation;

public class BankAccount {

	Long accountnum= 9865321447789l;
	String accountHolder="Vijay Kumar";
	Integer accountBal=1500000;
	
	public void getBal () {
		System.out.println("Account Bal is " +accountBal);
	}
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.getBal();
		System.out.println(account.accountHolder);
		
		
		
	}
}
