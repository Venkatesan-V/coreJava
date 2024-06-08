package z69CollectorsLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.*;

public class ToUnModSetEx {

	public static void main(String[] args) {


		List<String> names = Arrays.asList("WilliamWright","JosephVijay","Rajinikanth","KamalHassan","JosephVijay");

		Set<String> dupRemove = names.stream().collect(toUnmodifiableSet());
		System.out.println("Level 1: " +dupRemove);
//	manipulation:
		dupRemove.add("surya");
		System.out.println("Level 2: " +dupRemove); // will return Exception
	}
}