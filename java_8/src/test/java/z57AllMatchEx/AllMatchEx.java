package z57AllMatchEx;

import java.util.Arrays;
import java.util.List;

public class AllMatchEx {

public static void main(String[] args) {
		
		List<String> status = Arrays.asList("silent", "silent", "silent");
		boolean result = status.stream().allMatch(string->string.equalsIgnoreCase("silent"));
		System.out.println(result);
		
		List<String> status1 = Arrays.asList("silent", "silent", "shout");
		boolean result1 = status1.stream().allMatch(string->string.equalsIgnoreCase("silent"));
		System.out.println(result1);
	}
}
