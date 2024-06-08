package z68Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetEx {

public static void main(String[] args) {
		
		List<String> names = Arrays.asList("WilliamWright","JosephVijay","Rajinikanth","KamalHassan","JosephVijay");
		
		Set<String> dupRemove = names.stream().collect(Collectors.toSet());
		System.out.println(dupRemove);

}
}