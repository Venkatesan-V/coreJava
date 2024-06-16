package com.lao.staticMethods;

public class StaticVariablesEx {

	static int accountBal=0;
	String depositedBy;
	
	public static void main(String[] args) {
		
		StaticVariablesEx person= new StaticVariablesEx();
		person.accountBal=1000;
		person.depositedBy="Ashok";
		
		StaticVariablesEx personOne= new StaticVariablesEx();
		personOne.accountBal=2000;
		personOne.depositedBy="Dhoni";
		
		System.out.println("first Person " +person.accountBal);
		System.out.println("first Person " +person.depositedBy);
		System.out.println("second Person " +personOne.accountBal);
		System.out.println("second Person " +personOne.depositedBy);
		
//		accountBal of last person will be executed due to static keyword
	}
}
