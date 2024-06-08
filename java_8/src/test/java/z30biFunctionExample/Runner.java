package z30biFunctionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Runner {

	public static void main(String[] args) {
		
//		Requirement: firstname, lastname ToPrint: fullname;
		
		BiFunction<String, String, String> fullName =
				(fname, lname)-> fname+" "+lname;
					
				System.out.println(fullName.apply("venkat", "evershine"));
				
//		Requirement: num1, num2 ToPrint: avg;	
				
		BiFunction<Integer, Integer, Number> avg= (num1, num2)-> (num1+num2)/2.0;
			System.out.println(avg.apply(40, 45));
			
//		Requirement: Bat, Super, Wonder combine with man, man, woman;
			
		List<String> list1 = Arrays.asList("Bat", "Super", "Wonder");
		List<String> list2 = Arrays.asList("man", "man", "woman");	
		
		List<String> supers= new ArrayList<String>();
		
		BiFunction<List<String>, List<String>, List<String>> jusLeague = (n1, n2)-> {
			for (int i=0; i<list1.size(); i++) {
				supers.add(list1.get(i)+list2.get(i));
			}
			return supers;
		};
		System.out.println(jusLeague.apply(list1, list2));
				
				
				
	}
}
