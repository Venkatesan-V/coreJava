package com.lao.arrays;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList <String> fruitList = new LinkedList<String>();
		fruitList.add("apple");
		fruitList.add("grapes");
		fruitList.add("banana");
		fruitList.add("orange");
		fruitList.add("pomegranate");
		fruitList.add("orange");

		System.out.println(fruitList);
		fruitList.addFirst("jackfruit");
		fruitList.addLast("Mango");
		System.out.println(fruitList);
		
		System.out.println("My first fruit is " +fruitList.getFirst());
		System.out.println("Fruit position " +fruitList.get(1)); // in index method apple is at 1
		System.out.println("My last fruit is " +fruitList.getLast());
		
		fruitList.removeFirst();
		System.out.println("Remove first fruit " +fruitList);
		fruitList.removeLast();
		System.out.println("Remove last fruit " +fruitList);
		
		fruitList.poll();
		System.out.println("It removes first ele " +fruitList);
		fruitList.pollFirst();
		System.out.println("It removes first ele from current list " +fruitList);
		fruitList.pollLast();
		System.out.println("It removes last ele from current list " +fruitList);
		
		fruitList.removeFirstOccurrence("banana");
		fruitList.removeLastOccurrence("pomegranate");
		System.out.println(fruitList);
		
		
		
	}
}
