package z31biPredicateExample;

import java.util.function.BiPredicate;

public class Runner {

//	Requirement:
//	lastname should not be empty;
//	check equality of two given strings;
//	check equality ignore case sensitivity;

	public static void main(String[] args) {

//	lastname should not be empty;

		BiPredicate<String, String> pred1 = (fName,lName) -> {
			return lName.length()>0;		
		};

		System.out.println(pred1.test("venkat", "eve"));
		System.out.println("=============================");
		
//	check equality of two given strings;
		
		BiPredicate<String, String> pred2 = (string1, string2) -> {
			return string1.equals(string2);		
		};

		System.out.println(pred2.test("venkat", "VENKAT"));
		System.out.println("=============================");

//	check equality ignore case sensitivity;
		BiPredicate<String, String> pred3 = (string1, string2) -> {
			return string1.equalsIgnoreCase(string2);		
		};

		System.out.println(pred3.test("venkat", "VENKAT"));
		System.out.println("=============================");
		
		
		
	}
}