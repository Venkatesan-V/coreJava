package com.tweleth.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {

		List <String> listOf = new ArrayList<String>();
		listOf.add("apple");
		listOf.add("grapes");
		listOf.add("banana");
		listOf.add("orange");
		listOf.add("pomegranate");
		listOf.add("orange");

		System.out.println(listOf);
		System.out.println(listOf.get(3));
		System.out.println("First Orange position is " +listOf.indexOf("orange"));
		System.out.println("Last Orange position is " +listOf.lastIndexOf("orange"));
		System.out.println(listOf.indexOf("papaya"));

		List <String> listOff = new ArrayList<String>();
		listOff.addAll(listOf);
		System.out.println(listOff);
		listOff.clear();
		System.out.println(listOff);

		listOf.remove(3); // remove by index
		System.out.println(listOf);
		listOf.remove("orange");
		System.out.println(listOf);
		listOf.add(null);
		System.out.println(listOf);

		listOf.set(4, "oranges");
		System.out.println(listOf);

		System.out.println(listOf.isEmpty());

		//		How to Iterate (Pick unique data)
		System.out.println("============Using ForLoop==============");
		for(int i=0; i<listOf.size();i++) {
			System.out.println("Using forLoop " +listOf.get(i));
		}
		System.out.println("============Using ForEach==============");

		for (String fruit : listOf) {
			System.out.println("Using forEach " +fruit);
		}
		
		System.out.println("============Using List Iterator==============");
		
			System.out.println("======Forward======");
		
		ListIterator<String> iteratorfruit = listOf.listIterator();
		while (iteratorfruit.hasNext()) {
			System.out.println(iteratorfruit.next());
		}
		System.out.println("======Reverse======");
		while (iteratorfruit.hasPrevious()) {
			System.out.println(iteratorfruit.previous());
		}
		
		System.out.println("============Using Iterator==============");
		Iterator<String> iteratefruit = listOf.listIterator();
		while (iteratefruit.hasNext()) {
			System.out.println(iteratefruit.next());
		}
		
	}
}