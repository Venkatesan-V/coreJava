package com.z19.abstraction;

public class Employee implements Iemployees {
//	remove abstract to use the below method
	
	@Override
	public void salary() {
		System.out.println("salary credited");
	}

	@Override
	public void bankAccount() {
		System.out.println("HDFC account");
	}
	@Override
	public void floorManager() {
		System.out.println("manager one");
	}

	@Override
	public void fleetManager() {
		System.out.println("manager two");
	}
	
	@Override
	public void supervisor1() {
		System.out.println("super one");
		
	}

	@Override
	public void supervisor2() {
		System.out.println("super two");
		
	}
	

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary();
		emp.bankAccount();
		emp.fleetManager();
		emp.floorManager();
		emp.supervisor1();
		emp.supervisor2();
		
	}

	
}
