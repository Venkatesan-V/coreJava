package z58NoneMatch;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {
		
		List<String> status3 = Arrays.asList("sh", "sh", "sh");
		boolean result3 = status3.stream().noneMatch(string->string.equalsIgnoreCase("silent"));
		System.out.println(result3);
		
		List<String> status4 = Arrays.asList("silent", "silent", "shout");
		boolean result4 = status4.stream().noneMatch(string->string.equalsIgnoreCase("silent"));
		System.out.println(result4);
	}
}
