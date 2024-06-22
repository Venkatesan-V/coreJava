package com.fourteenth.MapInterface;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<String, String> places = new TreeMap<String, String>();
		places.put("OFT", "Trichy");
		places.put("HAPP", "Trichy");
		places.put("BHEL", "Trichy");
		places.put("SARATHAS", "Trichy");
		places.put("Trichy", "Pothys");
		places.put("Trichy", "Nalli");
		places.put(null, "Nalli");
		
		System.out.println(places);
		
		
		
	}
}
