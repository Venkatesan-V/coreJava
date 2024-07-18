package com.z24.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empMap= new HashMap<Integer, String>();
//		Insert an element
		empMap.put(0, "ashok");
		empMap.put(1, "bobby");
		empMap.put(2, "catherine");
		empMap.put(3, "dennies");
		empMap.put(4, "escobar");
		empMap.put(5, "franklin");
		empMap.put(6, "george");
		System.out.println("Employee Map " +empMap);
		
//		To make a copy of existing Map
		
		Map<Integer, String> dupMap = new HashMap<Integer, String>();
		dupMap.putAll(empMap);
		System.out.println("Duplicate Map " +dupMap);
//		Clear Map contents
		dupMap.clear();
		System.out.println("After Clear " +dupMap);
//		To check if a Key is present or not in the Map
		System.out.println("Key presence is " +empMap.containsKey(7));
//		To check if a Value is present or not in the Map
		System.out.println("Value presence is " +empMap.containsValue("george"));
//		Clone the Map (does same as putAll, creates dup copy)
		System.out.println(empMap.clone());
//		To check if the Map is empty
		System.out.println("Map isEmpty " +empMap.isEmpty());
//		To fetch the set of keys in the Map
		System.out.println("Only keys " +empMap.keySet());
//		To fetch a Value
		System.out.println("Fetch index value " +empMap.get(1));
//		To fetch all Values
		System.out.println("Fetch all values " +empMap.values());
//		To entry Set
		System.out.println("Entry set from Map " +empMap.entrySet());
		
	}
}
