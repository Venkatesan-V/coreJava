package z50StreamsAPILimitFunction;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		countries.add("Russia");
		countries.add("America");
		countries.add("China");
		countries.add("India");
		
		countries.stream().limit(4)
		.forEach(System.out::println);
		
		System.out.println("=======END========");
		
		countries.stream().limit(100)
		.forEach(System.out::println);
		System.out.println("=======END========");
	}
}
