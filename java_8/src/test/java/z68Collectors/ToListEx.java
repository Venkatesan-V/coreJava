package z68Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("WilliamWright", "JosephVijay", "Rajinikanth", "KamalHassan", "AjithKumar");
		
		List<Integer> collect1 = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(collect1);
		System.out.println("==================");
		List<Integer> collect2 = names.stream().map(name->name.length()).collect(Collectors.toList());
		System.out.println(collect2);
		
//		Manipulation:
		collect2.add(14);
		System.out.println(collect2);
		
		
		
	}
}
