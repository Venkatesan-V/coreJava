package com.tenth.Strings;

public class StringEx {

	public static void main(String[] args) {


		String names = " administration ";
		int number=7;

		System.out.println("Print character @ 1 is " +names.charAt(1));
		System.out.println("Print the length of String is "+names.length());
		System.out.println("is it same ? " +names.equals("admin"));
		System.out.println("is it same ? " +names.equalsIgnoreCase("ADMINISTRATION"));
		System.out.println("is it Empty " +names.isEmpty());
		System.out.println("does it contain? " +names.contains("admin"));
		System.out.println(names.substring(4));
		System.out.println(names.substring(0, 5)); //methodOverloading
		System.out.println(names.concat(" services"));
		System.out.println(names.replace("a", "A"));
		System.out.println(names.replace("admin", "ADMIN"));
		System.out.println("Placed at position " +names.indexOf("d"));
		System.out.println("Placed at position " +names.indexOf("a", 1)); //To find char a at next position
		System.out.println("Starts from position " +names.indexOf("min", 0));
//		indexOf is an methodOverloading
		System.out.println(names.trim());
		System.out.println(String.valueOf(number));
		System.out.println(names.toUpperCase());
		System.out.println(names.toLowerCase());
//		From Java-8
		System.out.println(String.join("-", "Anna", "Centenary", "Library"));
		System.out.println(String.join("/", "30", "05", "2024"));
		
		System.out.println("=======Next=======");
		
		String sentence = "I am going to library";
		String[] split = sentence.split(" ");
		for (String newVal : split) {
			System.out.println(newVal);
		}
	
	}
}