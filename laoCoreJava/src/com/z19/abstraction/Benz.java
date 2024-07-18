package com.z19.abstraction;

public class Benz extends CarClass {
	
	public void companyVault () {
		System.out.println("Benz company vault");
	}
	
	@Override
	public void engineSecret() {
		System.out.println("Benz engine spec");
		
	}
	public static void main(String[] args) {
		CarClass car=new Bmw();
		
		car.engineSecret();
		car.companyVault();
		
		
	}
}
