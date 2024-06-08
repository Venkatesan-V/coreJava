package z64ReduceExample;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {

	public static void main(String[] args) {
		
		List<Integer> numb = Arrays.asList(1,4,7,2,5,8,3,6,9);
		
		Integer result = numb.stream().reduce(0,(sum,element)->sum+element);
		System.out.println(result);
		
		Integer result1 = numb.stream().reduce(1,(sum,element)->sum*element);
		System.out.println(result1);
		
		
	}
}
