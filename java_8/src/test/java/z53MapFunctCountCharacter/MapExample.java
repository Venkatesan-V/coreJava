package z53MapFunctCountCharacter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

//	Requirement: Input: list of words
//	Output: number of chars from word
	
	public static void main(String[] args) {
		
	List<String> chara = Arrays.asList("administration", "encyclopedia", "environment");
	
	List<Integer> count = chara.stream()
			.map(String::length)
			.collect(Collectors.toList());
		count.forEach(System.out::println);
		
		
	}
}
