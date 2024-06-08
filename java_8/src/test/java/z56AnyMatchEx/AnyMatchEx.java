package z56AnyMatchEx;

import java.util.Arrays;
import java.util.List;

public class AnyMatchEx {

	public static void main(String[] args) {
		
		List<String> status = Arrays.asList("silent", "silent", "shout");
		boolean result = status.stream().anyMatch(string->string.equalsIgnoreCase("shout"));
		System.out.println(result);
		
	}
}
