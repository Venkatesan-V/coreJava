package com.z13.javaConstructors;

public class EmployeeNoArgumentConst {

	String empName;
	int empID;
	
	public EmployeeNoArgumentConst () {
		empName = "Arjun";
		empID = 26611;
		System.out.println("Constructor is called first");
	}
	public static void main(String[] args) {
		
		EmployeeNoArgumentConst empdetails = new EmployeeNoArgumentConst();
		
		System.out.println(empdetails.empName);
		System.out.println(empdetails.empID);
		
	}
}
