package z42SortIntegerOverflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import z42SortIntegerOverflow.MobileThree.Brand;



public class MobileThreeRunner {

	public static List<MobileThree> phonList=null;

	public static void main(String[] args) {

		MobileThree mobile101 = new MobileThree(Brand.APPLE, "14 Pro", 512, Integer.MIN_VALUE, 16, 15.5, "black");
		MobileThree mobile201 = new MobileThree(Brand.SAMSUNG, "15 Pro", 256, Integer.MAX_VALUE, 16, 15.5, "white");
		
		phonList= Arrays.asList(mobile101, mobile201);
		displayMob();
//		lowToHigh();

	}
	public static void displayMob() {
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (MobileThree phone : phonList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					phone.getBrand(),phone.getModel(),phone.getMemory(),phone.getMegapixel(),phone.getPrice());
		}
	}
	public static void lowToHigh() {
		
		Collections.sort(phonList, new SortByPriceLowToHigh1());
		
		System.out.println("==========After sorting through Comparator==========");
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (MobileThree phone : phonList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					phone.getBrand(),phone.getModel(),phone.getMemory(),phone.getMegapixel(),phone.getPrice());
		}

	}
}
