package com.seventh.inheritance;

public class TataCarsEx extends CarEx {

	
	public static void main(String[] args) {
		
		TataCarsEx tata= new TataCarsEx();
		System.out.println("Number of wheels " +tata.wheels);
		tata.engineSpec();
	}
}
