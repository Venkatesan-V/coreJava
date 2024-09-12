package z22andThenCompose;

import java.util.function.Function;

public class AndThenCompose {

	public static void main(String[] args) {
		
		Function<String, String> tenth= (study)-> {
			System.out.println("first finish 10th std");
			return "";
		};
		
		Function<String, String> eleventh= (study)-> {
			System.out.println("second finish 11th std");
			return "";
		};
		
		tenth.apply("study");
		eleventh.apply("");
		
//		tenth.andThen(eleventh).apply("study");
		System.out.println("***********************************");
//		tenth.compose(eleventh).apply("");

	}
	
}
