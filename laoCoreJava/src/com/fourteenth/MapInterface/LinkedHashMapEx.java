package com.fourteenth.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> linkHashMap = new LinkedHashMap<String, String>();
		
		linkHashMap.put("A", "apple");
		linkHashMap.put("F", "foxtrot");
		linkHashMap.put("B", "banana");
		linkHashMap.put("E", "elephant");
		linkHashMap.put(null, "camel");
		linkHashMap.put(null, "zebra");
				
		System.out.println(linkHashMap);
		
		HashMap<String, String> alphaMap= new HashMap<String, String>();
		
		alphaMap.put("A", "apple");
		alphaMap.put("F", "foxtrot");
		alphaMap.put("B", "banana");
		alphaMap.put("E", "elephant");
		alphaMap.put(null, "carrot");
		alphaMap.put(null, "dolphin");
		
		System.out.println(alphaMap);
		
	}
}
