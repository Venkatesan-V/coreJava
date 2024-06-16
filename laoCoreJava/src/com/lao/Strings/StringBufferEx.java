package com.lao.Strings;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String myName = "venkatesan";
//		STRING IS IMMUTABLE
		System.out.println(myName.concat(" veeran"));
		System.out.println(myName);
		
//		STRINGBUFFER IS MUTABLE
		StringBuffer myNameFull = new StringBuffer("venkatesan");
		System.out.println(myNameFull.append(" veeran"));
		System.out.println(myNameFull);
		System.out.println("================STRINGBUFFER METHODS====================");
		
		System.out.println(myNameFull.reverse());
		
		StringBuffer fruitReplace = new StringBuffer("jackfruit");
		System.out.println(fruitReplace.replace(0, 4, "JACK"));
		
		StringBuffer heroDelete = new StringBuffer("bruceWayne");
		System.out.println(heroDelete.delete(0, 5));
		
		StringBuffer directorInsert = new StringBuffer(" Tarantino");
		System.out.println(directorInsert.insert(0, "Quentin"));
		
		System.out.println(directorInsert.capacity());
	}
}
