package com.lao.abstraction;

public class Bmw extends CarClass {

	public void companyVault () {
		System.out.println("Bmw company vault");
	}
	@Override
	public void engineSecret() {
		System.out.println("Bmw engine spec");
		
	}
	public static void main(String[] args) {
		CarClass car=new Bmw();
		
		car.engineSecret();
		car.companyVault();
		
		
	}

	
}
