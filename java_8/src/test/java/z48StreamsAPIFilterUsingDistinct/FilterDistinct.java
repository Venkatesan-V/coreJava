package z48StreamsAPIFilterUsingDistinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDistinct {

	public static void main(String[] args) {
		
	
	List<String> fruits= Arrays.asList("Apple", "banana", "grapes", "Apple");
	
//	m-1
	
	fruits = fruits.stream().distinct().collect(Collectors.toList());
	System.out.println(fruits);
	
//	m-2
	fruits.stream().distinct().forEach(System.out::println);
	
}
}