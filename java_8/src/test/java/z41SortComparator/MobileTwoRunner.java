package z41SortComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import z41SortComparator.MobileTwo.Brand;

public class MobileTwoRunner {
	
	public static List<MobileTwo> phoneList=null;

	public static void main(String[] args) {

		MobileTwo mobile10 = new MobileTwo(Brand.APPLE, "14 Pro", 512, 55000, 16, 15.5, "black");
		MobileTwo mobile20 = new MobileTwo(Brand.SAMSUNG, "15 Pro", 256, 45000, 16, 15.5, "white");
		MobileTwo mobile30 = new MobileTwo(Brand.REALME, "16 Pro", 512, 35000, 16, 15.5, "black");
		MobileTwo mobile40 = new MobileTwo(Brand.MOTO, "17 Pro", 256, 25000, 16, 15.5, "white");
		MobileTwo mobile50 = new MobileTwo(Brand.GOOGLE, "18 Pro", 256, 15000, 16, 15.5, "black");
		MobileTwo mobile60 = new MobileTwo(Brand.ONEPLUS, "19 Pro", 512, 5000, 16, 15.5, "white");
		MobileTwo mobile70 = new MobileTwo(Brand.NOKIA, "20 Pro", 256, 65000, 16, 15.5, "black");

		phoneList= Arrays.asList(mobile10, mobile20, mobile30, mobile40, mobile50, mobile60, mobile70);
		displayMob();
//		lowToHigh();
		HighTolow();
	}

	public static void displayMob() {
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (MobileTwo phone : phoneList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					phone.getBrand(),phone.getModel(),phone.getMemory(),phone.getMegapixel(),phone.getPrice());
		}
	}
	
	public static void lowToHigh() {
		
		Collections.sort(phoneList, new SortByPriceLowToHigh());
		
		System.out.println("==========After sorting through Comparator==========");
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (MobileTwo phone : phoneList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					phone.getBrand(),phone.getModel(),phone.getMemory(),phone.getMegapixel(),phone.getPrice());
		}

	}
	public static void HighTolow() {
		
		Collections.sort(phoneList, new SortByPriceHighToLow());
		
		System.out.println("==========After sorting through Comparator==========");
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (MobileTwo phone : phoneList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					phone.getBrand(),phone.getModel(),phone.getMemory(),phone.getMegapixel(),phone.getPrice());
		}

	}
	
	
}
