package z55FlatMapFunctionEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFuncExample {

	public static void main(String[] args) {
		
		List<String> alpha1 = Arrays.asList("A","B","C");
		List<String> alpha2 = Arrays.asList("D","E","F");
		List<String> alpha3 = Arrays.asList("G","H","I");
		
		List<List<String>> listOne = Arrays.asList(alpha1, alpha2, alpha3);
		System.out.println(listOne);
		
	List<String> singleList = listOne.stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
	
	System.out.println(singleList);
	
	}
}
