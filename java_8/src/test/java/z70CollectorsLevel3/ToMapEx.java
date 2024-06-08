package z70CollectorsLevel3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapEx {

	public static void main(String[] args) {
		
		List<String> actors = Arrays.asList("WilliamWright", "JosephVijay", "Rajinikanth", "KamalHassan", "AjithKumar");
		
		Map<String, Integer> collect = actors.stream().collect(Collectors.toMap
				(name->name, String::length));
		System.out.println(collect);
//		keyMapper and valueMapper are Function interface
		System.out.println("=======Next========");
		Map<String, Integer> collect1 = actors.stream().collect(Collectors.toMap
				(Function.identity(), String::length));
		System.out.println(collect1);
		System.out.println("=======Next========");
		
//	How to handle duplicates
		List<String> kollyactors = Arrays.asList("Vijay","Rajini","Kamal","Ajith", "Vijay", "vijay");
		Map<String, Integer> kactors = kollyactors.stream().collect(Collectors.toMap
				(Function.identity(), String::length, (act1,act2)->act1));
		System.out.println(kactors);
		
	}
}
