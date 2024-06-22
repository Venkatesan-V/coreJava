package com.tweleth.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		
	
	List listOfDataType = new ArrayList();
	listOfDataType.add("apple");
	listOfDataType.add(100);
	listOfDataType.add(987654321l);
	listOfDataType.add('H');
	listOfDataType.add(1.95f);
	

	System.out.println(listOfDataType);
//	Without Generic is not recommended
}
}