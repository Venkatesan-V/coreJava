package z69CollectorsLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ToUnModListEx {

	
public static void main(String[] args) {
		
		List<String> names = Arrays.asList("WilliamWright", "JosephVijay", "Rajinikanth", "KamalHassan");
		
//	using methodReference:
		List<Integer> collect1 = names.stream().map(String::length).collect(toUnmodifiableList());
		System.out.println(collect1);
		System.out.println("==================");
//	using lambda Exp:
		List<Integer> collect2 = names.stream().map(name->name.length()).collect(toUnmodifiableList());
		System.out.println(collect2);
		
//		Manipulation:
		collect2.add(14);
		System.out.println(collect2);
		
		
		
	}
}
