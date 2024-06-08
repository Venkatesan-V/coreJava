package z34methodReferenceExample;

import java.util.function.Function;

public class Z36ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
		
//	Example-1
//		using lambda expression
		Function<String, String> lowerCase = (input) -> input.toLowerCase();
		System.out.println(lowerCase.apply("ADMIN"));
		
//		using method reference
		Function<String, String> lowerCases= String::toLowerCase;
		System.out.println(lowerCases.apply("EVERSHINE"));
		
//	Example-2
//		using lambda expression
		Function<String, Integer> lowerCasez = (input) -> input.length();
		System.out.println(lowerCasez.apply("ADMIN"));
		
//		using method reference
		Function<String, Integer> lowerCasezz= String::length;
		System.out.println(lowerCasezz.apply("EVERSHINE"));
	}
}
