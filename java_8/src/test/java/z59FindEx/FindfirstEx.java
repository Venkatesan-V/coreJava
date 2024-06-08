package z59FindEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindfirstEx {

	public static void findFirstEx() {
		List<String> element = Arrays.asList("one", "two", "three", "four");
		Optional<String> findFirst = element.stream().findFirst();
		System.out.println(findFirst.get());
	}
	public static void findFirstParaEx() {
		List<String> element = Arrays.asList("one", "two", "three", "four");
		Optional<String> findFirst = element.parallelStream().findFirst();
		System.out.println(findFirst.get());
	}
	
	public static void findAnyEx() {
		List<String> element = Arrays.asList("one", "two", "three", "four");
		Optional<String> findFirst = element.stream().findAny();
		System.out.println(findFirst.get());
	}
	public static void findAnyParaEx() {
		List<String> element = Arrays.asList("one", "two", "three", "four");
		Optional<String> findFirst = element.parallelStream().findAny();
		System.out.println(findFirst.get());
	}
	
	public static void main(String[] args) {
		findFirstEx();
		findFirstParaEx();
		findAnyEx();
		findAnyParaEx();
	}	
}

