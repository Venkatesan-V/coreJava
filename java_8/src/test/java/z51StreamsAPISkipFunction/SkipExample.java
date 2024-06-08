package z51StreamsAPISkipFunction;

import java.util.ArrayList;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		countries.add("Russia");
		countries.add("America");
		countries.add("China");
		countries.add("India");
		
		countries.stream().skip(2)
		.forEach(System.out::println);
		
		System.out.println("=======END========");
		
		countries.stream().skip(5)
		.forEach(System.out::println);
		System.out.println("=======END========");
		
		
		
		
	}
}
