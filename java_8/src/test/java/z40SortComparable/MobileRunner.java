package z40SortComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import z40SortComparable.Mobile.Brand;

public class MobileRunner {

	public static List<Mobile> mobileList=null;

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile(Brand.APPLE, "14 Pro", 512, 55000, 16, 15.5, "black");
		Mobile mobile2 = new Mobile(Brand.SAMSUNG, "15 Pro", 256, 45000, 16, 15.5, "white");
		Mobile mobile3 = new Mobile(Brand.REALME, "16 Pro", 512, 35000, 16, 15.5, "black");
		Mobile mobile4 = new Mobile(Brand.MOTO, "17 Pro", 256, 25000, 16, 15.5, "white");
		Mobile mobile5 = new Mobile(Brand.GOOGLE, "18 Pro", 256, 15000, 16, 15.5, "black");
		Mobile mobile6 = new Mobile(Brand.ONEPLUS, "19 Pro", 512, 5000, 16, 15.5, "white");
		Mobile mobile7 = new Mobile(Brand.NOKIA, "20 Pro", 256, 65000, 16, 15.5, "black");

		mobileList= Arrays.asList(mobile1, mobile2, mobile3, mobile4, mobile5, mobile6, mobile7);
		displayMob();
		lowToHigh();
	}

	public static void displayMob() {
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (Mobile mobile : mobileList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}
	}
	
	public static void lowToHigh() {
		Collections.sort(mobileList);
		System.out.println("==========After sorting through Comparable==========");
		System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
				"BRAND","MODEL","MEMORY","CAMERA","PRICE");
		for (Mobile mobile : mobileList) {
			System.out.printf("| %-15s | %-10s | %-10s | %-10s | %-10s |%n",
					mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());
		}

	}
}