package com.lao.arrays;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
	    names.add("Alice");
	    names.add("Bob");

// Thread 1 (reading)
	    for (String name : names) {
	      System.out.println(name);
	    }

// Thread 2 (modifying)
	    names.add("Charlie");
	    System.out.println(names);

	    // Thread 1 will still only print "Alice" and "Bob"
	    // as it iterates over a snapshot of the list at its creation time.
		
		
	}
}
