package z68Collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToCollectionEx {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Surya","JosephVijay","Rajinikanth","KamalHassan","AjithKumar");
		
		List<String> result = names.stream().filter(name->name.length()>10).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(result);
		
		List<String> result1 = names.stream().filter(name->name.length()<10).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(result1);
		
		
	}
}
